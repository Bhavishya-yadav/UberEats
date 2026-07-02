public class VegNonVegFilter implements FiltersInterface {

    boolean shouldShowVegItem;  

    @Override
    public boolean shouldShow(FoodItem foodItem) {
        return foodItem.isVeg() == shouldShowVegItem;
    }

    public boolean isShouldShowVegItem() {
        return shouldShowVegItem;
    }
    
}
