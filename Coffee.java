public class Coffee extends Beverage {
    public Coffee() {
        super("Coffee");
    }

    @Override
    public String prepare() {
        return "Grinding coffee beans, adding hot water, and serving fresh coffee.";
    }
}
