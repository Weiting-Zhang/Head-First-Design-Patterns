/**
 * CalifornizPizzaStore
 */
public class CalifornizPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new CalifornizStyleCheesePizza();
        // } else if(item.equals("clam")) {
        //     return new CalifornizStyleClamPizza();
        // } else if(item.equals("pepperini")) {
        //     return new CalifornizStylePepperoniPizza();
        } else return null;
    }
}