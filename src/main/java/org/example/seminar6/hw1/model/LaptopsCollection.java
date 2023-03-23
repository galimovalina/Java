package org.example.seminar6.hw1.model;

import java.util.ArrayList;
import java.util.List;

public class LaptopsCollection {
    public static List<Laptop> allLaptops() {
        Laptop laptop1 = new Laptop("Lenovo", "Windows", 14, 4, 128, "черный");
        Laptop laptop2 = new Laptop("ASUS", "Windows", 15, 12, 256, "серый");
        Laptop laptop3 = new Laptop("Acer", "Linux", 13, 5, 128, "белый");
        Laptop laptop4 = new Laptop("MacBook", "MacOS", 13, 8, 512, "белый");
        Laptop laptop5 = new Laptop("Huawei", "Linux", 15, 5, 256, "розовый");
        Laptop laptop6 = new Laptop("Lenovo", "Linux", 12, 4, 256, "синий");
        Laptop laptop7 = new Laptop("MacBook", "MacOS", 15, 12, 512, "черный");




        List<Laptop> laptopColl = new ArrayList<>();
        laptopColl.add(laptop1);
        laptopColl.add(laptop2);
        laptopColl.add(laptop3);
        laptopColl.add(laptop4);
        laptopColl.add(laptop5);
        laptopColl.add(laptop6);
        laptopColl.add(laptop7);


        return laptopColl;
    }

}
