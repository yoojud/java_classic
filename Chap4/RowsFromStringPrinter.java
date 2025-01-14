package Chap4;
public class RowsFromStringPrinter {

    /*
     * /
     * str의 각 문자에 대해 해당 문자를 N번 반복 출력합니다.
     * 
     * @param str 입력 문자열
     * 
     * @param n 반복 횟수
     */

    public static void printRowsFromString(String input, int n) {
        // TODO: 각 문자의 반복은 printRow 서브루틴 사용
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // System.out.println(ch);
            printRow(ch, n);
        }
    }

    public static void main(String[] args) {
        int n = 25;
        String input = "Java";
        printRowsFromString(input, n);
    }

    static void printRow(char ch, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
