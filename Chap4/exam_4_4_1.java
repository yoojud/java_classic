package Chap4;
public class exam_4_4_1 {
    public static void main(String[] args) {
        // TODO: pythagoras 서브루틴을 호출하여 빗변 계산하기
        double result = pythagoras(2, 3);
        System.out.println("빗변의 길이: " + result);
    }

    public static double pythagoras(double x, double y) {
        // TODO: 직각 삼각형의 빗변 길이 계산 후 반환
        return Math.sqrt(x * x + y * y);
    }
}
