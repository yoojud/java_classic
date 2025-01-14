package Chap4;
import java.util.Scanner;

public class exam_4_2_5 {
    public static void main(String[] args) {
        // TODO: checkNumber 메서드를 호출하여 숫자 판별하기
        Scanner sc = new Scanner(System.in);

        checkNumber(5);
        checkNumber(0);
        checkNumber(-3);
    }

    // TODO: 조건문을 사용하여 숫자의 크기를 판단하는 checkNumber함수를 구현하세요.
    public static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("0입니다.");
        } else if (num > 0) {
            System.out.println(num + "는 양수입니다.");
        } else {
            System.out.println(num + "는 음수입니다.");
        }
    }
}
