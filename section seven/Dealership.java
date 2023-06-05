public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        
        // creates a reference trap. Don't do this
        // this.cars = Arrays.copyOf(cars, cars.length);

        //do this
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void sell(int index){
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;    
    }
}

    