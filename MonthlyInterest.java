public class MonthlyInterest {
    public static void main(String[] args) {
        int balance = 100;
        double rate = 0.05;

        for (int month = 1; month <= 12; month++) {
            balance += balance * rate;
        }
        
        System.out.println("최종 잔액: " + balance);
    }
}
