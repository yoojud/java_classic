package exam;

@FunctionalInterface // 추상화, 함수형 인터페이스(함수 객체화)

interface Runnable {
    void doSomething(String s);

}

// class Concreate implements Runnable {
// public void doSomething() {
// System.out.println("hello, world");
// }
// }

public class Test {
    public static void main(String[] args) {
        Runnable r = (s) -> System.out.println("s");
        // Concreate c = new Concreate();
        r.doSomething("hello world");
    }
}
