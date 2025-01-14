package Chap3;
import java.util.Scanner;

public class exam_3_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        for (int i = 0; i < 2; i++) {

            int num = sc.nextInt();

            int max = num;

            if (num > max) {
                max = num;
            }

        }

        System.out.println("큰 값: " + max);

    }
}
