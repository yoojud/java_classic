package Chap3;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("인덱스를 입력하세요: ");
            String input = sc.nextLine();

            int index = Integer.parseInt(input);

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[index]); // ArrayIndexOutOfBoundsException 발생

            sc.close();

        } catch (NumberFormatException e) {
            System.err.println("숫자로 변환할 수 없는 문자열 입니다.");
            // TODO: NumberFormatException과 ArrayIndexOutOfBoundsException을 처리하여 예외 메시지를
            // 출력하기
            // catch가 추가로 필요한 경우, 추가해 주세요.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("배열 인덱스가 잘못되었습니다.");
        }

    }
}
