package com.ll;

import java.util.HashMap;
import java.util.Map;

public class l64 {
    public static void main(String[] args) {
        /*
        Map<String, Integer> age = new HashMap<>();
        Map<String, Double> height = new HashMap<>();

        age.put("홍길동", 22);
        height.put("홍길동", 170.5);

        age.put("홍길순", 25);
        height.put("홍길순", 162.4);

        System.out.printf("홍길동 : %d %.1f\n", age.get("홍길동"), height.get("홍길동"));
        System.out.printf("홍길순 : %d %.1f\n", age.get("홍길순"), height.get("홍길순"));
        */

        Info i1 = new Info("홍길동", 22, 170.5);
        Info i2 = new Info("홍길순", 25, 164.4);

        System.out.println("홍길동 : " + i1.getName() + ", " + i1.getAge() + ", " + i1.getHeight());
        System.out.println("홍길순 : " + i2.getName() + ", " + i2.getAge() + ", " + i2.getHeight());
    }
}

class Info {
    private String name;
    private int age;
    private double height;

    public Info(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
