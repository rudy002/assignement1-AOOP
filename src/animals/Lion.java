package animals;

import food.EFoodType;
import food.IEdible;
import mobility.Point;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lion extends Animal {

    private int scarCount = 0;
    private static Point location = new Point(20,0);

    public int getscarCount(){return scarCount;}

    public void setScarCount(int scarCount) {
        this.scarCount = scarCount;
    }

    public Lion(String name){// Constructor
        super(name, this.location);

        this.setWeight(408.2);

    }

    public void roar(){
        System.out.println("Roars, then stretches and shakes its mane");
    }

    @Override
    public EFoodType getFoodtype() {
        return EFoodType.NOTFOOD;
    }

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
    public Point getLocation() {
        return null;
    }

    @Override
    public boolean setLocation(Point newLocation) {
        return false;
    }
}
