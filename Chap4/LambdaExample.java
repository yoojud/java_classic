package Chap4;
public class LambdaExample {
    public static void main(String[] args) {
        // TODO: Function 인터페이스를 사용하여 람다 표현식을 정의하세요.
        java.util.function.Function<Integer, Integer> square = x -> x * x;

        // 결과 출력
        System.out.println("5의 제곱: " + square.apply(5)); // 출력: 25
    }
}