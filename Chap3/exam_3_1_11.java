package Chap3;
import java.util.Scanner;

public class exam_3_1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();
            scanner.close();

            if (num <= 0) {
                System.out.println("루프 종료");
            } else {
                System.out.printf("%d의 제곱: %d\n", num, num * num);
            }
        }
    }
}
