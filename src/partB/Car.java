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
public class Car extends MotorVehicle {
    public Car(String name){
        super(name);
    }
    @Override
    public void TurnOn(){
        System.out.println("Car is Starting");
    }
    @Override
    public void TurnOff(){
        System.out.println("Car is Stopping");
    }
//    public static void TestPartB(){
//        System.out.println("Part B");
//        partB.Car car = new partB.Car("Cadillac");
//        System.out.println("Car is a " + car.getName());
//    }
}
