package Chap2;
import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String line = scanner.nextLine();

        System.out.println("문자열의 길이: " + line.length());
        
        scanner.close();
    }
}
