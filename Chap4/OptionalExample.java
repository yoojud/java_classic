package Chap4;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");

        // TODO: Optional 값 처리 람다 작성
        optionalValue.ifPresentOrElse(
                value -> System.out.println("값: " + value), // TODO: 값이 있을 때 출력
                () -> System.out.println("No value") // TODO: 값이 없을 때 메시지 출력
        );
    }
}
