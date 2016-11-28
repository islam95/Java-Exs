/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GregorianCal;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Gregorian.java GreagorianCalendar class is in java.util package and it is a
 * subclass of Calendar class. It implements calendar systems.
 *
 * A class to show some methods from GregorianCalendar class.
 *
 * @author Islam Dudaev
 * @version v1, 2 November, 2014
 */
public class Gregorian {

    public static void main(String[] args) {
     
        GregorianCalendar calendar = new GregorianCalendar();
        
        System.out.println("Current Time:");
        System.out.println(calendar.getTime());
        
        System.out.print("Date: ");
        System.out.println(calendar.get(Calendar.DATE) + "/" 
                + calendar.get(Calendar.MONTH) + "/" + calendar.getWeekYear());
        
        System.out.print("Time is: ");
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" 
                + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        calendar.set(2016, 9, 24); // sets new date
        
        if(calendar.isLeapYear(calendar.getWeekYear())){
            System.out.println("Year " + calendar.getWeekYear() + " is a leap year!!!");
        } else{
            System.out.println("Year " + calendar.getWeekYear() + " is not leap year!");
        }

    }

}
