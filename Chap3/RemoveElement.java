package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 제거할 값을 입력하세요: ");
        int target = sc.nextInt();

        sc.close();

        // TODO: 배열에서 특정 값을 제외하여, 새로운 배열을 생성합니다.
        // 배열의 길이는 유효한 요소수와 같습니다.

        int count = 0;

        for (int num : numbers) {
            if (target != num) {
                count++;
            }
        }

        int[] array = new int[count];

        int idx = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (target != numbers[i]) {
                array[idx++] = numbers[i];
            }
        }

        System.out.print("결과 값: ");
        for (int arrays : array) {
            System.out.print(arrays + " ");
        }

        System.out.println("\n" + Arrays.toString(array));
    }
}
