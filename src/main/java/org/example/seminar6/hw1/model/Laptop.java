package org.example.seminar6.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
    private String model;
    private String operatingSystem;
    private Integer screenSize;
    private Integer ram;
    private Integer driveSpace;
    private String color;


}
