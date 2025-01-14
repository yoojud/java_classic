package Chap3;
import java.util.Scanner;

public class exam_3_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        String answer;

        do {
            System.out.print("숫자 입력: ");
            num = scanner.nextInt();
            System.out.print("다시 입력하시겠습니까? ");
            answer = scanner.next();
            sum += num;
        } while (answer.equalsIgnoreCase("yes"));   //대소문자 무시

        System.out.println("합: " + sum);

    }
}
