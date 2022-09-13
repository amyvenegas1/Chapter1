/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 12, 2022
 * Description:This textbook class was created to provide a no arg constructor and a constructor that takes in arguments.
 * The tester tests to see if the constructors, setters,toString, and getters work accordingly
 */

package Exercise3;

public class Textbook {
    private int pages;
    private String name;
    private String author;

    public Textbook(){
        pages = 324;
        name = "Biology 101";
        author = "Scott";
    }

    public Textbook(int newPages, String newName, String newAuthor){
        pages = newPages;
        name = newName;
        author = newAuthor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }


    public String getAuthor(){
        return author;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public String toString(){
        return "Number of Pages: " + pages + "\n" + "Name of Textbook: " + name + "\n" + "Name of Author: " + author + "\n";
    }

    public void favoriteBook(){
        System.out.println("\n" + "My favorite textbook is " + name);
    }


}
