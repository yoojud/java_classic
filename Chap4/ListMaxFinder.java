package Chap4;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // TODO: 람다와 Stream API를 사용하여 최대값 찾기
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo); // TODO: Comparator 작성

        // 결과 출력
        max.ifPresentOrElse(
                value -> System.out.println("최대값: " + value), // 출력: 최대값: 50
                () -> System.out.println("리스트가 비어 있습니다."));
    }
}
