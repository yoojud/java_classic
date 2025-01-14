package Chap4;
public class ArrayMinFinder {

    /*
     * 배열에서 가장 큰 값 또는 가장 작은 값을 반환합니다.
     * 
     * @param list 정수 배열
     * 
     * @return 배열의 최대값 또는 최소값
     * 
     * @throws IllegalArgumentException 배열이 비어 있을 경우 예외를 던집니다.
     */

    public static int findMin(int[] list, boolean findMax) {
        // TODO: 배열에서 가장 큰 값 또는 가장 작은 값을 찾아 반환
        int maxInt = list[0];
        int minInt = list[0];

        for (int i = 0; i < list.length; i++) {
            if (findMax == false) {
                minInt = Math.min(minInt, list[i]);
                // return minInt;
            } else if (findMax == true) {
                maxInt = Math.max(maxInt, list[i]);
            }
            return minInt;
        }

        // TODO: 배열이 비어 있으면 IllegalArgumentException 던지기
        if (list.length == 0) {
            throw new IllegalArgumentException();
        }

        return maxInt;
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 2, 8 };
        int min = findMin(numbers, false);
        System.out.println("최소값: " + min); // 출력: 최소값: 2
        int max = findMin(numbers, true);
        System.out.println("최대값: " + max); // 출력: 최대값: 8
    }
}
