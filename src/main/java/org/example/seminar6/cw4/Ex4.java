package org.example.seminar6.cw4;

import org.example.seminar6.model.Celsius;
import org.example.seminar6.model.Farengeit;
import org.example.seminar6.model.Kelvin;

/**
 * 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class Ex4 {
    public static void main(String[] args) {
        double tCels = 100;
        System.out.println(new Farengeit().convertValue(tCels));
        System.out.println(new Kelvin().convertValue(tCels));
        System.out.println(new Celsius().convertValue(tCels));
    }
}
