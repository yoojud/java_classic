package Chap4;
import java.util.Scanner;

public class exam_4_2_8 {
    public static void main(String[] args) {
        // TODO: sumArray 메서드 호출하여 배열의 합을 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("정수의 갯수를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("합: " + sumArray(numbers));

    }

    public static int sumArray(int[] numbers) {
        // TODO: 배열의 합을 계산하여 반환
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }

        return sum;
    }
}
