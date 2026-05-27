package com.example.lambdasFluxos;


public class FunctionalInterface {
    public static void main(String[] args) {
        Evaluate<Integer> lambda =  i -> i < 0;

        System.out.println("Evaluate: " + lambda.isNegative(-1));
    }
}
