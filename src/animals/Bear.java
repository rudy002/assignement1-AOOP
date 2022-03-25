package animals;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends Animal
{
    private String furColor;
    private static Point location = new Point(100,5);
    public Bear(String name)
    {
        super(name, location);
        this.setWeight(308.2);
        MessageUtility.logConstractor("Bear", name);

    }

    public Bear(String name, String furColor)
    {
        super(name, location);
        this.setWeight(308.2);
        setFurColor(furColor);
        MessageUtility.logConstractor("Bear", name);

    }

    public boolean setName(String Name)
    {
        return true;
    }


    public String getName()
    {
        return this.getName();
    }

    public boolean setFurColor(String furColor)
    {
        if(furColor != "GRAY" && furColor != "WHITE" && furColor != "BLACK")
        {
            this.furColor = "GRAY";
            return false;
        }
        else
        {
            this.furColor = furColor;
            return true;
        }
    }


    public String getfurColor() {return this.furColor;}


    public void roar()
    {
        System.out.println("on its hind legs, roars and scratches its belly");
    }

    @Override
    public Point getLocation()
    {
        return Bear.location;
    }

    @Override
    public boolean setLocation(Point newLocation)
    {
        if(newLocation.getX() <= newLocation.getMaxX() && newLocation.getX() > 0 && newLocation.getY() <= newLocation.getMaxY() && newLocation.getY() > 0  )
        {
            Bear.location.setX(newLocation.getX());
            Bear.location.setY(newLocation.getY());
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

    @Override
    public void makeSound() {
        roar();
    }
}