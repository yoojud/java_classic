package Chap4;
public class exam_4_4_6 {
    public static void main(String[] args) {
        // TODO: countDown 서브루틴을 호출하여 10부터 1까지 출력하고 마지막 숫자 반환
        int result = countDown();
        System.out.println("값 출력: " + result);
    }

    public static int countDown() {
        // TODO: 10부터 1까지 숫자 출력 후, 마지막 숫자 반환
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        return 1;
    }
}
