package Chap3;
import java.util.Scanner;

public class exam_3_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num = scanner.nextInt();

        // 방법 1) 
        String numStr = String.valueOf(num);
        
        System.out.println("뒤집힌 숫자: ");

        for (int i = numStr.length(); i <= 0; i--) {
            System.out.println(numStr.charAt(i));
        }
        System.out.println();

        // 방법 2)
        while(num != 0) {
            System.out.print(num%10);
            num /= 10;
        }

        scanner.close();
    }
}
