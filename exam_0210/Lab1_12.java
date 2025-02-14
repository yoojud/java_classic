package exam_0210;

import java.util.Arrays;

public class Lab1_12 {

    // TODO#1. 이진 검색 알고리즘 구현
    public static int search(int[] array, int key) {
        int low = 0;
        int high = array.length;
        int mid = low + (low + high) / 2;

        for (int i = low; i < high; i++) {
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // 값을 찾지 못하면 -1 반환
    }
    // recursive
    // return search(array, min, middle - 1, key);

    public static void main(String[] args) {
        // TODO#2. 정수 8개를 갖는 배열 a 생성 및 출력
        int[] a = { 22, 33, 44, 55, 66, 77, 88, 99 };
        System.out.println("배열 a: " + Arrays.toString(a));

        // TODO#3. 44, 50, 77, 100을 검색하고 결과 출력
        int[] targets = { 44, 50, 77, 100 };
        for (int target : targets) {
            System.out.printf("search(a, %d): %d%n", target, search(a, target));
        }
    }
}
