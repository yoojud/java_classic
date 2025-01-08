package Chap2;
import java.util.Scanner;

public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        
        String line = scanner.nextLine();
        String upperCase = line.toUpperCase();
        String lowerCase = line.toLowerCase();

        System.out.println("대문자: " + upperCase);
        System.out.println("소문자: " + lowerCase);

        scanner.close();

    }
}
