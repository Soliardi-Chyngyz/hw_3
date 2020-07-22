package com.company;

public class LimitException extends Exception{

    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public LimitException(String s) {
    }

    public double getRemainingAmount(){
        return remainingAmount;}
}
