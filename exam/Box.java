package exam;

public class Box<T> {
    T i;

    public void set(T i) {
        this.i = i;
    }

    public T get() {
        return this.i;
    }

}

class sample {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("String");
        String s = b.get();
    }
}
