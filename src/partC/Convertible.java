/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partC;

/**
 *
 * @author brianobioha
 */
public class Convertible extends Car {
    public Convertible(String name, boolean topUp){super(name); this.topUp = topUp;}
    
    public void putTopUp(){
        topUp = true;
        System.out.println("Putting top up");
    }
    @Override
    public void TurnOff(){
        putTopUp();
        super.TurnOff();
    }
    private boolean topUp;
}
