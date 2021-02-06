package com.company;

public class Main {

    public static void main(String[] args) {

            BankAccount a = new BankAccount();
            a.deposit(31000);

            while (true) {
                try {
                    a.withDraw(6000);
                } catch (LimitExpetion Bank) {
                    System.out.println(Bank.getMessage());
                    try {
                        a.withDraw((int) a.getAmount());
                    } catch (LimitExpetion l) {
                        l.printStackTrace();
                    }
                    break;
                }

            }
        }
    }


