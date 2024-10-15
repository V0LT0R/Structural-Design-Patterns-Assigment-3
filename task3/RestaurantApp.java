public class RestaurantApp {
    public static void main(String[] args) {
        // Create menu items
        MenuComponent pancakeItem = new MenuItem("Pancake", "Delicious pancake with syrup", 5.99);
        MenuComponent waffleItem = new MenuItem("Waffle", "Crispy waffle with butter", 4.99);
        MenuComponent burgerItem = new MenuItem("Burger", "Juicy beef burger", 8.99);
        MenuComponent friesItem = new MenuItem("Fries", "Crispy golden fries", 2.99);
        MenuComponent saladItem = new MenuItem("Salad", "Fresh garden salad", 3.99);

        // Create breakfast menu
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning dishes");
        breakfastMenu.add(pancakeItem);
        breakfastMenu.add(waffleItem);

        // Create lunch menu
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");
        lunchMenu.add(burgerItem);
        lunchMenu.add(friesItem);
        lunchMenu.add(saladItem);

        // Create dinner menu (can contain sub-menus)
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening meals");
        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with vegetables", 12.99));
        dinnerMenu.add(new MenuItem("Pasta", "Pasta with marinara sauce", 9.99));
        dinnerMenu.add(lunchMenu); // Add lunch menu as a sub-menu in dinner menu

        // Create main menu (contains all other menus)
        MenuComponent mainMenu = new Menu("Main Menu", "All available dishes");
        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);
        mainMenu.add(dinnerMenu);

        // Print the entire menu
        mainMenu.print();
    }
}
