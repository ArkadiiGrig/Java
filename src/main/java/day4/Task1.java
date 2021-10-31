package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] n = {4, 8, 9, 4, 6, 9, 2, 3, 5, 5};
        System.out.print(Arrays.toString(n));
        System.out.println();
        int length = n.length;
        System.out.println("Длина массива " + length);

        for (int x : n) {
            while (x > 8)
                System.out.println(x);
        }
    }
}