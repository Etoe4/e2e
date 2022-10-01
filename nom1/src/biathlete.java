/*
*  targets = new Targets(25, 10, 5)
*
*   for .... {
*   x = ..
*   y = ...
*   result = targets.Shoot(x, y)
*   if result {
*  "hit
*  else ..
*   }
*    targets.Hits()
* */
// main programm
public class biathlete {
    public static void main(String[] args)
    {
        double x;   //axis x
        double y;   //axis y
        double target_count = 5;
        double distance_between_targets = 25;
        double target_radius = 10;

        Targets targets = new Targets(target_radius, distance_between_targets, target_count);
        Scan input = new Scan();

        System.out.println("You are biathlete, time to shot targets");
        for (int shot = 0; shot < target_count; shot++) // target shooting
        {
            System.out.println(shot + 1 + " target"); // number target

            System.out.print("x = ");
            x = input.double_var();

            System.out.print("y = ");
            y = input.double_var();

            if (targets.Shot(x, y))
            {
                System.out.println("HIT");
            }
            else
            {
                System.out.println("MISS");
            }
        }
        System.out.print(targets.Hits() + " YOU HIT");
    }

}