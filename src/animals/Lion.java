
package animals;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import utilities.MessageUtility;

public class Lion extends Animal {

    private int scarCount = 0;
    private static Point location = new Point(20,0);

    public Lion(String name)
    {
        super(name, location);
        this.setWeight(408.2);
        MessageUtility.logConstractor("Lion", name);
    }


    public int getscarCount(){return scarCount;}

    public void setScarCount(int scarCount){this.scarCount = scarCount;}

    public void roar(){System.out.println("Roars, then stretches and shakes its mane");}


    @Override
    public EFoodType getFoodtype(){return EFoodType.NOTFOOD;}


    @Override
    public boolean eat(IEdible obj) {
        if (obj instanceof  Animal && !(obj instanceof Lion)){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            int temp = getscarCount() + randomNum;
            setScarCount(temp);
            return true;
        }
        else return false;

    }

    @Override
    public void makeSound() {
        roar();
    }

    @Override
    public Point getLocation()
    {
        return Lion.location;
    }

    @Override
    public boolean setLocation(Point newLocation)
    {
        if(newLocation.getX() <= newLocation.getMaxX() && newLocation.getX() > 0 && newLocation.getY() <= newLocation.getMaxY() && newLocation.getY() > 0  )
        {
            Lion.location.setX(newLocation.getX());
            Lion.location.setY(newLocation.getY());
            return true;
        }
        else
            return false;
    }





}