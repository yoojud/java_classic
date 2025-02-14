package exam;

public class Swap {
    public static void Innerswap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;

    }

    public static void main(String[] args) {
        int i = 5;
        int j = i;

        i = i + 10;

        System.out.println(j);
    }

}