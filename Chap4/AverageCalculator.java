package Chap4;
public class AverageCalculator {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // TODO: 서브루틴 호출
        double average = calculateAverage(numbers);

        System.out.println("평균: " + average);
    }

    /*
     * 주어진 배열의 평균을 계산합니다.
     * 
     * @param array 정수 배열
     * 
     * @return 배열의 평균
     * 
     * @throws IllegalArgumentException 배열이 비어 있을 때 예외 발생
     */

    public static double calculateAverage(int[] array) {
        // TODO: 배열이 비어 있는지 확인
        if (array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }
        // TODO: 배열 요소의 합을 계산하고 평균을 반환
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length; // 임시 반환값
    }
}
