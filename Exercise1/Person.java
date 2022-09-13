/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 12, 2022
 * Description:This person class was created to provide a no arg constructor and a constructor that takes in arguments.
 * The tester tested the setter methods to see if the established variables would change.
 */
package Exercise1;

public class Person {
    private String name;
    private int age;
    private String eyeColor;


    public Person(){
        name = "Amy";
        age = 20;
        eyeColor = "Brown";
    }

    public Person(String newName,int newAge,String newEyeColor){
        name = newName;
        age = newAge;
        eyeColor = newEyeColor;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String newEyeColor){
        eyeColor = newEyeColor;
    }

    public String toString(){
      return "Name: " + name + "\n" + "Age: " + age + "\n" + "Eye Color: " + eyeColor;
    }

    public void talk(){
        System.out.println("Hello Coders! I am " + name + ".");
    }
}
