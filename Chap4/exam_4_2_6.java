package Chap4;
import java.util.Scanner;

public class exam_4_2_6 {
    public static void main(String[] args) {
        // TODO: 두수를 입력 받으세요.
        // TODO: addNumbers 메서드를 호출하여 두 숫자의 합을 구하고 출력하기

        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        addNumber(num1, num2);
        sc.close();
    }

    // TODO: 두수를 더하여 반환하는 addNumbers()를 구현하세요.
    public static void addNumber(int num1, int num2) {
        System.out.println("합: " + (num1 + num2));
    }

}
