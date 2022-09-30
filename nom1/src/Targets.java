public class Targets
{
    int hits;
    double radius;
    double distance;
    double shoot_number;
    double targets_amount;
    public Targets(double _radius, double _distance, double _targets_amount)
    {
        hits = 0;
        radius = _radius;
        distance = _distance;
        shoot_number = 0;
        targets_amount = _targets_amount;
    }
    public boolean Shot(double x, double y)
    {
        double target_x = shoot_number * distance;
        double distance_sq = Math.pow(x - target_x, 2) + Math.pow(y, 2);
        double radius_sq = radius * radius;
        shoot_number++;
        boolean hit = distance_sq <= radius_sq;
        if (hit)
        {
            hits++;
        }
        return hit;
    }
    public int Hits()
    {
        return hits;
    }

}
