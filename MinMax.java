import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 (0을 입력하면 종료): ");
        int num = scanner.nextInt();
        int max = num;
        int min = num;

        while(true) {
            // min = Math.min(min, value);
            // max = Math.min(max, value);

            // int num = scanner.nextInt();
        
            if(num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }

            scanner.close();
        }

        // System.out.println("최소값: " + min);
        // System.out.println("최대값: " + max);

    }
}
