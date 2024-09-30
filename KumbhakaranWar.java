class KumbhaKaran{

    public String getPlates(Food food) throws FoodException{
        String regex="[0-9]{1,}";

        if(food.plate.matches(regex)){
            if(food.soldiers < 1000){
                throw new FoodException("Not Affordable");
            }
            return "Affordable";
        }else{
        throw new FoodException("Error in plate");
        }        
    }

    public String getWarStatus(Food food){
        try {
            if(getPlates(food).contains("Not Affordable") || getPlates(food).contains("Error in plate")){
                return "No War";
            }
        } catch (FoodException e) {
            e.getMessage();
        }
        return "War begun";
    }

    
}
class FoodException extends Exception{
    FoodException(String message){}
}

class Food{
    String plate;
    int soldiers;

    Food(String plate,int soldiers){
        this.plate = plate;
        this.soldiers = soldiers;
    }
}
public class KumbhakaranWar {
    public static void main(String[] args) {
        KumbhaKaran k = new KumbhaKaran();
        Food f = new Food("1234", 900);
        try {
            k.getPlates(f);
        } catch (FoodException e) {
            e.printStackTrace();
        }
        k.getWarStatus(f);
        
        
    }
}
