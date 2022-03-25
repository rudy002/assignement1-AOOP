package animals;
import mobility.Mobile;
import food.IEdible;
import diet.IDiet;
import mobility.Point;
import food.EFoodType;
import utilities.MessageUtility;

public abstract class Animal extends Mobile implements IEdible
{
    private String name;
    private double weight;
    private IDiet diet;

    public Animal(String name, Point location)
    {
        super(location);
        this.name = name;
    }
    public abstract EFoodType getFoodtype();
    public abstract boolean eat(IEdible edible);
    public String getName()
    {
        return this.name;
    }
    public boolean setName(String Name)
    {
        this.name = Name;
        return true;
    }


    public boolean setDiet(IDiet diet)
    {
        this.diet = diet;
        MessageUtility.logGetter(getName(), "setDiet", diet);
        return true;

    }

    public abstract void makeSound();


    public double getWeight() {return this.weight;}
    public void setWeight(double weight) {this.weight = weight;}

}

