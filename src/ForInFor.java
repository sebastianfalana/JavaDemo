package com.company;

public class ForInFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("\r\ni: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j: " + j);
            }
        }
    }
}