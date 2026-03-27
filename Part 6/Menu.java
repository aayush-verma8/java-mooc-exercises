
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!(this.meals.contains(meal))){
            this.meals.add(meal);
        }else{
           ;
        }
    }
    public void printMeals(){
        for(String menu:meals){
            System.out.println(menu);
        }
    }
    public void clearMenu(){
        meals.clear();
    }
}
