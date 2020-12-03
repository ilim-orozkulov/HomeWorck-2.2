package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(backHome(21, 12));
        System.out.println(backHome(25, 15));
        System.out.println(backHome(46, -40));
        System.out.println(backHome(22, 13));
        System.out.println(backHome(24, 9));
    }

    public static boolean backHome(int age, int temperature) {

        String a = "Можно идти гулять";
        String b = "Остовайтесь дома";

        if (age >= 20 && age <= 45 && temperature >= -10 && temperature <= 30) {
            System.out.println(a);
        } else if (age >= 15 && age <= 30 && temperature >= -20 && temperature <= 20) {
            System.out.println(a);
        } else if (age > 45 && age < 50 && temperature >= -40) {
            System.out.println(b);
        }

        return true;
    }
}



