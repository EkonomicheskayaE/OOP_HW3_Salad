package oop_HW3_Salad;

public class Waiter {
    private SaladBuilder saladBuilder;

    public void setSaladBuilder(SaladBuilder pb) { 
        saladBuilder = pb; 
    }
    public Salad getSalad() { 
        return saladBuilder.getSalad(); 
    }

    public void constructSalad() {
       saladBuilder.createSalad();
       saladBuilder.buildBase();
       saladBuilder.buildIngredients();
       saladBuilder.buildRefill();
    }
}

