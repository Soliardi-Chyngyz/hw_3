package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        BankAmount amount = new BankAmount("som",  10000);
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Какую сумму хотите вывести?");
                double sum = scan.nextDouble();
                amount.withDraw((int) sum);
                System.out.println("Ваш баланс равен: " + amount.getAmount());
            } catch (LimitException a){
                System.out.println(a.getMessage() + "\nДопустимая сумма: " + amount.getAmount()
                    + "\nВывести остаток денег? y or n");
                    String c = scan.next();
                    if(c.equalsIgnoreCase("n")){
                        System.out.println("Ваш баланс " + amount.getAmount()
                        + "\nЗаберите карту");
                        break;
                    }else{
                        amount.withDraw((int) amount.getAmount());
                        System.out.println("Ваш баланс " + amount.getAmount()
                                + "\nЗаберите карту");
                        break;
                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
