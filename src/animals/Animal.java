package animals;;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import mobility.Mobile;
import diet.IDiet;

public abstract class Animal extends Mobile implements IEdible {

    private String name;
    private double weight;
    private IDiet diet;

    public Animal(String name, Point location){ //
        super(location);
        this.name = name;
    }

    public abstract EFoodType getFoodtype();

    public abstract boolean eat(IEdible obj);

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
