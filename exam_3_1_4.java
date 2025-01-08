import java.util.Scanner;

public class exam_3_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        int n = 1;
        
        while(n < num1)
        {
            System.out.println(n);
            n+=n;
            n++;
        }
        System.out.println("합: " + n);
        
        sc.close();
    }
}
