package Chap3;

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        // int sum = 0;

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            // sum += numbers[i];
        }
        sc.close();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // TODO: 배열 요소들의 합을 계산해 출력하세요.

        double average = (double) sum / numbers.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
