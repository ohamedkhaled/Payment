/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author lenovo
 */
public class AuthrizeCredit1 implements IauthorizeBehavior{

    @Override
    public String authorized() {
        
        return"AuthrizeCredit1";
    }
    
}
