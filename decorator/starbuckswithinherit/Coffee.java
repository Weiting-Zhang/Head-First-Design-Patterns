/**
 * Coffee
 */
public class Coffee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setMilk();
        darkRoast.setMocha();
        darkRoast.getDescription();
        System.out.println("A dark roast with milk and mocha costs: " + darkRoast.cost());
    }
}