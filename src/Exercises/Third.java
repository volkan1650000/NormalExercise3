package Exercises;

//Code to print the pattern of the 'N' letter with the x being the height of 'N';

public class Third {
    public static void main(String[] args) {
        int x = 25;
        int y = x-2;
        for(int i = 1; i<=x; i++){
            System.out.print("*");
            if(i==1 || i==x){
                for(int j = 0; j<y; j++){
                    System.out.print(" ");
                }
            }else{
                for(int j = 0; j<i-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j<x-1-i; j++){
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
