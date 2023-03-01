package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class c1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Machine> lt = new ArrayList<>();

        int s = sc.nextInt();

        for(int i = 0; i < s; i++) {
            int n = sc.nextInt();
            int g = sc.nextInt();

            lt.add(new Machine(n, g));
        }

        lt = lt
                .stream()
                .sorted((e2, e1) -> e2.getNum() - e1.getNum())
                .collect(Collectors.toList());

        //틀린 부분
        for (Machine machine : lt) {
            System.out.printf("%d %d\n", machine.getNum(), machine.getGas());
        }
    }
}

class Machine {
    private int num;
    private int gas;

    public Machine(int num, int gas) {
        this.num = num;
        this.gas = gas;
    }

    public int getNum() {
        return num;
    }

    public int getGas() {
        return gas;
    }
}