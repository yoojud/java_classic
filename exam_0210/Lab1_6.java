package exam_0210;
import java.util.stream.IntStream;

public class Lab1_6 {
    public static void main(String[] args) {
        // 테스트를 위한 정수 배열을 생성
        int[] a = new int[] { 1, 2, 3, 4, 5 };

        // TODO#1. 인덱스를 이용하는 for문을 이용해 배열의 짝수번째 요소를 출력
        System.out.println("인덱스를 이용한 for문으로 짝수번째 요소 출력:");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
            // System.out.println(a[i%2==0]);
        }
        System.out.println();

        // TODO#2. 배열의 개별 요소를 순차적으로 가져와 처리하는 enhanced for문을 이용해 배열의 짝수번째 요소를 출력
        System.out.println("Enhanced for문으로 짝수번째 요소 출력:");
        int index = 0;
        for (int value : a) {
            if (index % 2 == 0) {
                System.out.print(value + " ");
            }
            index++;
        }
        System.out.println();

        // TODO#3. Stream의 forEach() 함수를 이용해 배열의 짝수번째 요소를 출력
        System.out.println("Stream의 forEach() 함수로 짝수번째 요소 출력:");
        IntStream.range(0, a.length) // 0부터 배열 길이까지 범위 설정
                .filter(x -> x % 2 == 0) // 짝수 인덱스 필터링
                .map(x -> a[x]) // 인덱스에 해당하는 배열 값 매핑
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}