import java.util.Scanner;
public class Scan { // input function
    public double double_var()
    {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();

        } catch (java.util.InputMismatchException e) {
            System.out.println("You need input a number");
            double_var();
        }
        return 0;
    }
}
