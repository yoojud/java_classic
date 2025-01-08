package Chap2;
import java.util.Scanner;

public class exam_2_5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열로 숫자를 입력하세요: ");
        String num = scanner.next();

        //System.out.println("정수 값: " + Integer.valueOf(num));
        System.out.println("정수 값: " + Integer.parseInt(num));
        System.out.println("정수 값: " + Double.parseDouble(num));
        // System.out.println("실수 값: " + Double.valueOf(num));

        scanner.close();
    }
}
