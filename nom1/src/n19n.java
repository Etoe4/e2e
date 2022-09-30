import java.util.Scanner;

public class n19n
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int mult_counter = in.nextInt();


        int start_point = 7;
        n19n_calculation calculation = new n19n_calculation(start_point, mult_counter);
for (int i = 1; i <= mult_counter; i++)
        {

            System.out.println(calculation.Calc(i));
        }
    }
}