package exam_0212;
import java.util.function.*;

// public interface BiFunction<T, u, R> {
//     R apply(T t1, u t2);
// }

class BiFunctionexam {
    public static void main(String[] args) {
        BinaryOperator<Integer> f = (x, y) -> x + y;
        int i = f.apply(2, 1);
    }
}