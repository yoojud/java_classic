package Chap4;
public class exam_4_2_7 {
    // TODO: 기본값을 정의하세요.
    static final String DEFAULT_NAME = "Guest";
    // final 상수 대문자

    public static void main(String[] args) {
        // TODO: greet 메서드를 호출하여 인사 메시지 출력
        greet("xtra");
        greet(null);
    }

    public static void greet(String name) {
        if (name == null) {
            name = DEFAULT_NAME;
        }
        System.out.println("Hi, " + name);

    }
}
