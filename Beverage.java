public abstract class Beverage {
    private final String name;

    protected Beverage(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract String prepare();
}
