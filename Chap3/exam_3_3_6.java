package Chap3;
import java.util.Scanner;

public class exam_3_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.print("숫자를 입력하세요 (음수를 입력하면 종료): ");
        
        while (true) {
            num = scanner.nextInt();
            

            if(num < 0) {
                break;
            }

            sum += num;

        }
        System.out.println("합: " + sum);
        scanner.close();
    }
}
