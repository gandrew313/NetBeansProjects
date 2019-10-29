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


public class Wages {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
    int count = 1;
    
    while (count <= 3) {
        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        
        double pay; 
        
        if (hours > 40) {
            pay = (40 * rate) + (hours -40) * (rate * 1.5);
        }
        else {
            pay = hours * rate;
        }
        
        System.out.printf("Pay for employee %d is $%.2f", count, pay);
        
        ++count;
        }
    }
}
