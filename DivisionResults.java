import java.util.Scanner;

public class DivisionResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        // TODO: 첫 번째 정수를 입력 받습니다.
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        // TODO: 두 번째 정수를 입력 받습니다.
        int b = scanner.nextInt();

        try {

        // TODO: 두 정수간 나누셈을 출력합니다.
        System.out.println("정수 나눗셈 결과: " + a/b);
        // TODO: 정수를 실수로 변환하여 나눗셈을 출력합니다.
        System.out.println("실수 나눗셈 결과: " + (double) a / (double) b);
        } catch (ArithmeticException exception) {
            System.out.println("연산에 오류가 발생하였습니다: / by zero");
        }

        scanner.close();
    }
}
