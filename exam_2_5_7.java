import java.util.Scanner;

public class exam_2_5_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("실수를 입력하세요: ");
        
        int num = (int) scanner.nextDouble();

        System.out.println("정수로 타입 변환된 값: " + num);       

        scanner.close();
    }
}
