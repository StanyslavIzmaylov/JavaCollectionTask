package com.javarush.task.task20.task2028;

import java.io.Closeable;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }
    @Override
    public void forEach(Consumer<? super String> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return super.spliterator();
    }

    @Override
    public Stream<String> stream() {
        return super.stream();
    }

    @Override
    public Stream<String> parallelStream() {
        return super.parallelStream();
    }

    @Override
    public int size() {
        return 0;
    }


    @Override
    public boolean removeIf(Predicate<? super String> filter) {
        return super.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator<String> operator) {
        super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super String> c) {
        super.sort(c);
    }
     static class Entry<T>implements Serializable{
         String elementName;
         boolean availableToAddLeftChildren, availableToAddRightChildren;
         Entry<T> parent, leftChild, rightChild;

         public Entry(String elementName) {
             this.elementName = elementName;
             availableToAddLeftChildren = true;
             availableToAddRightChildren = true;
         }
         public boolean isAvailableToAddChildren(){
            return availableToAddLeftChildren || availableToAddRightChildren;
         }
     }
}
