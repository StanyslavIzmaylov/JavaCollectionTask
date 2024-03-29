package com.javarush.task.task39.task3911;

import java.util.*;

public class Software {
    private int currentVersion;

    private Map<Integer, String> versionHistoryMap = new LinkedHashMap<>();

    public void addNewVersion(int version, String description) {
        if (version > currentVersion) {
            versionHistoryMap.put(version, description);
            currentVersion = version;
        }
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public Map<Integer, String> getVersionHistoryMap() {
        return Collections.unmodifiableMap(versionHistoryMap);
    }

    public boolean rollback(int rollbackVersion) {
        if (!versionHistoryMap.containsKey(rollbackVersion)){
            return false;
        }
        boolean deleteEntries = false;
        List<Integer> listOfEntriesToBeRemoved = new ArrayList<Integer>();

        // Determine entries to be deleted
        for (Integer currentKey : versionHistoryMap.keySet()) {
            if(deleteEntries) {
                listOfEntriesToBeRemoved.add(currentKey);
            } else {
                if(rollbackVersion == currentKey) {
                    // Do not remove the current entry
                    deleteEntries = true;
                }
            }
        }
        // Removed selected entries
        for (Integer currentKey : listOfEntriesToBeRemoved) {
            versionHistoryMap.remove(currentKey);
        }
        currentVersion = rollbackVersion;
        return true;
    }
}
