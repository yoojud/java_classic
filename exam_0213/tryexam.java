package exam_0213;

import java.util.Scanner;

public class tryexam {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int i = 0;
            int j = 0;

            String line = scanner.nextLine();
            i = Integer.parseInt(line);
            line = scanner.nextLine();
            j = Integer.parseInt(line);

            int result = i / j;

            System.out.println(result);
            // scanner.close();

        } catch (Exception e) {
            System.out.println("an error occured");
            // } catch (NumberFormatException e) {
            // System.out.println("please enter a digit");
            // } catch (ArithmeticException e) {
            // System.out.println("can't divide by zero");
            // }

        }
    }
}
