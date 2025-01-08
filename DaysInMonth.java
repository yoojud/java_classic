import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월(1~12)을 입력하세요: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31일");
            case 2 -> System.out.println("29일");
            case 4, 6, 9, 11 -> System.out.println("30일");
            // TODO: 각 월에 해당하는 일수를 출력하세요.
        }
    }
}
