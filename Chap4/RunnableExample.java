package Chap4;
public class RunnableExample {
    public static void main(String[] args) {
        // TODO: Runnable 인터페이스를 사용하여 메시지를 출력하는 람다 작성
        Runnable task = () -> System.out.println("Hello from Runnable");
        // ;

        // 실행
        task.run(); // 출력: Hello from Runnable
    }
}
