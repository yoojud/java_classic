package Chap3;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~7 사이의 숫자를 입력하세요: ");
        int day = scanner.nextInt();
        

        switch (day) {
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            case 4 -> System.out.println("목요일");
            case 5 -> System.out.println("금요일");
            case 6 -> System.out.println("토요일");
            case 7 -> System.out.println("일요일");
            default -> System.out.println("유효하지 않은 입력입니다.");
          // TODO: 숫자별로 요일을 출력하세요.
        }
    }
}
