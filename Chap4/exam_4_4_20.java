package Chap4;
public class exam_4_4_20 {
    public static void main(String[] args) {
        // TODO: averageValue 서브루틴을 호출하여 배열의 평균값 출력
        int[] numArray = { 1, 2, 3, 4, 5 };
        double result = averageValue(numArray);
        System.out.println("평균값: " + result);

    }

    public static double averageValue(int[] numbers) {
        // TODO: 배열의 평균값 계산하여 반환
        // int[] sum = int[numbers.length];
        int sum = 0;

        for (int value : numbers) {
            sum += value;
        }

        return sum / numbers.length;
    }
}
