package Bakery.src.controller;

import Bakery.src.model.Ingredient;

public interface IngredientControllerI {

    Ingredient storeIngredient(Ingredient ingredient);

    void collectIngredient(String name, int amount);
}
