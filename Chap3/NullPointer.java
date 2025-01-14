package Chap3;

import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.close();

        try {
            /*
             * TODO:
             * 나이가 정상적으로 입력되었는지 확인하세요.
             * 음수로 입력된 경우, IllegalArgumentException을 발생시킵니다.
             * 이때, 입력된 정보를 포함한 메시지를 추가하세요.
             */
            if (age < 0) {
                throw new IllegalArgumentException(age + " 유효한 나이가 아닙니다.");
            }
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.err.println("예외 발생: " + e.getMessage());
        }

    }
}
