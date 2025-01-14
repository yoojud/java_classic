package Chap3;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 중복된 값을 출력합니다.
        // 5
        // 1 3 2 3 2
        int[] duplicates = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicates[count++] = numbers[i];
                }
            }
        }

        if (count != 0) {
            System.out.print("중복된 값: ");
            for (int i = 0; i < count; i++) {
                System.out.print(duplicates[i] + " ");
            }
        } else {
            System.out.println("중복된 값이 없습니다.");
        }
    }
}
