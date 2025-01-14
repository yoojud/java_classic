package Chap4;
public class exam_4_4_9 {
    public static void main(String[] args) {
        // TODO: divideNumbers 서브루틴을 호출하여 나누기 계산

        try {
            double result = divideNumbers(15, 0);
            System.out.println("값: " + result);

        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public static double divideNumbers(double a, double b) {
        // TODO: 두 숫자를 나누고, 예외 발생 시 오류 메시지 반환
        if (a == 0 || b == 0) {
            throw new ArithmeticException("예외 발생");
        }

        return a / b;
    }
}
