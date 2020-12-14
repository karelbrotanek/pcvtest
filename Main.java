package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> pole1 = new ArrayList<Integer>(100);
        ArrayList<Integer> pole2 = new ArrayList<Integer>(50);
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            pole1.add(r.nextInt(100));
        }
        for (int i = 0; i < 50; i++) {
            pole2.add(r.nextInt(100));
        }
        if (pole1.size() != pole2.size()){
            System.out.println("pole nejsou stejná");
            int p1 = pole1.size();
            for (int i = pole2.size(); i <p1; i++) {
                pole1.remove(pole1.size()-1);
            }
        }
        //System.out.println(pole1.size());
        //System.out.println(pole2.size());
        for (int i = 0; i < pole1.size(); i++) {
            pole1.set(i,pole2.get(i));
        }
        int stejnapole = 1;
        if (pole1.size() != pole2.size()){
            stejnapole = 0;
        }
        else {
            for (int i = 0; i < pole1.size(); i++) {
                if (pole1.get(i) != pole2.get(i)){
                    stejnapole = 0;
                }
            }
        }
        if (stejnapole == 1){
            System.out.println("pole jsou stejná");
        }
        else {
            System.out.println("pole nejsou stejná");
        }
    }
}
