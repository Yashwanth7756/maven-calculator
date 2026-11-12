
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        InterestCalculator obj = new InterestCalculator();

        System.out.println("Simple Interest: " +
                obj.simpleInterest(p, r, t));

        System.out.println("Compound Interest: " +
                obj.compoundInterest(p, r, t));

        System.out.println("Simple Amount: " +
                obj.simpleAmount(p, r, t));

        System.out.println("Compound Amount: " +
                obj.compoundAmount(p, r, t));

        sc.close();
    }
}
