import java.util.Scanner;

public class exam_3_5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if (num > 0 && num <= 50) {
            System.out.printf("%d는 범위 안에 있습니다.\n", num);
        } else {
            System.out.printf("%d는 범위 안에 없습니다.\n", num);
        }
    }
}
