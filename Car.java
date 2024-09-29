import java.util.ArrayList; //need a resizable array for passengers
// methods found in https://www.geeksforgeeks.org/arraylist-in-java/ 

public class Car {
    private ArrayList<Passenger> Passengers;
    private int maxCapacity;

    //constructor 
    public Car(int maxCapacity){
        this.Passengers = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;
    }

    public int getCapacity(){
        return Passengers.size(); //how many elements are in the ArrayList
    }

    public int seatsRemaining(){
        int open;
        open = maxCapacity - Passengers.size(); //how many total seats - curr passengers
        return open;
    }

    //if there is space remaining in the car, the person is added to the array and true is returned
    public boolean addPassenger(Passenger Person){ 
        if(seatsRemaining() > 0){
            Passengers.add(Person); //appends the person to end
            return true;
        } else {
            return false;
        }
    }

    public boolean removePassenger(Passenger Person){
        if(Passengers.contains(Person)){
            Passengers.remove(Person); //if person is in Passengers, they are removed
            return true;
        } else {
            return false;
        }
    }

    public void printManifest(){
        if(Passengers.size() > 0){
            for(int i = 0; i < Passengers.size(); i++){
                System.out.println(Passengers.get(i)); //element at index i
            }
        } else {
            System.out.println("This car is EMPTY.");
        }

    }

}