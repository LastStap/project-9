package org.example;
public class Main {
    public static void main(String[] args) {
        int [] array1 = {12, 234, 56, 789, 930475389};
        for (int j : array1) {
            if ((j % 2) == 0) {
                System.out.println(j);
            }
        }
    }
}