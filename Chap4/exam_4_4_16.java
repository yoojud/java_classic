package Chap4;
public class exam_4_4_16 {
    public static void main(String[] args) {
        // TODO: getSeason 서브루틴을 호출하여 계절 반환
        int month = 3;
        String season = getSeason(month);
        System.out.println("계절: " + season);

    }

    public static String getSeason(int month) {
        // TODO: 월에 따른 계절 반환
        switch (month) {
            case 12, 1, 2:
                return "겨울";
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            default:
                return "잘못 입력되었습니다.";
        }
    }
}
