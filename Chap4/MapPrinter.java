package Chap4;
import java.util.HashMap;
import java.util.Map;

public class MapPrinter {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // TODO: 람다와 forEach를 사용하여 키-값 출력
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
