package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Random ran = new Random();
        Scanner scan = new Scanner(System.in);
       int[] arrays = new int[scan.nextInt()];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = ran.nextInt(50);

            System.out.println("arrays[" + i + "]" + "=" + arrays[i]);
        }

    }
}
