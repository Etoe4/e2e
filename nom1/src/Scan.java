import java.util.Scanner;

public class Scan {
    double x2;
    public double XY()
    {
        for (int i = 0; i < 1; i++) {
            try {


                Scanner input = new Scanner(System.in);

                x2 = input.nextInt();

            } catch (Exception e) {
                System.out.println("try another input");
                i--;


            }

        }
        return x2;

    }
}
