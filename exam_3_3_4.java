import java.util.Scanner;

public class exam_3_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        do {
            num = scanner.nextInt();
            if (num != 0) {
                sum += num;
            }
        } while (num != 0);

        System.out.println("합: " + sum);

    }
}
