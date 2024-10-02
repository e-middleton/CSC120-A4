//doesn't currently have a relationship with the train?

/**
 * Passenger class, has a name attribute and methods for boarding and getting off of Train cars
 */
public class Passenger {
    
    private String name;

    /**
     * Constructor for the Passenger class
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Accessor for the passenger's name
     * @return the name of the passenger
     */
    public String getName(){
        return name;
    }

    /**
     * The passenger boards the train car if there are empty seats remaining
     * @param c the Car the passenger is trying to board
     * @return true/false: whether or not it was possible to board the car
     */
    public boolean boardCar(Car c){
        if (c.addPassenger(this)){ //checks if addPassenger returns true
            return true;
        } else{
            return false;
        }
    }

    /**
     * The passenger gets off the car if they were in the car to begin with, otherwise it returns false
     * @param c the Car the passenger is trying to leave
     * @return true/false: whether or not they left the car, will return false if they were never in the car
     * in the first place
     */
    public boolean getOffCar(Car c){
        if (c.removePassenger(this)){ //if they were on the car, they can be removed
            return true;
        } else{
            return false;
        }
    }
}
