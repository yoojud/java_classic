package Chap4;
public class exam_4_4_7 {
    public static void main(String[] args) {
        // TODO: isPalindrome 서브루틴을 호출하여 문자열이 팰린드롬인지 확인
        boolean result = isPalindrome("banana");
        System.out.println("결과: " + result);
    }

    public static boolean isPalindrome(String str) {
        // TODO: 문자열이 팰린드롬인지 여부 반환

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
