package Chap3;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 찾을 값을 입력하세요: ");
        int target = sc.nextInt();

        sc.close();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.printf("%d은 인덱스 %d에 존재합니다.", target, i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("존재하지 않음");
        }

    }
}
