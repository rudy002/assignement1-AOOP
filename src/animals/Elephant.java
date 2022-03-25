package animals;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends Animal
{
    private double trunkLength;
    private static Point location = new Point(50,90);


    public Elephant(String name) //constructor
    {
        super(name, location);
        this.setWeight(500);
        MessageUtility.logConstractor("Elephant", name);

    }

    public Elephant(String name, double Trunk) //constructor
    {
        super(name, location);
        this.setWeight(500);
        settrunkLength(Trunk);
        MessageUtility.logConstractor("Elephant", name);

    }


    public boolean setName(String Name)
    {
        return true;
    }


    public String getName()
    {
        return this.getName();
    }



    public boolean settrunkLength(double trunkLength)
    {
        if(trunkLength < 0.5 || trunkLength >3)
        {
            this.trunkLength = 1;
            return false;
        }
        else
        {
            this.trunkLength = trunkLength;
            return true;
        }
    }

    public double gettrunkLength() {return this.trunkLength;}

    public void chew()
    {
        System.out.println("Trumpets with joy while flapping its ears, then chews");
    }

    @Override
    public void makeSound() {
        chew();
    }

    @Override
    public Point getLocation()
    {
        return Elephant.location;
    }

    @Override
    public boolean setLocation(Point newLocation)
    {
        if(newLocation.getX() <= newLocation.getMaxX() && newLocation.getX() > 0 && newLocation.getY() <= newLocation.getMaxY() && newLocation.getY() > 0  )
        {
            Elephant.location.setX(newLocation.getX());
            Elephant.location.setY(newLocation.getY());
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
        if(edible instanceof Lion)
            return false;
        else
            return true;
    }
}