import java.util.Scanner;

public class exam_3_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        
        int sum = 0;

        while(true) {
            int num = sc.nextInt();
            if (num > 0) {
                sum+=num;
            }
            else if (num == 0) {
                break;
            }
        }
        
        sc.close();
        System.out.println("합: " + sum);
    }
}
