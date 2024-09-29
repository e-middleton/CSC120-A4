
public class Engine {
//needs a fuel type attribute
    private FuelType f; //probs shouldn't change fueltype
    private double maxFuel;
    private double minFuel;
    private double currentFuel;
   

    //why is my constructor so weird
    public Engine(FuelType f, double maxFuel){
        this.f = f;
        this.maxFuel = maxFuel;
        this.minFuel = 0;
        this.currentFuel = maxFuel;
    }

    //getter 
    public FuelType getFuelType(){
        return this.f;
    }

    //Getter
    public double getMaxFuel() {
        return this.maxFuel;
    }

    //Getter
    public double getMinFuel() {
        return this.minFuel;
    }

    //Getter
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    public void refuel() {
        this.currentFuel = this.maxFuel; //resets the fuel level to the maximum
    }

    public boolean go(){
        if (this.currentFuel > 0){
            this.currentFuel -= 10;
            System.out.println("Current fuel level is " + this.currentFuel + " hours of electricity");
            return true;
        } else {
            System.out.println("Whoops! No fuel! Can't drive!");
            return false;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
