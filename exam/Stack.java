package exam;

public class Stack<T> {
    T[] elements;
    int index = 0;

    public Stack(int size) {
        this.elements = (T[]) new Object[size];
    }

    public void push(T i) {
        this.elements[index++] = i;
    }

    public T pop(T i) {
        return this.elements[--index];
    }
}

class Test {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>(10);
        s.push("String");
        String s2 = (String) s.pop(null);
    }
}
