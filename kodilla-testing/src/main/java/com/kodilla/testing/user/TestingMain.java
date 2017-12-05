package com.kodilla.testing.user;
import  com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.user.calculator.calculatorApi;

public class TestingMain {
    public static void main (String[]args) {
        calculatorApi myCalculator = new calculatorApi();

        // test with add

        int resultadd = myCalculator.addAToB(10, 7);

        if(resultadd == 17) {
            System.out.println("Test with add complete!giti");
        } else {
            System.out.println("Test with add failed!");
        }

        // test with substract

        int resultsubstract = myCalculator.substractAFromB(50,20);

        if(resultsubstract == 30) {
            System.out.println("Test with substract complete! ");
        } else {
            System.out.println("Test with substract failed!");
        }
    }
}
