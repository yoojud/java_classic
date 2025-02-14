package exam_0212;

public class Sample_0212<T> {
    T o;

    public T getValue() {
        return this.o;
    }

    public void setValue(T o) {
        this.o = o;
    }
}

class Test {
    public static void main(String[] args) {
        Sample_0212<String> sample = new Sample_0212<>();
        sample.setValue("Haemil");

        Object name = sample.getValue();
        System.out.println(name);
    }
}
