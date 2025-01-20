package com.nhnacademy;

/**
 * 정수 클래스입니다.
 */
public class MyIntegerNumber extends MyRationalNumber {

    /**
     * 정수를 초기화하는 생성자입니다.
     *
     * @param value 정수 값
     */
    public MyIntegerNumber(int value) {
        super(value, 1); // MyRationalNumber의 생성자를 사용하여 정수 초기화
    }

    /**
     * 두 정수를 더합니다.
     *
     * @param other 다른 정수
     * @return 더한 결과
     */
    public MyRationalNumber add(MyIntegerNumber other) {
        return super.add(other); // MyRationalNumber의 add 메서드를 호출합니다.
    }

    /**
     * 두 정수를 뺍니다.
     *
     * @param other 다른 정수
     * @return 뺀 결과
     */
    public MyRationalNumber subtract(MyIntegerNumber other) {
        return super.subtract(other); // MyRationalNumber의 subtract 메서드를 호출합니다.
    }

    /**
     * 두 정수를 곱합니다.
     *
     * @param other 다른 정수
     * @return 곱한 결과
     */
    public MyRationalNumber multiply(MyIntegerNumber other) {
        return super.multiply(other); // MyRationalNumber의 multiply 메서드를 호출합니다.
    }

    /**
     * 두 정수를 나눕니다.
     *
     * @param other 다른 정수
     * @return 나눈 결과
     * @throws ArithmeticException 0으로 나누는 경우 예외 발생
     */
    public MyRationalNumber divide(MyIntegerNumber other) {
        return super.divide(other); // MyRationalNumber의 divide 메서드를 호출합니다.
    }

    @Override
    public String toString() {
        return String.valueOf(getNumerator()); // 분모가 1이므로 분자만 반환
    }

    public static void main(String[] args) {
        MyIntegerNumber int1 = new MyIntegerNumber(5);
        MyIntegerNumber int2 = new MyIntegerNumber(3);

        MyRationalNumber addResult = int1.add(int2);
        MyRationalNumber subtractResult = int1.subtract(int2);
        MyRationalNumber multiplyResult = int1.multiply(int2);
        MyRationalNumber divideResult = int1.divide(int2);

        System.out.println("int1 = " + int1);
        System.out.println("int2 = " + int2);
        System.out.println("addResult = " + addResult);
        System.out.println("subtractResult = " + subtractResult);
        System.out.println("multiplyResult = " + multiplyResult);
        System.out.println("divideResult = " + divideResult);
    }
}
