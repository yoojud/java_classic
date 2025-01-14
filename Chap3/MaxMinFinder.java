package Chap3;

import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        // TODO: 최소값, 최대값을 찾아 출력하세요.

        int min = numbers[0];
        int max = numbers[0];

        for (int value : numbers) {
            // min = Math.min(value, min);
            // max = Math.max(value, max);

            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}
