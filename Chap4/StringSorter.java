package Chap4;
import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "kiwi", "grape" };

        // TODO: 람다로 문자열 길이 기준 Comparator 작성
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        // 결과 출력
        System.out.println(Arrays.toString(words)); // 출력: [kiwi, grape, apple, banana]
    }
}
