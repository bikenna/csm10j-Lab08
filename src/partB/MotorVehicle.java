/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

/**
 *
 * @author brianobioha
 */
public abstract class MotorVehicle {
    public MotorVehicle(String name){ this.name = name;}
    
    abstract void TurnOn();
    abstract void TurnOff();
    
    private String name;
    
    public String getName(){
        return name;
    }
}
