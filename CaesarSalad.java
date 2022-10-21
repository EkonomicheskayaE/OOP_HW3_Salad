package oop_HW3_Salad;

public class CaesarSalad extends SaladBuilder {
    public void buildBase() { 
        salad.setBase("листья салата"); 
    }

    public void buildIngredients() {
        salad.setIngredients("курица, сыр, томаты, сухари");
    }

    public void buildRefill() {
        salad.setRefill("соус цезарь");
    }
}
