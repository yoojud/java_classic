package Chap3;

import java.util.Scanner;

public class TransException {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("나이를 입력하세요: ");
            String input = sc.next();
            sc.close();

            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);

            boolean isInteger = input.matches("\\d+"); // 정수가 아닌 경우
            if (!isInteger) {
                throw new IllegalArgumentException("유효한 나이가 아닙니다.");
            }

        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
            // } catch (IllegalArgumentException e) {
            // System.err.println("예외 발생: " + e.getMessage());
            // }

            // TODO: input이 정수가 아닌 경우, Exception이 발생합니다.
            // 이를 IllegalArgumentException로 변경해 던집니다.
        }
    }
}
