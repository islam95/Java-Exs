/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChooser;

import javax.swing.JFileChooser;

/**
 * FileChooser.java With the help of this class the user can choose file from
 * the system.
 *
 * A class to show some methods for JFileChooser class.
 *
 * @author Islam Dudaev
 * @version v1, 2 November, 2014
 */
public class FileChooser {

    public static void main(String[] args) 
    {

        JFileChooser chooseFile = new JFileChooser();
        int returnVal = chooseFile.showDialog(null, "Open");

        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            String str = chooseFile.getSelectedFile().getName();
            
            if(str.toUpperCase().endsWith(".TXT") ||
                    str.toUpperCase().endsWith(".DOC"))
            {
                System.out.println("You chose to open this file: " + str);
            } 
            else 
            {
                System.out.println("You must choose \".TXT\" or \".DOC\" files.");
                System.out.println("Chosen file: " + str);
            }
        } 
        else if(returnVal == JFileChooser.CANCEL_OPTION)
        {
            System.out.println("You canceled the program!");
        } 
        else if(returnVal == JFileChooser.ERROR_OPTION)
        {
            System.out.println("Error!");
        }
    }

}
