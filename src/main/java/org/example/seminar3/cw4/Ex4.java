package org.example.seminar3.cw4;

import org.example.seminar3.cw3.model.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */
public class Ex4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(4, "желтый", "металлический");
        Cube cube3 = new Cube(3, "красный", "деревянный");
        Cube cube4 = new Cube(3, "красный", "деревянный");
        Cube cube5 = new Cube(3, "красный", "деревянный");
        Cube cube6 = new Cube(5, "зеленый", "картонный");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);
        listCube.add(cube5);
        listCube.add(cube6);
        System.out.println("коллекция "+ listCube);
        System.out.println("уникальная коллекция: "+unicumCollections(listCube));
    }

    private static Collection<Cube> unicumCollections(List<Cube> listCube) {
        return new HashSet<>(listCube);
    }
}
