package Chap3;
import java.util.Scanner;

public class CarType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 번호 4자리를 입력하세요: ");
        int number = scanner.nextInt();

        switch (number / 1000) {
            case 1 -> System.out.println("승용차");
            case 2 -> System.out.println("승합차");
            case 3 -> System.out.println("화물차");
            case 4 -> System.out.println("특수차");
            default -> System.out.println("유효하지 않은 입력입니다.");
        }
    }
}
