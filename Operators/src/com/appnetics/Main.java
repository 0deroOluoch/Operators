package com.appnetics;

public class Main {

    public static void main(String[] args) {
	    double myDouble = 20.00d;
	    double mySecondDouble = 80.00d;
	    double smallMath = (myDouble + mySecondDouble) * 100.00d;
        System.out.println(smallMath);
	    double remainderHere = smallMath % 40.00;

	    boolean assignsBooleen = remainderHere == 0 ? true : false;
        System.out.println("So I am outputting you as " + assignsBooleen);

        if(!assignsBooleen){
            System.out.println("Got some remainder");
        }
    }
}
