public class n19n_calculation {
    int starter_point;
    int multiplication_counter;
    int answer;


    public n19n_calculation(int _starter_point, int _multiplication_counter)
    {
        starter_point = _starter_point;
        multiplication_counter = _multiplication_counter;
        return;

    }
    public int Calc(int _counter)
    {
         answer = starter_point + _counter * multiplication_counter;
        return (answer);


    }

}


