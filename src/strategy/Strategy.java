/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Usuario
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sum sum = new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        
        System.out.println(sum.executeOperation(45, 4));
        System.out.println(subtraction.executeOperation(25, 5));
        System.out.println(multiplication.executeOperation(6, 2));
    }
    
}
