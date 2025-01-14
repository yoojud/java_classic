package Chap3;
import java.util.Scanner;

public class exam_3_5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 % num2 == 0 || num1 % num3 == 0) {
            System.out.printf("%d은 %d 또는 %d의 배수입니다.", num1, num2, num3);
        } else {
            System.out.printf("%d은 %d 또는 %d의 배수가 아닙니다.", num1, num2, num3);
        }
    }
}
