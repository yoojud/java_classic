package quiz5_9_10;

/*
 * 직사각형을 나타내는 클래스입니다.
 *
 * @author NHN Academy
 */
public class Rectangle extends Shape {
    /*
     * 직사각형을 생성합니다.
     *
     * @param width 직사각형의 너비입니다.
     * 
     * @param height 직사각형의 높이입니다.
     */
    public Rectangle(double width, double height) {
        // TODO: 수퍼클래스의 생성자를 이용해 초기화 하세요.
        super(width, height);
    }

    /*
     * 직사각형의 넓이를 반환합니다.
     *
     * @return 직사각형의 넓이입니다.
     */
    public double getArea() {
        // TODO: 넓이를 계산하라.
        return getHeight() * getWidth();
    }
}
