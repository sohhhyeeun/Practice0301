package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int high = num2 / 100;
        int mid = num2 % 100 / 10;
        int low = num2 % 100 % 10;

        int result1 = num1 * low;
        int result2 = num1 * mid;
        int result3 = num1 * high;

        int sum = result1 + (result2 * 10) + (result3 * 100);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(sum);
    }
}