import java.util.Scanner;

public class exam_3_5_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("합: " + sum);

        if(sum>=100) {
            System.out.println("100 이상입니다.");
        }

        sc.close();
    }
}
