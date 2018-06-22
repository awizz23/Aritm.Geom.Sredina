package aritmeticka.geomet.sredina;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class AritmetickaGeometSredina {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj brojeva za ispis: ");
        int br = input.nextInt();
        int count = 0;
        int n = 99;
        int k = 289;
        int suma = 0;
        int p = 1;
        int i;

        Random randomGenerator = new Random();
        for (i = 0; i <= br; i++) {
            int randomint = randomGenerator.nextInt(k + 1 - n) + n;
            System.out.println(i + ". " + randomint);
            suma = suma + randomint;
            p = p * randomint;
            count = count + 1;
        }
        double as = suma / count;
        double gs = Math.pow(p, 1/count);

        System.out.println("Aritmetička sredina iznosi: " + as);
        System.out.println("Geomatrijska sredina iznosi: " + gs);

    }

}
