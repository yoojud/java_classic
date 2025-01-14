package Chap4;
public class ArrayReverser {

    /*
     * 배열을 반대로 뒤집습니다.
     * 
     * @param list 정수 배열
     */

    public static void reverseArray(int[] list) {
        // TODO: 배열을 반대로 뒤집기
        // array

        int[] reverseArr = new int[list.length];
        int idx = 0;

        for (int i = list.length - 1; i >= 0; i--) {
            // System.out.print(list[i] + " ");
            reverseArr[idx++] = list[i];
            // System.out.println();

        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        reverseArray(numbers);
        // for (int number : ) {
        // System.out.print(number + " "); // 출력: 5 4 3 2 1
        // }
    }
}
