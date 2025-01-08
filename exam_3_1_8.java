import java.util.Scanner;

public class exam_3_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.print("정수를 입력하세요: ");
        while(i<2)
        {
            int num1 = sc.nextInt();

            if(sc.nextInt()==0) {
                sc.close();
            }
            
            System.out.printf("%d %d %d %n", num1);
        }
        
        
        sc.close();
    }
}
