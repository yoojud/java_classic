import java.util.Scanner;

public class exam_3_5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        if(score < 70){
            System.out.println("등급: 미흡");
        }
        else if (score <= 89) {
            System.out.println("등급: 보통");
        }
        else if(score <= 100) {
            System.out.println("등급: 우수");
        }
    }
}
