package animals;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends Animal
{
    private double neckLength;
    private static Point location = new Point(50,0);


    public Giraffe(String name)
    {
        super(name, location);
        this.setWeight(450);
        MessageUtility.logConstractor("Giraffe", name);

    }

    public Giraffe(String name, double neckLength)
    {
        super(name, location);
        this.setWeight(450);
        setNeckLength(neckLength);
        MessageUtility.logConstractor("Giraffe", name);

    }


    public boolean setName(String Name)
    {
        return true;
    }


    public String getName()
    {
        return this.getName();
    }


    public boolean setNeckLength(double neckLength)
    {
        if(neckLength < 1 || neckLength >2.5)
        {
            this.neckLength = 1.5;
            return false;
        }
        else
        {
            this.neckLength = neckLength;
            return true;
        }


    }
    public void chew()
    {
        System.out.println("Bleats and Stomps its legs, then chews");
    }

    @Override
    public void makeSound() {
        chew();
    }


    @Override
    public Point getLocation()
    {
        return Giraffe.location;
    }

    @Override
    public boolean setLocation(Point newLocation)
    {
        if(newLocation.getX() <= newLocation.getMaxX() && newLocation.getX() > 0 && newLocation.getY() <= newLocation.getMaxY() && newLocation.getY() > 0  )
        {
            Giraffe.location.setX(newLocation.getX());
            Giraffe.location.setY(newLocation.getY());
            return true;
        }
        else
            return false;
    }

    @Override
    public EFoodType getFoodtype()
    {
        return EFoodType.MEAT;
    }

    @Override
    public boolean eat(IEdible edible)
    {
        if(edible instanceof Animal)
            return false;
        else
            return true;
    }
}