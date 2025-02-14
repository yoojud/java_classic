package quiz5_9_10;

/*
 * 모형을 저장하고 관리하는 박스를 나타내는 클래스입니다.
 *
 * @author NHN Academy
 */
public class Box {
    // 박스에 저장된 모형의 배열입니다.
    Shape[] shapes;
    // 현재 박스에 저장된 모형의 갯수입니다.
    int shapeCount;

    /*
     * 박스를 생성합니다.
     *
     * @param maxCount 박스에 담을 수 있는 모형의 최대 갯수입니다.
     * 
     * @throws IllegalArgumentException maxCount가 0보다 작은 경우 발생합니다.
     */
    public Box(int maxCount) {
        if (maxCount <= 0) {
            throw new IllegalArgumentException(
                    "박스에 담을 수 있는 모형의 최대 갯수는 0보다 커야 합니다.");
        }

        shapes = new Shape[maxCount];
        shapeCount = 0;
    }

    /*
     * 모형을 박스에 넣습니다.
     *
     * @param shape 넣을 모형입니다.
     * 
     * @throws InsufficientSpaceException 박스가 가득 찼을 경우 발생합니다.
     */
    public void put(Shape shape) throws InsufficientSpaceException {
        if (shapes.length <= shapeCount) { // 배열의 크기가 박스에 저장된 모형의 갯수보다 작으면
            throw new InsufficientSpaceException();
        }

        shapes[shapeCount++] = shape;
    }

    Shape[] shapeTypes = new Shape[shapeCount];

    /*
     * 박스에 저장된 모든 모형의 총 넓이를 반환합니다.
     *
     * @return 박스에 저장된 모든 모형의 총 넓이입니다.
     */
    public double getTotalArea() {
        // TODO: 도형 영역 합을 구하세요.
        int sum = 0;

        for (int i = 0; i < shapeCount; i++) {
            sum += shapes[i].getArea();
        }

        // for (Shape boxShape : shapes) {
        // if (boxShape != boxShape) {
        // sum += boxShape.getArea();
        // }
        // }
        return sum;
    }

    /*
     * 박스에 저장된 모형의 갯수를 반환합니다.
     *
     * @return 박스에 저장된 모형의 갯수입니다.
     */
    public int getCount() {
        // TODO: 도형 갯수를 구하세요.
        return shapeCount;
    }

    /*
     * 특정 이름의 모형의 총 넓이를 반환합니다.
     *
     * @param name 찾을 모형의 이름입니다.
     * 
     * @return 특정 이름의 모형의 총 넓이입니다.
     */
    public double getAreaOf(String name) {
        // TODO: 해당 이름의 도형 영역 합을 구하세요.

        // 다른 방법
        double sum = 0;
        for (int i = 0; i < shapeCount; i++) {
            if (shapes[i].toString().equals(name)) {

            }
        }

        for (Shape boxShape : shapes) {
            if (boxShape != null && boxShape.getClass().getSimpleName().equals(name)) {
                sum += boxShape.getArea();
            }
        }
        return sum;
    }

    /*
     * 특정 이름의 모형의 갯수를 반환합니다.
     *
     * @param name 찾을 모형의 이름입니다.
     * 
     * @return 특정 이름의 모형의 갯수입니다.
     */

    public int getCountOf(String name) {
        // TODO: 해당 이름의 도형 갯수를 구하세요.
        int count = 0;
        for (Shape boxShape : shapes) {
            if (boxShape.getClass().getSimpleName().equals(name)) {
                count++;
            }
        }
        return count;
    }
}
