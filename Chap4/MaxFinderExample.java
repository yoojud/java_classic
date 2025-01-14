package Chap4;
@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}

public class MaxFinderExample {
    public static void main(String[] args) {
        // TODO: MaxFinder 인터페이스를 구현하는 람다 작성
        MaxFinder maxFinder = (a, b) -> Math.max(a, b);

        // 테스트
        System.out.println("큰 값: " + maxFinder.findMax(5, 10)); // 출력: 10
    }
}
