public abstract class RacletteDecorator implements Raclette {
    protected Raclette decoratedRaclette;

    public RacletteDecorator(Raclette raclette) {
        this.decoratedRaclette = raclette;
    }

    @Override
    public int getCalories() {
        return decoratedRaclette.getCalories();
    }

    @Override
    public String getIngredients() {
        return decoratedRaclette.getIngredients();
    }

    @Override
    public String toString() {
        return getIngredients() + " pour " + getCalories() + " calories";
    }
}
