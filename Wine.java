public class Wine extends Beverage {
    public Wine() {
        super("Wine");
    }

    @Override
    public String prepare() {
        return "Pouring wine into a glass and serving it at the recommended temperature.";
    }
}
