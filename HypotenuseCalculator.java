import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        int a = scanner.nextInt();
        
        System.out.print("두 번째 변의 길이를 입력하세요: ");
        int b = scanner.nextInt();

        double hypotenuse = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("빗변의 길이: " + hypotenuse);

        scanner.close();
    }
}
