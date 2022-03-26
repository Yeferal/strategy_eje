/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

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
        
        Operation sum = new Sum();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Primer Numero");
        double num1 = s.nextDouble();
        System.out.println("Segundo Numero");
        double num2 = s.nextDouble();
        System.out.println("=========================");
        Executor executor = new Executor();
        executor.execute(sum, num1, num2);
        executor.execute(subtraction, num1, num2);
        executor.execute(multiplication, num1, num2);
    }
    
}
