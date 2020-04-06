package com.company;

public class Bank_account {
    private double balance;

    public Bank_account(){}

    public Bank_account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amount){
        balance = amount + balance;
        return true;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Balance: " + this.balance;
    }
}
