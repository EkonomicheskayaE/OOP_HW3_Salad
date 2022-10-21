package oop_HW3_Salad;

public abstract class SaladBuilder {
    protected Salad salad;

    public Salad getSalad() { 
        return salad; 
    }

    public void createSalad() { 
        salad = new Salad(); 
    }

    public abstract void buildBase();
    public abstract void buildIngredients();
    public abstract void buildRefill();
}

