/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm_interface;
import java.util.*;
/**
 *
 * @author anvek
 */
public class ATM_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bank ATM Interface");
        BankAccount userAccount = new SavingsAccount(1000.0);
        ATM atm = new ATM(userAccount, sc);
        atm.displayMenu();
        sc.close();
    }
    
}
