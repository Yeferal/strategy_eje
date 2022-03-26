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
public class Executor {
    
    
    public void execute(Operation op, double num1,  double num2){
        op.executeOperation(num1, num2);
    }
    
}
