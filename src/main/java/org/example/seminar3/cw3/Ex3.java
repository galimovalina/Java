package org.example.seminar3.cw3;

import org.example.seminar3.cw3.model.Cube;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(4, "желтый", "металлический");
        Cube cube3 = new Cube(3, "красный", "деревянный");
        Cube cube4 = new Cube(5, "зеленый", "картонный");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);

        int sumYellow=0;
        int sumSize=0;
        int sumWood3=0;

        for (Cube cube: listCube) {
            if(cube.getColour().equals("желтый")){
                sumYellow++;
                sumSize+= volumeCube(cube.getSize());
            }
            if(cube.getMaterial().equals("деревянный") && cube.getSize()==3){
                sumWood3++;
            }
        }
        System.out.println(sumYellow);
        System.out.println(sumSize);
        System.out.println(sumWood3);

    }

    private static int volumeCube(Integer size) {
        return size*size*size;
    }
}
