package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;


public class Herbivore implements IDiet {

    public boolean canEat(EFoodType food) {
        if(food == EFoodType.VEGETABLE)
            return true;
        else return false;
    }

    public double eat(Animal animal, IEdible food) {

        if (food.getFoodtype() == EFoodType.MEAT){
            return animal.getWeight()* 1.07;
        }
        else return -1;
    }

}
