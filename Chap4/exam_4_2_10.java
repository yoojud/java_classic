package Chap4;
import java.util.Scanner;

public class exam_4_2_10 {
    public static void main(String[] args) {
        // TODO: validateAge 메서드를 호출하여 나이 유효성 검사
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.close();

        validateAge(age);
    }

    public static void validateAge(int age) {
        // TODO: 나이가 음수일 경우 예외 던지기
        try {
            if (age < 0) {
                throw new IllegalArgumentException();
            }
            System.out.printf("나이는 %d세입니다.", age);
        } catch (IllegalArgumentException e) {
            System.err.println("나이가 잘못 입력되었습니다.");
        }
    }
}
