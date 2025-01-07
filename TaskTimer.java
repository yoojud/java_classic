public class TaskTimer {
    public static void main(String[] args) {
        // TODO: 시작 시간 저장
        long startTime;
        long endTime;
        long compTime;
        double seconds;

        startTime = System.nanoTime();

        // 작업: 1부터 100까지 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // TODO: 종료 시간 저장
        endTime = System.nanoTime();

        // TODO: 소요 시간 계산
        compTime = endTime - startTime;
        seconds = compTime / 1000000000.0;
        
        // TODO: 소요 시간 출력
        System.out.println("작업 소요 시간(초): " + seconds);

    }
}
