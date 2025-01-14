package Chap4;
import java.util.Arrays;
import java.util.List;

public class StringConcatenator {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Lambda", "World");

        // TODO: Stream과 Collectors를 사용하여 문자열 연결
        String result = words.stream()
                .reduce((a, b) -> a + " " + b) // TODO: 문자열 연결 람다 작성
                .orElse("");

        // 결과 출력
        System.out.println("연결된 문자열: " + result); // 출력: 연결된 문자열: Hello Lambda World
    }
}
