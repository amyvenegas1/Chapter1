package Exercise3;

public class TextBookTester {
    public static void main(String[]args){
        int count = 0;

        Textbook textbook1 = new Textbook();
        System.out.println(textbook1);

        Textbook textbook2 = new Textbook();
        textbook2.setPages(564);
        textbook2.setName("Programming Fundamentals");
        System.out.println(textbook2);

        Textbook [] textbookList = {textbook1,textbook2};
        for(Textbook b : textbookList){
            int pages = b.getPages();
            count += pages;
        }

        System.out.println("Number of pages in all textbooks: " + count);

        textbook2.favoriteBook();
    }
}
