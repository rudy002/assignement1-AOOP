package mobility;
import java.lang.Math;
public abstract class Mobile implements ILocatable
{
    private Point location;
    private Double totalDistance;

    public Mobile(Point location)
    {
        this.location = location;
        this.totalDistance = 0.0;
    }

    public Point getLocation()
    {
        return this.location;
    }


    public boolean setLocation(Point p)
    {
        this.location = p;
        return true;
    }


    public void addTotalDistance(double distance)
    {
        if(distance <=0)
        {
            System.out.println("The distance must be positive !");
        }
        else
        {
            this.totalDistance += distance;
        }
    }
    public double calcDistance(Point location)
    {
        return Math.sqrt(Math.pow(getLocation().getX() - location.getX(), 2) + (Math.pow(getLocation().getY() - location.getY(), 2)));
    }
    public double move(Point l)
    {
        if(this.location.getX() == l.getX() && this.location.getY() == l.getY())
        {
            return 0;
        }
        double sum = calcDistance(l);
        if(this.location.getX() + l.getX() > 800)
        {
            this.location.setX(800);
        }
        else
            this.location.setX(this.location.getX() + l.getY());

        if(this.location.getY() + l.getY() > 600)
        {
            this.location.setY(600);
        }
        else
            this.location.setY(this.location.getY() + l.getY());

        addTotalDistance(sum);
        return this.totalDistance;
    }
}
