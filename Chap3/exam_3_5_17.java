package Chap3;
import java.util.Scanner;

public class exam_3_5_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();

        if(year%4==0 && ) {
            System.out.println("윤년입니다.");
        }
        else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
