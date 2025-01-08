package Chap2;
import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String line = scanner.nextLine();
        
        System.out.print("검색할 문자를 입력하세요: ");
        String target = scanner.next();
        //char target = scanner.next().charAt(0);
        
        int position = line.indexOf(target);
        
        if (position != -1) {
            System.out.println("문자 '" + target + "'의 위치: " + position);
        } else {
            System.out.println("문자 '" + target + "'는 문자열에 없습니다.");
        }

        scanner.close();
    }
}
