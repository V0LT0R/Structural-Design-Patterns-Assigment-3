public class PizzaShop {
    public static void main(String[] args) {
        // Create a basic Margherita Pizza
        Pizza pizza1 = new MargheritaPizza();
        System.out.println(pizza1.getDescription() + " Cost: $" + pizza1.getCost());

        // Add Cheese and Mushroom toppings to the pizza
        Pizza pizza2 = new MargheritaPizza();
        pizza2 = new CheeseTopping(pizza2);
        pizza2 = new MushroomTopping(pizza2);
        System.out.println(pizza2.getDescription() + " Cost: $" + pizza2.getCost());

        // Create a Vegetarian Pizza with Pepperoni and Cheese toppings
        Pizza pizza3 = new VegetarianPizza();
        pizza3 = new PepperoniTopping(pizza3);
        pizza3 = new CheeseTopping(pizza3);
        System.out.println(pizza3.getDescription() + " Cost: $" + pizza3.getCost());
    }
}
