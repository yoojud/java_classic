package Chap2;
import java.util.Scanner;

public class exam_2_5_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int a = scanner.nextInt();

        boolean result = (a % 2 == 0) ? true : false;

        if (result == true) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        scanner.close();
    }
}
