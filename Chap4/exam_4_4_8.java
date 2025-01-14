package Chap4;
public class exam_4_4_8 {
    public static void main(String[] args) {
        // TODO: findMinMax 서브루틴을 호출하여 배열의 최소값과 최대값을 반환
        int[] numArray = { 5, 8, 2, 16, 7 };
        int[] result = findMinMax(numArray);
        System.out.println("최솟값: " + result[0] + ", 최댓값: " + result[1]);

    }

    public static int[] findMinMax(int[] numbers) {
        // TODO: 배열에서 최솟값과 최댓값을 반환하는 로직 구현
        int min = numbers[0];
        int max = numbers[0];

        for (int value : numbers) {
            min = Math.min(value, min);
            max = Math.max(value, max);
        }

        return new int[] { min, max };

    }
}
