package com.javarush.task.task33.task3305;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS,
        include = As.PROPERTY,
        property = "className")
        @JsonSubTypes({
        @JsonSubTypes.Type(value = ParkingLot.class, name = ".ParkingLot"),
                @JsonSubTypes.Type(value = RacingBike.class, name = "com.javarush.task.task33.task3305.RacingBike"),
                @JsonSubTypes.Type(value = Motorbike.class, name = "com.javarush.task.task33.task3305.Motorbike"),
                @JsonSubTypes.Type(value = Car.class, name = "com.javarush.task.task33.task3305.Car")
})
public class ParkingLot {

    public String name;
    public String city;
    public List<Vehicle> vehicles;

    public ParkingLot(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}