package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {
  public void  testStorage(Shortener shortener){
      String str1 = "раз два три";
      String str2 = "ри два раз";
      String str3 = "раз два три";
      Long strID1 = shortener.getId(str1);
      Long strID2 = shortener.getId(str2);
      Long strID3 = shortener.getId(str3);
      String str1New = shortener.getString(strID1);
      String str2New = shortener.getString(strID2);
      String str3New = shortener.getString(strID3);
      Assert.assertEquals(str1,str1New);
      Assert.assertEquals(str2,str2New);
      Assert.assertEquals(str3,str3New);

      Assert.assertNotEquals(strID1,strID2);
      Assert.assertNotEquals(strID2,strID3);
      Assert.assertEquals(strID1,strID3);

  }
  @Test
  public void testHashMapStorageStrategy(){
      HashMapStorageStrategy hashMapStorageStrategy = new HashMapStorageStrategy();
      Shortener shortener = new Shortener(hashMapStorageStrategy);
      testStorage(shortener);
  }
  @Test
  public void testOurHashMapStorageStrategy(){
      OurHashMapStorageStrategy  ourHashMapStorageStrategy = new OurHashMapStorageStrategy();
      Shortener shortener = new Shortener(ourHashMapStorageStrategy);
      testStorage(shortener);
  }
  @Test
    public void  testFileStorageStrategy(){
      FileStorageStrategy fileStorageStrategy = new FileStorageStrategy();
      Shortener shortener = new Shortener(fileStorageStrategy);
      testStorage(shortener);
  }
  @Test
    public void testHashBiMapStorageStrategy(){
      HashBiMapStorageStrategy hashBiMapStorageStrategy = new HashBiMapStorageStrategy();
      Shortener shortener = new Shortener(hashBiMapStorageStrategy);
      testStorage(shortener);
  }
  @Test
    public void testDualHashBidiMapStorageStrategy(){
      DualHashBidiMapStorageStrategy dualHashBidiMapStorageStrategy = new DualHashBidiMapStorageStrategy();
      Shortener shortener = new Shortener(dualHashBidiMapStorageStrategy);
      testStorage(shortener);
  }
  @Test
    public void testOurHashBiMapStorageStrategy(){
      OurHashMapStorageStrategy ourHashMapStorageStrategy = new OurHashMapStorageStrategy();
      Shortener shortener = new Shortener(ourHashMapStorageStrategy);
      testStorage(shortener);
  }
}
