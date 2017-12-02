package by.votesystem.model;

import java.util.List;

/**
 * Restaurant change only admin.
 *
 * @title restaurant name
 * @menu Usually exist 2-5 items in menu. Admin change menu each day.
 */
public class Restaurant {
    private String title;
    private List<Dish> menu;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void removeItem(Dish dish) {
        menu.remove(dish);
    }

    public void addDishToMenu(Dish dish) {
        menu.add(dish);
    }

    public void cleanMenu() {
        menu.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Restaurant \"").append(title).append("\"");
        result.append("Menu list:\n");
        for (Dish tmpDish : menu) {
            result.append(tmpDish.getName()).append(" - ").append(tmpDish.getPrice()).append("\n");
        }
        return result.toString();
    }
}
