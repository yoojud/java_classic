package Chap4;
public class exam_4_4_4 {
    public static void main(String[] args) {
        // TODO: isPrime 서브루틴을 호출하여 주어진 숫자가 소수인지 확인
        boolean result = isPrime(10);
        System.out.println("소수인가요?: " + result);
    }

    public static boolean isPrime(int number) {
        // TODO: 숫자가 소수인지 여부를 반환

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }
}
