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
public class Car extends MotorVehicle {
    public Car(String name){
        super(name);
    }
    @Override
    public void TurnOn(){
        System.out.println(super.getName() +  " is Starting");
    }
    @Override
    public void TurnOff(){
        System.out.println(super.getName() +  " is Stopping");
    }
//    public static void TestPartC(){
//        System.out.println("Part C");
//          partC.Convertible mercedes = new partC.Convertible("SL550", false);
//          mercedes.TurnOff();
//    }
}
