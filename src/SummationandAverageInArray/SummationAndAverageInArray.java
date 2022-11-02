/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummationandAverageInArray;
import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class SummationAndAverageInArray { public static void main(String[]args)
    {
        
     //variable declaration area
        int i;
        double Summation=0;
        
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Any Four Positive Numbers:");
    double[]myArray=new double[4];
    for( i=0;i<myArray.length;i++)
     {
        myArray[i]= input.nextDouble();
     }
    
    
    for(i=0;i<myArray.length;i++)
    {
        Summation=Summation+myArray[i];
    }
    System.out.println("Summation Output is:"+Summation);
    System.out.println("Average Output is:"+Summation/myArray.length);
    }
    
    
}
