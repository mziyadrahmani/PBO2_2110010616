/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2_2110010616;
import database.koneksi;
import java.sql.SQLException;
import forms.*;
/**
 *
 * @author LENOVO
 */
public class PBO2_2110010616 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new koneksi();
        new mainmenu().setVisible(true);
        
    }
    
}
