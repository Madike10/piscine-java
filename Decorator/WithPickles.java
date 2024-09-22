public class WithPickles extends RacletteDecorator {

    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return decoratedRaclette.getCalories() + 50;
    }

    @Override
    public String getIngredients() {
        return decoratedRaclette.getIngredients() + ", cornichons";
    }

    @Override
    public String toString() {
        return getIngredients() + " pour " + getCalories() + " calories";
    }
}
