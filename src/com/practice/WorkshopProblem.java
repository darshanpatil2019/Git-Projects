package com.practice;

public class WorkshopProblem {

    static void primeNum() {

        int array1[] = new int[100];

        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");

            }
        }
    }


    public static void main(String[] args) {
        primeNum();
    }
}

