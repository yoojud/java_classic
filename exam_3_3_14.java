import java.util.Scanner;

public class exam_3_3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("문자열을 입력하세요 (종료: 'end'): ");
        while (true) {
            str = scanner.next();
        
            if(num==0) {
                break;
            }

            if(num%2 != 0) {
                continue;
            }

            System.out.println("짝수: " + num);
            System.out.print("ㅇ수: " + num);
            
        }
        // System.out.println("짝수: " + num);
    }
}
