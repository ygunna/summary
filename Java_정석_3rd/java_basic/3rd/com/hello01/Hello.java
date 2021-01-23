package com.hello01;

import java.util.Scanner;

class Hello {
    public static void main(String[] args) {

        int year = 2020;
        final long FINAL_LONG;
        final float FINAL_FLOAT = 3.14f;
        String str = "abc";
        char ch = 'a';
        String input;
        int input_num = 0;

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        
        // Constant & Literal
        try {
            FINAL_LONG = 200L;
            input = scanner.nextLine();
            System.out.println("Input Please\n");
            input_num = Integer.parseInt(input);
            // FINAL_NUM = 300; java: variable FINAL_NUM might already have been assigned
            // FINAL_FLOAT = 1.14f; java: variable FINAL_NUM might already have been assigned
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            for (int j = 0; j < arr.length; j++) {
                System.out.printf("arr[%d] = %d\n", j, arr[j]);
            }
        } finally {
            System.out.println("input = " + input_num);
        }
        System.out.println("Hello, world " + FINAL_LONG + " "
                + " " + FINAL_FLOAT);
    }
}