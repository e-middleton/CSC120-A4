import java.util.ArrayList;

/**
 * class Train which has an Arraylist of Cars that belong to the train as well as an Engine that it uses to run
 * has methods for accessing the attributes as well as getting the maximum capacity, seats remaining, and a printed
 * list of who is on the entire train
 */
public class Train {
    private ArrayList<Car> Cars; //the train of cars
    private Engine trainEngine;

    /**
     * Constructor for the Train
     * @param fuelType which type of fuel the Engine is using
     * @param fuelCapacity the maximum fuel level of the Engine
     * @param nCars How many cars this train has
     * @param passengerCapacity the maximum number of passengers for each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.trainEngine = new Engine(fuelType, fuelCapacity);
        this.Cars = new ArrayList<Car>(nCars); 
        for(int i = 0; i < nCars; i++){
            Car boxCar = new Car(passengerCapacity);
            Cars.add(boxCar); //initializes car objects inside the arrayList
        }
    }

    /**
     * Accessor for the Engine
     * @return the Engine for this specific train
     */
    public Engine getEngine(){
        return trainEngine;
    }

    /**
     * finds a car at a specified index in the ArrayList of all the cars in the train
     * @param i the index for the ArrayList of cars, or the number of the train car you want to find
     * @returnt the Car at the index i
     */
    public Car getCar(int i){
        return Cars.get(i);
    }

    /**
     * finds the maximum capacity of the entire train by going into each car and adding its maximum capacity
     * @return the maximum capacity of the train
     */
    public int getMaxCapacity(){
        return Cars.size() * (Cars.get(0).getCapacity()); 
    }

    /**
     * finds how many seats are empty across the entire train by going to each car and getting its empty seats
     * then adding it to the other empty seats
     * @return the number of seats empty
     */
    public int seatsRemaining(){
        int seats = 0;
        if(Cars.size() > 0){
            for(int i = 0; i < Cars.size(); i ++){
                seats += Cars.get(i).seatsRemaining();
            }
        } 
        return seats;
    }

    /**
     * Function that prints out all the passengers in the train by going to each car 
     * (if it exists) and asking the car to print its passengers
     */
    public void printManifest(){
        if(Cars.size() > 0){
            System.out.println("PASSENGERS ABOARD THE POLAR EXPRESS");
            System.out.println();
            for(int i = 0; i < Cars.size(); i++){
                Cars.get(i).printManifest();
            }
        } else{
            System.out.println("Whoops, empty train? :()");
        }
    }

public static void main(String[] args) {
    Train myTrain = new Train(FuelType.ELECTRIC, 100, 3, 25);
        Passenger victim = new Passenger("Jane");
        Passenger victim2 = new Passenger("Tim");
        //System.out.println(myTrain.seatsRemaining());
        myTrain.getCar(0).addPassenger(victim);
        myTrain.getCar(1).addPassenger(victim2);
        myTrain.printManifest();
        System.out.println();

        victim.getOffCar(myTrain.getCar(0));
        myTrain.printManifest();
    }
}
