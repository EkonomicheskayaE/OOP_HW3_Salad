package oop_HW3_Salad;

public class VeganSalad extends SaladBuilder {
    public void buildBase() { 
        salad.setBase("редис, морковь, лук"); 
    }

    public void buildIngredients() {
        salad.setIngredients("огурцы, помидоры, перец");
    }

    public void buildRefill() {
        salad.setRefill("оливковое масло");
    }
}
