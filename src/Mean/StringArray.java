/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mean;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author islam
 */
public class StringArray {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a string: ");
        String str = scan.nextLine();
        
        // Spliting a string and storing it in an array.
        String[] strArray = str.split(" ");
        
        //System.out.println(Arrays.toString(strArray));
        for (String s : strArray){
            System.out.println(s);
        }
        
 // Task 6.2
        
        int[] data = {4,6,2,8,1,7};
        
        int min = data[0];
        
        for(int i = 1; i < data.length; i++){
            
            if(data[i] < min){
                min = data[i];
            }
        }
        System.out.println("Minimum: " + min);
    
        int num1 = 2;
        int num2 = 6;
        
        if(num1 < num2){
            System.out.println("Tag 2 wins!");
        } else if(num1 > num2){
            System.out.println("Tag 1 wins!");
        } else if(num1 == num2){
            System.out.println("It is a draw!");
        }
        
        
    }
    
        
 
}
