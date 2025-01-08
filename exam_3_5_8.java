import java.util.Scanner;

public class exam_3_5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 문자를 입력하세요: ");
        String c1 = sc.next();
        String c2 = sc.next();

        if(c1.compareTo(c2) < 0){
            System.out.printf("%c %c", c1, c2);
        }
        else {
            System.out.printf("%c %c", c2, c1);
        }
        mmmmmmmmmmmmmmmmmmmmm

    }
}
