import java.util.Scanner;

public class exam_3_1_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("정수를 입력하세요: ");
            int num1 = sc.nextInt();
            
            if (num1 < 10) {
                System.out.println("작은 수");
            } else {
                System.out.println();
            }
        }
    }
}
