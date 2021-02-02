/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theprimenumberfinder;

import java.util.Scanner;


/**
 *
 * @author Kareem
 */
public class ThePrimeNumberFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner scanner1 = new Scanner(System.in);
      int start, end;
      System.out.println("Enter the number from which you want to find");
      start = scanner1.nextInt();
      System.out.println("Enter the number to which you want to find");
      end = scanner1.nextInt();
      
      
      boolean primenumber = true; //Assigned true by default for all so that only non-primes are later assigned to be false
      int i;
      int number;
      System.out.println("Prime numbers between are:");
      for(number = start;number<=end;number++)
      {
          for (i = 2;i<=number/2;i++)
          {
              if(number%i==0)
              {
                  primenumber = false;
              }
              else
              {
              System.out.println(number);
              }
              
              
          }
          
          
      }
     
      
    }
    
}
