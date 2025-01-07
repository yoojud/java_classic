import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문장을 입력하세요: ");
        String string = scanner.nextLine();

        System.out.print("시작 위치를 입력하세요: ");
        int start = scanner.nextInt();

        System.out.print("끝 위치를 입력하세요: ");
        int end = scanner.nextInt();

        System.out.println("부분 문자열: " + string.substring(start, end));

        scanner.close();
    }
}
