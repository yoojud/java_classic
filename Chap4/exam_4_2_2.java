package Chap4;

public class exam_4_2_2 {
    // TODO: 정적 변수를 정의하세요.
    static int gamePlayed;
    static int gamesWon;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // TODO: playGame 서브루틴을 호출하여 게임을 시작하고 게임 수와 승리 수 출력하기
            playGame();
            System.out.println("Played: " + gamePlayed);
            System.out.println("Won: " + gamesWon);
        }
    }

    // TODO: playGame()을 구현하세요.
    static void playGame() {
        System.out.println("게임을 시작합니다.");
        gamePlayed++;
        if (Math.random() <= 0.5) {
            gamesWon++;
        }
    }

}
