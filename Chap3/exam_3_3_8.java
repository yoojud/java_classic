package Chap3;
import java.util.Scanner;

public class exam_3_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String name1 = sc.next();

        String name2 = sc.next();
        stop: for (int i = 0; i < name1.length(); i++) {
            for (int j = 0; j < name2.length(); j++)
                if (name1.charAt(i) == name2.charAt(i)) {
                    System.out.println("공통문자: " + name1.charAt(i));
                    break stop;
                }
        }
    }
}
