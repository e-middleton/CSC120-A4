import java.util.ArrayList; //need a resizable array for passengers
// methods for ArrayLists found in https://www.geeksforgeeks.org/arraylist-in-java/ 

/**
 * class Car which has attributes for an ArrayList of passengers and the maximum capacity of the car
 * there are methods for accessing the attributes and finding how many passengers are on board, as well as adding and 
 * removing passengers and printing who is aboard
 */
public class Car {
    private ArrayList<Passenger> Passengers;
    private int maxCapacity;

    //constructor
    public Car(int maxCapacity){
        this.Passengers = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;
    }

    /**
     * accessor for the maximum capacity of the car
     * @return the maximum capacity for the car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * finds how many passengers are currently in the car
     * @return the number of passengers currently in the car
     */
    public int getCurrentCapacity(){
        return Passengers.size(); //how many elements are in the ArrayList
    }

    /**
     * finds how many empty seats are in the car by subtracting the current passengers from the maximum capacity
     * @return the number of empty seats
     */
    public int seatsRemaining(){
        int open;
        open = maxCapacity - Passengers.size(); //how many total seats - curr passengers
        return open;
    }

    /**
     * checks to see if there is available seats, and if there is, adds a passenger to the car
     * @param Person the passenger trying to be added to the car
     * @return boolean true/false: whether or not the person was added to the car
     */
    public boolean addPassenger(Passenger Person){ 
        if(seatsRemaining() > 0){
            Passengers.add(Person); //appends the person to end of the ArrayList
            return true;
        } else {
            return false;
        }
    }

    /**
     * checks to see if a person is in the train car, and if they are, removes them from it
     * @param Person the passenger they're trying to remove from the car
     * @return boolean true/false: whether or not the passenger was removed from the car
     */
    public boolean removePassenger(Passenger Person){
        if(Passengers.contains(Person)){
            Passengers.remove(Person); //if person is in Passengers, they are removed
            return true;
        } else {
            return false;
        }
    }

    /**
     * prints out a list of the passengers currently in the car, if nobody is in the car, says the car is EMPTY
     */
    public void printManifest(){
        if(Passengers.size() > 0){
            System.out.println("In this car is:");
            for(int i = 0; i < Passengers.size(); i++){
                System.out.println((Passengers.get(i)).getName()); //element at index i and then calls method getName so it's not just saying that an object exists
            }
        } else {
            System.out.println("This car is EMPTY.");
        }

    }
}