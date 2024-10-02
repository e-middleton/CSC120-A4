
/**
 * Engine class, has attributes for fuelType, maximum Fuel, and current fuel level
 * Engine also has methods for accessing fuel type, maximum, and current level
 * as well as methods for making the engine run and refilling the fuel
 */
public class Engine {
    private FuelType f; //probs shouldn't change fueltype
    private double maxFuel;
    private double currentFuel;
   

    //why is my constructor so weird
    public Engine(FuelType f, double maxFuel){
        this.f = f;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
    }

    /**
     * accessor for the fuel type
     * @return fuel type for the engine
     */
    public FuelType getFuelType(){
        return this.f;
    }

    /**
     * accessor for the maximum fuel level
     * @return the maximum fuel level
     */
    public double getMaxFuel() {
        return this.maxFuel;
    }

    /**
     * accessor for the current fuel level
     * @return the current fuel level
     */
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    /**
     * refuels the train, topping up the current fuel to the max fuel level
     */
    public void refuel() {
        this.currentFuel = this.maxFuel; //resets the fuel level to the maximum
    }


    /**
     * if the train isn't yet out of fuel, it decreases the fuel and prints out remaining fuel level
     * @return boolean: true/false if the train can keep going
     */
    public boolean go(){
        if (this.currentFuel > 0){
            this.currentFuel -= 10;
            System.out.println("Current fuel level after moving is " + this.currentFuel + " hours of electricity");
            return true;
        } else {
            System.out.println("Whoops! No fuel! Can't drive! AAA!!!");
            return false;
        }
    }
}
