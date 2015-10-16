/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partA;

/**
 *
 * @author brianobioha
 */
public class Car extends MotorVehicle {
    @Override
    public void TurnOn(){
        System.out.println("Car is Starting");
    }
    @Override
    public void TurnOff(){
        System.out.println("Car is Stopping");
    }
//    public static void TestPartA(){
//        System.out.println("Part A");
//          partA.Car car = new partA.Car();
//          car.TurnOn();
//          car.TurnOff();
//    }
}
