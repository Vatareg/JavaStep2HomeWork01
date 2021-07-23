package org.incorp.i;

public class Main {

    public static void main(String[] args) {
        JumRun[] jumRun = {
                new Human("Who",10, 35),
                new Cat("Barsik",15,45),
                new Robot("R2D2", 0,80),
        };
        Hindernis[] hind = {
             //   new Wall(),
              //  new Treadmill(),
        };
        for (int step=0;step < jumRun.length; step++){

            jumRun[step].jump(20);
            jumRun[step].run(15);
		}



    }

}

