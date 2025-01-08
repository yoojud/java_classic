import java.util.Scanner;

public class exam_3_5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("패스워드를 입력하세요: ");
        int input = sc.nextInt();
        int passward = 1234;

        if (input == passward) {
            System.out.println("패스워드가 맞습니다.");
        } else {
            System.out.println("패스워드가 틀립니다.");
        }
    }
}
