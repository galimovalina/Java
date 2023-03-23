package org.example.seminar6.hw1.model;

import java.util.List;
import java.util.Scanner;

public class Filter {
    /**
     * Метод, запрашивает у пользователя критерий фильтрации и выводит ноутбуки, отвечающие фильтру
     */
    public static void laptopFilter() {
        List<Laptop> laptopColl = LaptopsCollection.allLaptops();

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет\n 5 - Бренд");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Объем оперативной памяти:");
                Scanner scanner2 = new Scanner(System.in);
                int ramWanted = scanner2.nextInt();
                for (var entry : laptopColl) {
                    if (entry.getRam().equals(ramWanted)) {
                        System.out.println("Модель: " + entry.getModel() + ", Операционная система: " + entry.getOperatingSystem() +
                                ", Объем оперативной памяти: " + entry.getRam() + ", Цвет: " + entry.getColor());
                    }

                }
                break;
            case 2:
                System.out.println("Объем жесткого диска:");
                Scanner scanner3 = new Scanner(System.in);
                int driveWanted = scanner3.nextInt();
                for (var entry : laptopColl) {
                    if (entry.getDriveSpace().equals(driveWanted)) {
                        System.out.println("Модель: " + entry.getModel() + ", Операционная система: " + entry.getOperatingSystem() +
                                ", Объем оперативной памяти: " + entry.getRam() + ", Цвет: " + entry.getColor());
                    }
                }
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                Scanner scanner4 = new Scanner(System.in);
                String systemWanted = scanner4.nextLine();
                for (var entry : laptopColl) {
                    if (entry.getOperatingSystem().equals(systemWanted)) {
                        System.out.println("Модель: " + entry.getModel() + ", Операционная система: " + entry.getOperatingSystem() +
                                ", Объем оперативной памяти: " + entry.getRam() + ", Цвет: " + entry.getColor());
                    }
                }
                break;
            case 4:
                System.out.println("Введите цвет:");
                Scanner scanner5 = new Scanner(System.in);
                String colorWanted = scanner5.nextLine();
                for (var entry : laptopColl) {
                    if (entry.getColor().equals(colorWanted)) {
                        System.out.println("Модель: " + entry.getModel() + ", Операционная система: " + entry.getOperatingSystem() +
                                ", Объем оперативной памяти: " + entry.getRam() + ", Цвет: " + entry.getColor());
                    }
                }
                break;
            case 5:
                System.out.println("Введите бренд:");
                Scanner scanner6 = new Scanner(System.in);
                String modelWanded = scanner6.nextLine();
                for (var entry : laptopColl) {
                    if (entry.getModel().equals(modelWanded)) {
                        System.out.println("Модель: " + entry.getModel() + ", Операционная система: " + entry.getOperatingSystem() +
                                ", Объем оперативной памяти: " + entry.getRam() + ", Цвет: " + entry.getColor());
                    }
                }
        }

    }
}
