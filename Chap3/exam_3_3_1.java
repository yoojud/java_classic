package Chap3;
import java.util.Scanner;

public class exam_3_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 (0을 입력하면 종료): ");
        int num = scanner.nextInt();

        double average = 0;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            sum += num;
            count++;
            average = sum / count;

            num = scanner.nextInt();
        }

        // while(scanner.nextInt() != 0) {
        //     sum += num;
        //     count++;
        //     average = sum / count;
        // }

        // while(true) {

        // }

        System.out.println("평균: " + average);
        scanner.close();
    }
}
