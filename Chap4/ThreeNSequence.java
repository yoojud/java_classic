package Chap4;
public class ThreeNSequence {
    /*
     * 주어진 양의 정수 startingValue로부터 3N+1 시퀀스를 출력하고,
     * 시퀀스에 포함된 항의 개수를 반환합니다.
     */

    public static int print3NSequence(int startingValue) {
        // TODO: 시작 값이 양수가 아니면 IllegalArgumentException 던지기
        // TODO: 3N+1 시퀀스 출력 및 시퀀스 길이 계산

        if (startingValue < 0) {
            throw new IllegalArgumentException();ddd
        }

        for (int i = startingValue; i >= 1; i--) {
            if (startingValue > 0) {
                return print3NSequence(startingValue / 2);
            }
            System.out.println(print3NSequence(startingValue / 2));
        }

        return 0; // TODO: 시퀀스 길이를 반환 - sequeneceLength
    }

    public static void main(String[] args) {
        int startingValue = 7; // 테스트할 시작 값
        int sequenceLength = print3NSequence(startingValue);
        System.out.println("시퀀스 길이: " + sequenceLength);
    }
}
