package Chap4;
public class exam_4_4_2 {
    public static void main(String[] args) {
        // TODO: nextN 서브루틴을 호출하여 수열 계산하기
        int result = nextN(5);
        System.out.println("다음 항: " + result);
    }

    public static int nextN(int currentN) {
        // TODO: currentN에 따라 다음 수를 계산하고 반환
        if (currentN % 2 == 1) {
            return 3 * currentN + 1;

        } else {
            return currentN / 2;
        }
    }
}
