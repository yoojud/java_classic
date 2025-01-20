package quiz5_9_10;

/*
 * 도형을 나타내는 추상 클래스입니다.
 *
 * @author NHN Academy
 */
public abstract class Shape {
    // 도형의 너비입니다.
    private final double width;
    // 도형의 높이입니다.
    private final double height;

    /*
     * 도형을 생성합니다.
     *
     * @param width 도형의 너비입니다.
     * 
     * @param height 도형의 높이입니다.
     */

    Shape(double width, double height) {
        // TODO: 필드를 초기화 하세요.
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }

        this.width = width;
        this.height = height;
    }

    /*
     * 도형의 너비를 반환합니다.
     *
     * @return 도형의 너비입니다.
     */
    public double getWidth() {
        // TODO: 폭을 반환하세요.
        return width;
    }

    /*
     * 도형의 높이를 반환합니다.
     *
     * @return 도형의 높이입니다.
     */
    public double getHeight() {
        // TODO: 높이를 반환하세요.
        return height;
    }

    /*
     * 도형의 넓이를 반환합니다. 이 메서드는 하위 클래스에서 구현해야 합니다.
     * 
     * @return
     *
     * @return 도형의 넓이입니다.
     */
    // TODO: 도형의 넓이를 구할 메서드를 선언하시요.
    public abstract double getArea();

    @Override
    public String toString
    {
        return String.format(width, height);
    }

}
