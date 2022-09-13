package Exercise2;

import java.util.Arrays;

public class BikeTester {
    public static void main(String[] args) {
        int count = 0;


        Bike bike1 = new Bike();
        System.out.println(bike1);

        Bike bike2 = new Bike();
        bike2.setYear(2020);
        bike2.setManufacturer("Redline");
        System.out.println(bike2);

        Bike [] bikeList = {bike1,bike2};

        for(Bike b: bikeList){
            int wheels = b.getNumOfWheels();
            count += wheels;
        }

        System.out.println("\n" + "Number of Wheels in bikeList: " + count);
        int largest = bike1.getYear();

        for(Bike b:bikeList){
           int option = b.getYear();
                if (largest > option){
                    largest = option;
                }
        }

        System.out.println("\n" + "Oldest Bike is from: " + largest);
    }
}
