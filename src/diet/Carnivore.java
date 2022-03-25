package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Carnivore implements IDiet {

    public boolean canEat(EFoodType food) {
        if(food == EFoodType.MEAT)
        return true;
        else return false;
    }

    public double eat(Animal animal, IEdible food) {

        if (food.getFoodtype() == EFoodType.MEAT){
            return animal.getWeight()* 1.10;
        }
        else return -1;
    }
}
