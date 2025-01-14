package Chap3;
import java.util.Scanner;

public class exam_3_5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = num2;

        if (num1 < num2) {
            min = num1;
        }

        System.out.println("작은 값: " + min);
    }
}
