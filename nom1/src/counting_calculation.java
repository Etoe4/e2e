public class counting_calculation {
    double starter_num;
    double multiplication_num;
    public counting_calculation(double _starter_num, double _multiplication_num)
    {
        starter_num = _starter_num;
        multiplication_num = _multiplication_num;
    }
    public double Calc(double counter)
    {
        return (starter_num + counter * multiplication_num);
    }
}