package com.company;

public class LimitExpetion extends Exception{
    private double remainingAmount;

    public LimitExpetion(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public double getRemainingAmount() {
        return remainingAmount;
    }
}
