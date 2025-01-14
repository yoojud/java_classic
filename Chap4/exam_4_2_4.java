package Chap4;
public class exam_4_2_4 {
    // TODO: 정적 변수를 정의하세요.
    static int gamesCount;
    static int gamesWon;

    public static void main(String[] args) {
        // TODO: playGame과 showScore 서브루틴을 순차적으로 호출하여 게임을 진행
        for (int i = 0; i < 10; i++) {
            playGame();
            showScore();
        }
    }

    // TODO: playGame을 구현하세요.
    public static void playGame() {
        gamesCount++;
        System.out.println("게임을 시작합니다.");
        System.out.print("Played: " + gamesCount + ", ");
    }

    // TODO: showScore을 구현하세요.
    public static void showScore() {
        if (Math.random() <= 0.5) {
            gamesWon++;
        }
        System.out.print("Won: ");
        System.out.println(gamesWon);
    }

}
