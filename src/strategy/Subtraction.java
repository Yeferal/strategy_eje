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
public class Subtraction extends Operation {
    
    @Override
    double executeOperation(double number1, double number2){
        return number1 - number2;
    }
}
