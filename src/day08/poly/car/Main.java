package day08.poly.car;

import day07.util.Utility;

import static day07.util.Utility.makeLine;

public class Main {
    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());

        makeLine();

        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Car stinger = new Stinger();
        stinger.accelerate();

        makeLine();

        Mustang car = (Mustang) shop.exportCar(6000);
        System.out.println("car = "+ car);

//        car.powerSound();


    }
}
