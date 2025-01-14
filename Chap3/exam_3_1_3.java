package Chap3;
import java.util.Scanner;

public class exam_3_1_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            int n = 1;
            int sum = 0;

            while(n <= num)
            {
                sum += n;
                n++;
            }

            System.out.println("합: " + sum);
        }
    }
}
