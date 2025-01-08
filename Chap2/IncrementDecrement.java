package Chap2;
import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        // TODO: 정수를 입력 받습니다.
        int num = scanner.nextInt();

        System.out.println("입력값: " + num);
        // TODO: ++연산자로 1증가 후 출력
        System.out.println("증가 연산 후: " + ++num);
        // TODO: --연산자로 1감소 후 출력

        System.out.println("감소 연산 후: " + --num);

        scanner.close();
    }
}
