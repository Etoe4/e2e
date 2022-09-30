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
public class biathlete {
    public static void main(String[] args)
    {
        double x;
        double y;
        double target_count = 5;
        double distance_between_targets = 25;
        double target_radius = 10;

        Targets targets = new Targets(target_radius, distance_between_targets, target_count);
        Scan input = new Scan();

        System.out.println("You are biathlete, time to shot targets");
        for (int i = 0; i < target_count; i++)
        {
            System.out.println(i + 1 + " target");

            System.out.print("x = ");
            x = input.XY();

            System.out.print("y = ");
            y = input.XY();


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