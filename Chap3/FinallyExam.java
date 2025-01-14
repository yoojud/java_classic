package Chap3;

import java.util.Scanner;

public class FinallyExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();

            System.out.println("나이: " + age);

        } catch (Exception e) {
            System.err.println("예외 발생");

        } finally {
            sc.close();
        }
    }
}
