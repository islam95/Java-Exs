/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimesTable;

/**
 * Class that outputs times tables up to 12 using nested loops.
 * 
 * @author Islam Dudaev
 * @version 18 October, 2014
 */
public class TimesTable 
{
    
    public static void main(String[] args)
    { 
        
        for(int table = 2; table <= 12; table++)
        {
            System.out.println("\nThe " + table + " times table:");
            
            for(int i = 1; i <= 12; i++)
            { 
                System.out.println("\t" + i + " x " + table + " is " + i * table);
            }
        }
    } 
    
}
