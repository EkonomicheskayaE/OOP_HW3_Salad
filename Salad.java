package oop_HW3_Salad;

public class Salad {
    private String base;
    private String ingredients;
    private String refill;
   

    public void setBase(String base) { 
        this.base = base; 
    }

    public void setIngredients(String ingredients) { 
        this.ingredients = ingredients; 
    }

    public void setRefill(String refill) { 
        this.refill = refill;
    }

    public void print() {
        System.out.println("Основой будут --> " + base);
        System.out.println("В качестве ингредиентов будем использовать --> " + ingredients);
        System.out.println("А заправкой будет --> " + refill + "!\n");
        
    }
}
