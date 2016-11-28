/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateEx.java 
 * DateEx represents a date and time with millisecond precision and 
 * it is in java.util package.
 * 
 * A class to represent some DateEx methods.
 * 
 * @author Islam Dudaev
 * @version v1, 2 November, 2014
 */
public class DateEx {
    
    public static void main(String[] args){
        
        Date date = new Date();
        System.out.println(date);
        
        DateFormat df = DateFormat.getInstance();
        System.out.println(df.format(date));
        
        if(date.equals(df)){
            System.out.println("The date is the same!");
        } else {
            System.out.println("The date is different!");
        }
        
        if(date.equals(date.clone())){
            System.out.println("The same date: " + date.toString());
        }
        
        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Print a date in short format: " + df.format(date));
       
    }
    
}
