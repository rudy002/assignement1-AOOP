package diet;

import food.EFoodType;
import food.IEdible;
import animals.Animal;

public interface IDiet {
    public boolean canEat(EFoodType food);
    public double eat(Animal animal, IEdible food);
}