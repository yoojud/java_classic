package Chap4;
import java.util.Arrays;
import java.util.List;

public class ListPrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // TODO: Consumer 인터페이스를 사용하여 요소를 출력하는 람다 작성
        // java.util.function.Consumer<Integer> printElement = System.out::println;
        java.util.function.Consumer<Integer> printElement = d -> System.out.println(d);

        // 리스트 요소 출력
        numbers.forEach(printElement);
    }
}
