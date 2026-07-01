package com.example.functionalProgramming;

import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        printAllNumbersInListStructure(List.of(1, 2, 6, 4, 5, 6));
    }

    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        for(Integer number: numbers){
            System.out.println(number);//structured approach
        }
    }
}
