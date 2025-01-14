package Chap4;
import java.util.Scanner;

public class exam_4_2_9 {
    public static void main(String[] args) {
        // TODO: factorial 메서드 호출하여 팩토리얼 계산 후 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        System.out.printf("Factorial(%d) = %d", n, factorial(n));
    }

    public static int factorial(int n) throws IllegalArgumentException {
        // TODO: 재귀 호출을 이용한 팩토리얼 계산
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }
}
