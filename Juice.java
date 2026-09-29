public class Juice extends Beverage {
    public Juice() {
        super("Juice");
    }

    @Override
    public String prepare() {
        return "Blending fresh fruit, adding ice, and serving chilled juice.";
    }
}
