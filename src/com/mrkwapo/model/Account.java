package com.mrkwapo.model;

public class Account {
    private int balance = 10_000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void deposit(int amount){
        balance = balance - amount;
    }
}
