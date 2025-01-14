package Chap4;
public class ArrayPrinter {

    /*
     * 배열의 모든
     * 값을 쉼표로
     * 구분하여 대괄호로 출력합니다.*
     * 
     * @param list 정수 배열
     */

    public static void arrayPrint(int[] list) {
        // TODO: 배열의 값을 쉼표로 구분하여 대괄호로 감싸 출력

        if (list == null) {
            throw new IllegalArgumentException();
        }

        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40 };
        arrayPrint(numbers); // 출력: [10, 20, 30, 40]
    }
}
