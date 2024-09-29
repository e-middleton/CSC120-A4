public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    //Accessor
    public String getName(){
        return name;
    }

    //if there is space in a car, the passenger may enter
    public boolean boardCar(Car c){
        if (c.addPassenger(this)){ //checks if addPassenger returns true
            return true;
        } else{
            return false;
        }
    }

    public boolean getOffCar(Car c){
        if (c.removePassenger(this)){ //if they were on the car, they can be removed
            return true;
        } else{
            return false;
        }
    }

}
