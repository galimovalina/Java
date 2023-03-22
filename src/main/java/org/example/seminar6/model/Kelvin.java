package org.example.seminar6.model;

public class Kelvin implements Converter {
    @Override
    public Double convertValue(Double input) {
        return input + 273.15;
    }
}
