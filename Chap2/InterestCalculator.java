package Chap2;
public class InterestCalculator {
    public static void main(String[] args) {
        int principal = 15000;
        double rate = 0.05;
        // double interest = principal * rate;
        int interest = (int)(principal * rate);
        System.out.println("이자는: " + interest);
    }
    
}
