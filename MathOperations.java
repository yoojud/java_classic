public class MathOperations {
    public static void main(String[] args) {
        int a = 15, b = 4;

        int addResult = Math.addExact(a, b);
        int subtrackResult = Math.subtractExact(a, b);
        int multiplyResult = Math.multiplyExact(a, b);
        int floorDivResult = Math.floorDiv(a, b);
        int floorModResult = Math.floorMod(a, b);

        System.out.println("합: " + addResult);
        System.out.println("차: " + subtrackResult);
        System.out.println("곱: " + multiplyResult); // 곱
        System.out.println("몫: " + floorDivResult); // 몫
        System.out.println("나머지: " + floorModResult); // 나머지
    }
}
