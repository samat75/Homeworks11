package com.company;

public class BankAccount extends Exception{
    private int amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        System.out.println("Вы положили на счёт: "+(amount+=sum));
        return amount;
    }

    public void withDraw(int sum) throws LimitExpetion {
        if (amount < sum) {
            throw new LimitExpetion("Вы не можете снять запрашиваемую сумму чем остаток денег на счёте",sum);
        }else {
            System.out.println("Со счёта снято: "+sum);
            System.out.println("Остаток на счету: "+(amount-=sum));
        }
    }
}

