package Chap3;
import java.util.Scanner;

public class exam_3_1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요(공백으로 구분): ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while (num1 != 0 && num2 != 0) { // 양의 정수만
            if (num1 < num2) { // num1 > num2 이도록
                int tmp = num2;
                num1 = tmp;
                num2 = num1;
            }

            int r = num1 % num2;

            if (r != 0) {
                num2 = num1;
                r = num2;
            }

        }
        System.out.println("최대공약수: " + num1);

        // scanner.close();
    }
    // throw new IllegalQrgumentException()
}
