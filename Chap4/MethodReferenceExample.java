package Chap4;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A", "B", "C");

        // TODO: 메서드 참조를 사용하여 출력
        items.forEach(System.out::println); // TODO: 메서드 참조 작성
    }
}
