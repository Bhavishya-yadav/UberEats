public class CuisineBasedFilter implements FiltersInterface {
    CuisineType cuisineType;

    public CuisineBasedFilter(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public boolean shouldShow(FoodItem foodItem) {
        return foodItem.getType().equals(this.cuisineType);
    }
}
