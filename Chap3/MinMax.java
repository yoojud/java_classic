package Chap3;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
        int num = scanner.nextInt();
        int max = num;
        int min = num;
        
        if (num == 0) {
            System.out.println("d");
        }

        while(num != 0) {
            // min = Math.min(min, value);
            // max = Math.min(max, value);

            num = scanner.nextInt();
        
            if(num < min) {
                min = num;
            }
            else if (num > min) {
                max = num;
            }
        }
        

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);

    }
}
