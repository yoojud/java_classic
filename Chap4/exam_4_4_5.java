package Chap4;
import java.util.Scanner;

public class exam_4_4_5 {
    public static void main(String[] args) {
        // TODO: sumArray 서브루틴을 호출하여 배열의 합을 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기: ");
        int numArray[] = new int[sc.nextInt()];
        System.out.print("값을 입력하세요: ");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        int sum = sumArray(numArray);
        System.out.println("배열의 합: " + sum);
    }

    public static int sumArray(int[] numbers) {
        // TODO: 배열의 합을 반환
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;

    }
}
