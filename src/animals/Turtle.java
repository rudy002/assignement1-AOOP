package animals;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Turtle extends Animal
{
    private int age;
    private static Point location = new Point(80,0);
    public Turtle(String name)
    {
        super(name, location);
        this.setWeight(1);
        MessageUtility.logConstractor("Turtle", name);

    }

    public Turtle(String name, int age)
    {
        super(name, location);
        this.setWeight(1);
        setAge(age);
        MessageUtility.logConstractor("Turtle", name);

    }


    public boolean setName(String Name)
    {
        return true;
    }


    public String getName()
    {
        return this.getName();
    }


    public boolean setAge(int age)
    {
        if(age < 0 || age > 500)
        {
            this.age = 1;
            return false;
        }
        else
        {
            this.age = age;
            return true;
        }
    }


    public void chew()
    {
        System.out.println("Retracts its head in then eats quietly");
    }

    @Override
    public void makeSound() {
        chew();
    }

    @Override
    public Point getLocation()
    {
        return Turtle.location;
    }

    @Override
    public boolean setLocation(Point newLocation)
    {
        if(newLocation.getX() <= newLocation.getMaxX() && newLocation.getX() > 0 && newLocation.getY() <= newLocation.getMaxY() && newLocation.getY() > 0  )
        {
            Turtle.location.setX(newLocation.getX());
            Turtle.location.setY(newLocation.getY());
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