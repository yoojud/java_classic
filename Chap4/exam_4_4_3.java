package Chap4;
public class exam_4_4_3 {
    public static void main(String[] args) {
        // TODO: checkEvenOdd 서브루틴 호출하여 짝수/홀수 확인하기
        String result = checkEvenOdd(21);
        System.out.println("짝수/홀수?: " + result);
    }

    public static String checkEvenOdd(int number) {
        // TODO: 숫자가 짝수인지 홀수인지 반환
        if (number % 2 == 0) {
            return number + "는 짝수";
        } else {
            return number + "는 홀수";
        }
    }
}
