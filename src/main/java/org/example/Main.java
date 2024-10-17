package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {12, 234, 56, 789, 930475389};
        for (int j : array1) {
            if ((j % 2) == 0) {
                System.out.println(j);
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву: ");

        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < length; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();

            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }
}