package Exercises;

//Probably one of the fastest ways to return if a string is palindrome, with a method

public class First {
    public static void main(String[] args) {
        String a = "reviver";
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(String a) {
        a = a.replaceAll("[^a-zA-Z0-9]","");
        return a.equalsIgnoreCase(new StringBuilder(a).reverse().toString());
    }
}
