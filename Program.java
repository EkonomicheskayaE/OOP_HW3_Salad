package oop_HW3_Salad;

public class Program {
    public static void main(String[] args) {
        Waiter waiter1 = new Waiter();
        SaladBuilder veganSalad = new VeganSalad();
        waiter1.setSaladBuilder(veganSalad);
        waiter1.constructSalad();

        Waiter waiter2 = new Waiter();
        SaladBuilder caesarSalad = new CaesarSalad();
        waiter2.setSaladBuilder(caesarSalad);
        waiter2.constructSalad();

        Salad salad1 = waiter1.getSalad();
        System.out.println("Допустим мы решили приготовить овощной салатик:\n");
        salad1.print();

        Salad salad2 = waiter2.getSalad();
        System.out.println("А теперь нам захотелось сделать салат Цезарь:\n");
        salad2.print();

        System.out.println("Приятного аппетита!");
        
    }
}
