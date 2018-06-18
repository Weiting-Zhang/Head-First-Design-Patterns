/**
 * NYPizzaStore
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        // } else if(item.equals("clam")) {
        //     return new NyStyleClamPizza();
        // } else if(item.equals("pepperini")) {
        //     return new NYStylePepperoniPizza();
        } else return null;
    }
}