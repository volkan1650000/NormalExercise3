package Exercises;

public class Second {
    //Given the total page amount in a book, which is "n", the code shows the minimum pages to turn to arrive at page "p",
    // from either the front or from the back, when the book is opened, page "1" is always on the right side, and so it goes on
    public static void main(String[] args) {

        //total amount of pages :
        int n = 9;
        //the page to arrive at :
        int p = 2;

        int pageLength = n/2+1;
        int fromFront = p/2+1;
        int fromBack = pageLength-fromFront+1;

        System.out.println("To open the book : "+"1,"+" turning amount after opening : "+(fromFront-1));
        System.out.println("To open the book : "+"1,"+" turning amount after opening : "+(fromBack-1));
        int min = Math.min(fromBack, fromFront);
        System.out.println();
        System.out.println("That's why the minimum amount of the pages to turn after opening the book is : "+(min-1));
    }
}
