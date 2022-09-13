/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 12, 2022
 * Description:This bike class was created to provide a no arg constructor and a constructor that takes in arguments.
 * The tester tests the constructors, setters, getters and any instance methods established.
 */
package Exercise2;

public class Bike {
    private int numOfWheels;
    private String manufacturer;
    private int year;

    public Bike(){
        numOfWheels = 2;
        manufacturer = "Schwinn";
        year = 2014;
    }

    public Bike(int newNumOfWheels, String newManufacturer, int newYear){
        numOfWheels = newNumOfWheels;
        manufacturer = newManufacturer;
        year = newYear;
    }

    public int getNumOfWheels(){
        return numOfWheels;
    }

    public void setNumOfWheels(int newNumOfWheels){
        numOfWheels = newNumOfWheels;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer){
        manufacturer = newManufacturer;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear) {
         year = newYear;
    }

    @Override
    public String toString(){
        return "Number of Wheels: " + numOfWheels + "\n" + "Manufacturer: " + manufacturer + "\n" + "Year: " + year + "\n";
    }
}
