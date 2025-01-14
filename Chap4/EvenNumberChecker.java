package Chap4;
public class EvenNumberChecker {
    public static void main(String[] args) {
        // TODO: Predicate 인터페이스를 사용하여 짝수인지 확인하는 람다 작성
        java.util.function.Predicate<Integer> isEven = x -> x % 2 == 0;

        // 테스트
        System.out.println("4는 짝수인가? " + isEven.test(4)); // 출력: true
        System.out.println("7은 짝수인가? " + isEven.test(7)); // 출력: false
    }
}
