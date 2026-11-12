
package com.example;

public class InterestCalculator {

    // Simple Interest
    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // Compound Interest (annual compounding)
    public double compoundInterest(double p, double r, double t) {
        return p * Math.pow(1 + r / 100, t) - p;
    }

    // Total Amount
    public double simpleAmount(double p, double r, double t) {
        return p + simpleInterest(p, r, t);
    }

    public double compoundAmount(double p, double r, double t) {
        return p + compoundInterest(p, r, t);
    }
}
