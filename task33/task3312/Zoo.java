package com.javarush.task.task33.task3312;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;



import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animals = new ArrayList<>();
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "type")
    @JsonSubTypes({
    @JsonSubTypes.Type(value = Zoo.Dog.class, name = "dog"),
    @JsonSubTypes.Type(value = Zoo.Cat.class, name = "cat")})
    public static class Animal {
        public Animal(String name) {
            this.name = name;
        }

        public String name;
    }
    @JsonTypeName
    public static class Dog extends Animal {

        public double barkVolume;

        public Dog(String name) {
            super(name);
        }
    }
    @JsonTypeName
    public static class Cat extends Animal {
        boolean likesCream;
        public int lives;

        public Cat(String name) {
            super(name);
        }
    }
}