/*
 * 메인 클래스입니다. 박스에 모형을 추가하고, 모형의 총 개수, 총 넓이, 각 모형의 개수와 넓이를 출력합니다.
 *
 * @author NHN Academy
 */

package quiz5_9_10;

import java.util.Random;

public class Main {
    /*
     * 박스에 담을 수 있는 최대 모형의 개수입니다.
     */
    public static final int MAX_SHAPE_COUNT = 10;

    /*
     * 메인 메서드입니다. 박스에 모형을 추가하고, 모형의 총 개수, 총 넓이, 각 모형의 개수와 넓이를 출력합니다.
     *
     * @param args 실행 인자
     */
    public static void main(String[] args) throws Exception {
        /*
         * 박스를 생성하고, 랜덤으로 모형을 추가합니다.
         */
        Box box = new Box(MAX_SHAPE_COUNT);

        /*
         * 랜덤 숫자를 생성합니다.
         */
        Random random = new Random();

        /*
         * 박스에 모형을 추가합니다.
         */

        // while (boc.getCount() < MAX_SHAPE_COUNT)

        for (int i = 0; i < MAX_SHAPE_COUNT; i++) {
            try {
                switch (random.nextInt(3)) {
                    case 0 -> box.put(new Rectangle(10, 5));
                    case 1 -> box.put(new Triangle(10, 10));
                    default -> box.put(new Oval(15, 10));
                }
            } catch (IllegalArgumentException e) {

            } catch (InsufficientSpaceException e) {

            }
        }

        /*
         * 예외 처리 테스트를 수행합니다.
         */
        boolean testFailed = true;
        try {
            box.put(new Rectangle(10, 10));
        } catch (InsufficientSpaceException e) {
            System.out.println("박스에 더이상 모형을 담을 수 없습니다.");
            testFailed = false;
        }

        /*
         * 예외 처리 결과를 출력합니다.
         */
        if (testFailed) {
            System.out.println("Exception 처리가 실패 하였습니다.");
        } else {
            System.out.println("Exception 처리가 정상적으로 처리되었습니다.");
        }

        /*
         * 박스에 저장된 모형의 정보를 출력합니다.
         */

        System.out.printf("%16s : %10d%n", "Shape Count", box.getCount());
        System.out.printf("%16s : %10.1f%n", "Total Area", box.getTotalArea());
        System.out.printf("%16s : %10d%n", Triangle.class.getSimpleName(),
                box.getCountOf(Triangle.class.getSimpleName()));
        System.out.printf("%16s : %10.1f%n", Triangle.class.getSimpleName(),
                box.getAreaOf(Triangle.class.getSimpleName()));
        System.out.printf("%16s : %10d%n", Rectangle.class.getSimpleName(),
                box.getCountOf(Rectangle.class.getSimpleName()));
        System.out.printf("%16s : %10.1f%n", Rectangle.class.getSimpleName(),
                box.getAreaOf(Rectangle.class.getSimpleName()));
        System.out.printf("%16s : %10d%n", Oval.class.getSimpleName(),
                box.getCountOf(Oval.class.getSimpleName()));
        System.out.printf("%16s : %10.1f%n", Oval.class.getSimpleName(),
                box.getAreaOf(Oval.class.getSimpleName()));
    }
}
