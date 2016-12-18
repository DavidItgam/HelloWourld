/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txt;

import java.io.File;
import java.io.FileWriter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class TXT {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int [] array = {1,2,3,4};
       JOptionPane.showConfirmDialog(null, array[2]);
       System.out.print(array[2]);
    }
    
}
