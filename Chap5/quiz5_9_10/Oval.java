package Chap5.quiz5_9_10;

/*
 * 타원을 나타내는 클래스입니다.
 *
 * @author NHN Academy
 */
public class Oval extends Shape {
    /*
     * 타원을 생성합니다.
     *
     * @param width 타원의 너비입니다.
     * 
     * @param height 타원의 높이입니다.
     */
    public Oval(double width, double height) {
        // TODO: 수퍼클래스의 생성자를 이용해 초기화 하세요.
        super(width, height);
    }

    /*
     * 타원의 넓이를 반환합니다.
     *
     * @return 타원의 넓이입니다.
     */
    public double getArea() {
        // TODO: 넓이를 계산하라.
        return Math.PI * (getHeight() / 2) * (getWidth() / 2);
    }
}
