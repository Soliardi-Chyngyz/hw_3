package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAmount amount = new BankAmount("som",  10000);
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Какую сумму хотите вывести?");
                double sum = scan.nextDouble();
                amount.withDraw((int) sum);
                System.out.println("Ваш баланс равен: " + amount.getAmount());
            } catch (LimitException a){
                System.out.println(a.getMessage());
            }
        }
    }
}
