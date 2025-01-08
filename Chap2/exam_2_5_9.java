package Chap2;
import java.util.Scanner;

public class exam_2_5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("원래 a 값: " + a);
        System.out.println("a += b: " + (a+=b));
        System.out.println("a -= b: " + (a-=b));
        System.out.println("a *= b: " + (a*=b));
        System.out.println("a /= b: " + (a/=b));
        
        scanner.close();
    }
}
