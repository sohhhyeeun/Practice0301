package com.ll;

import java.util.Arrays;
import java.util.Scanner;

public class b11382 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        long sum = num1 + num2 + num3;

        System.out.println(sum);
         */

        /*
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        long sum = 0;

        for (String num : nums) {
            sum += Long.parseLong(num);
        }

        System.out.println(sum);

        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        long sum = Arrays.stream(nums)
                .mapToLong(e -> Long.parseLong(e))
                .sum();

        System.out.println(sum);

        sc.close();
        */

        Scanner sc = new Scanner(System.in);

        long sum = Arrays.stream(sc.nextLine().split(" "))
                .mapToLong(e -> Long.parseLong(e))
                .sum();

        System.out.println(sum);

        sc.close();
    }
}