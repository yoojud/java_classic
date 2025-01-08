import java.util.Scanner;

public class exam_3_5_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if(num/1000 == 0 || num/1000 > 9) {
            System.out.println("네 자리 수가 아닙니다.");
        }
        else {
            
            System.out.println("네 자리 수입니다.");
        }
        
    }
}
