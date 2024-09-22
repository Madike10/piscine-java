public class WithColdMeats extends RacletteDecorator {

    public WithColdMeats(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return decoratedRaclette.getCalories() + 350;
    }

    @Override
    public String getIngredients() {
        return decoratedRaclette.getIngredients() + ", charcuterie";
    }

    @Override
    public String toString() {
        return getIngredients() + " pour " + getCalories() + " calories";
    }
}
