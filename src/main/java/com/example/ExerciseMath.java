package com.example;

public class ExerciseMath {
    public static int factorial(int num){
        if (num <= 0){
            throw new IllegalArgumentException("0以下の値は不正です。");
        }

        return factorialize(num);
    }

    public static int factorialize(int num){
        if (num==0) return 1;
        if (num==1) return 1;
        return num*factorialize(num -1);
    }
}
