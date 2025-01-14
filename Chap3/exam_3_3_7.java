package Chap3;
import java.util.Scanner;

public class exam_3_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("숫자를 입력하세요 (음수를 입력하면 종료): ");
        while (true) {
            num = scanner.nextInt();
        
            if(num==0) {
                break;
            }

            if(num%2 != 0) {
                continue;
            }

            // 같은 의미
            // if(num%2==0){
            //     System.out.println(num + "");
            // }

            System.out.println("짝수: " + num);
            System.out.print("ㅇ수: " + num);
            
        }
        // System.out.println("짝수: " + num);
    }
}
