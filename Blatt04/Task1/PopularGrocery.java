package Blatt04.Task1;

public abstract class PopularGrocery extends GroceryItem{
    int popularityLevel;
    int quantity;

    public PopularGrocery(int popularityLevel) {
        this.isPopular = true;
        this.popularityLevel = popularityLevel;
    }

    @Override
    boolean showWarning() {
        return quantity > householdLimit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
