package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] scores = new int[n];

        int[] cats = new int[10];

        for (int j = 0; j < cats.length; j++) {
            cats[j] = 0;
        }

        int winner = -1;
        int maxScore = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            cats[scores[i] - 1]++;
        }

        for (int p = cats.length - 1; p >= 0; p--) {
            if (cats[p] >= maxScore) {
                winner = p+1;
                maxScore = cats[p];
            }
        }
        System.out.println(winner);
    }
}
