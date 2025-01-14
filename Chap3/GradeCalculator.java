package Chap3;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println("학점: F");
            case 6 -> System.out.println("학점: D");
            case 7 -> System.out.println("학점: C");
            case 8 -> System.out.println("학점: B");
            case 9, 10 -> System.out.println("학점: A");
            // TODO: 점수에 맞는 학점을 출력하세요.
        }
    }
}
