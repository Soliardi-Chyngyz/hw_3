package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        BankAmount amount = new BankAmount("som",  10000);
//        Scanner scan = new Scanner(System.in);
//        while(true){
//            try{
//                System.out.println("Какую сумму хотите вывести?");
//                double sum = scan.nextDouble();
//                amount.withDraw((int) sum);
//                System.out.println("Ваш баланс равен: " + amount.getAmount());
//            } catch (LimitException a){
//                System.out.println(a.getMessage() + "\nДопустимая сумма: " + amount.getAmount());
//            } catch (Exception e) {
//                e.printStackTrace();
//            } try {
//                System.out.println("Вывести остаток денег? " + amount.getAmount());
//            } catch (Exception b){
//                System.out.println(b.getMessage());
//            }
//        }
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
                    String c = scan.nextLine();
                    if(c.equalsIgnoreCase("n")){
                        break;
                    }else{
                        amount.withDraw((int) amount.getAmount());
                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
