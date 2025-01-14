package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();

        sc.close();

        // TODO: input이 정수변환합니다.
        try {
            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);
        } catch (NumberFormatException e) {
            System.err.println("숫자가 아닙니다! 유효한 나이를 입력하세요." + Arrays.toString(e.getStackTrace()));
        }

        // TODO: 정수 변환시 exception이 발생할 수 있으므로, try...catch문을 추가해 주세요.
    }
}
