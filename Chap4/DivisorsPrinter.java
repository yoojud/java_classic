package Chap4;
import java.util.Arrays;

public class DivisorsPrinter {

    /*
     * N의 모든 약수를 출력합니다.*
     * 
     * @param N 양의 정수
     */

    public static int[] getDivisors(int N) {
        // TODO: N이 양수가 아니면 IllegalArgumentException 던지기
        if (N < 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;

        // TODO: N의 모든 약수를 배열로 반환
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++; // 약수의 개수

            }
        }

        int divisors[] = new int[count];
        int idx = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors[idx++] = i;
            }
        }

        // return 배열;

        return divisors;

    }

    public static void main(String[] args) {
        int number = 28; // 테스트할 숫자

        int intArray[];
        intArray = getDivisors(number);

        // TODO: 결과 출력
        System.out.printf("%d의 약수: ", number);
        System.out.println(Arrays.toString(intArray));
    }
}
