package Chap4;
import java.util.function.Consumer;

public class ConditionalProcessor {
    public static void main(String[] args) {
        int number = -5;

        // TODO: Consumer를 사용하여 조건부 처리 람다 작성
        Consumer<Integer> processor = n -> {
            if (n > 0) {
                System.out.println("값: " + n);
            } else {
                System.out.println("음수입니다.");
            }
        };

        // 처리 실행
        processor.accept(number);
    }
}
