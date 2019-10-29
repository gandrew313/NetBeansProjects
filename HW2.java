/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author AndrewGertz
 */
import java.util.Scanner;

public class HW2 {
   
    public static void main (String []args){
        int highest= Integer.MIN_VALUE;
        int lowest= Integer.MAX_VALUE;
        int num= 0;
Scanner scan = new Scanner(System.in);


for(int i=0; i<10; i++){

   System.out.print("Enter a number:");
   num = scan.nextInt();
   if (num > highest){

    highest = num;
   }

   if(num < lowest){

    lowest = num;
   }

}



   System.out.println("Highest number is: " + highest);
   System.out.println("Lowest number is: " + lowest);
    }
    
} 