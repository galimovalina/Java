package org.example.seminar6.model;

public class Farengeit implements Converter {
    @Override
    public Double convertValue(Double input) {
        return input * 1.8 + 32;
    }
}
