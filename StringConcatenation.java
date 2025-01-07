import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        String message = "안녕, " + name + ". 당신의 나이는 " + age + "살입니다.";
        System.out.println(message);

        age += 1;
        System.out.println("내년에는 " + age + "살이 되는군요.");

        // System.out.println("내년에는 " + (age + 1) + "살이 되는군요.");
        // 우선순위
        
        scanner.close();

    }
}
