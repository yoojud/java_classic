package Chap4;
import java.util.Arrays;
import java.util.List;

public class ListSumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // TODO: 람다와 Stream API를 사용하여 합계 계산
        int sum = numbers.stream()
                .mapToInt(x -> x) // TODO: 숫자 변환 람다 작성
                .sum();

        // 결과 출력
        System.out.println("리스트 합계: " + sum); // 출력: 리스트 합계: 15
    }
}
