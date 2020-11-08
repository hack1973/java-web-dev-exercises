package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {
        HouseCat calvin = new HouseCat("Calvin",16);
        System.out.println(calvin.noise());
        calvin.eat();
        System.out.println(calvin.isTired());
        calvin.sleep();
        System.out.println(calvin.isTired());
        System.out.println(calvin.noise());

        //HouseCat mittens = new HouseCat(8.4);
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        System.out.println(calvin.getWeight());
    }
}
