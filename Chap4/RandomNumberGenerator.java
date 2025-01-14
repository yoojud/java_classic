package Chap4;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // TODO: Supplier 인터페이스를 사용하여 랜덤 숫자를 생성하는 람다 작성
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 10);

        // 테스트
        System.out.println("랜덤 숫자: " + randomNumber.get());
    }
}
