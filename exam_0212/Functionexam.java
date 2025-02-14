package exam_0212;
import java.util.function.*;

interface Function<T, R> {
    R apply(T t);
}

class Functionexam {
    public static void main(String[] args) {
        Function<Double, Integer> f = x -> (int) (x + 1);

        System.out.println(f.apply(2.0));
    }
}