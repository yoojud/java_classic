package Chap5.quiz5_9_10;

/**
 * 삼각형을 나타내는 클래스입니다.
 *
 * @author NHN Academy
 */
public class Triangle extends Shape {
    /*
     * 삼각형을 생성합니다.
     *
     * @param width 삼각형의 너비입니다.
     * 
     * @param height 삼각형의 높이입니다.
     */
    public Triangle(double width, double height) {
        // TODO: 수퍼클래스의 생성자를 이용해 초기화 하세요.
        super(width, height);
    }

    public Triangle() {
        // TODO: 수퍼클래스의 생성자를 이용해 초기화 하세요.
        super(11, 11);
    }

    /**
     * 삼각형의 넓이를 반환합니다.
     *
     * @return 삼각형의 넓이입니다.
     */
    public double getArea() {
        // TODO: 넓이를 계산하라.
        return (double) 1 / 2 * (getHeight() * getWidth());
    }
}
