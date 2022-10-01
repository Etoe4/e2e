public class counting
{
    public static void main(String[] args)
    {
        Scan input = new Scan();
        double mult_num = input.double_var();
        double start_num = 7;
        counting_calculation calculation = new counting_calculation(start_num, mult_num);

for (double i = 1; i <= mult_num; i++)
        {
            System.out.println(calculation.Calc(i));
        }
    }
}