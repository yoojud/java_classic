package Chap3;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        // TODO: 역순으로 출력하세요.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
