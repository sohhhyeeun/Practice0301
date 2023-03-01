package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        while(true) {
            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
            int n = sc.nextInt();
            arr.add(n);

            if(n == -1) {
                System.out.println("입력을 종료합니다.");
                List<Integer> result = arr.stream()
                        .sorted()
                        .collect(Collectors.toList());
                System.out.println(result);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
