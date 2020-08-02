package com.mrkwapo.worker;

import com.mrkwapo.model.Account;

public class AccountHolder implements Runnable{
    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            makeWithdrawl(2000);
            makeDeposit(600);
            if(account.getBalance() < 0) {
                System.out.println("You're account is overdrawn!");
            }
        }
    }

    private void makeWithdrawl(int withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + withdrawAmount + " from the Current Balance of " + account.getBalance());
            try{
                Thread.sleep(3000);
            }catch (InterruptedException ex){

            }
            account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal of $" + withdrawAmount + ". Current Balance is now: " + account.getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + withdrawAmount + ". Current Balance: " + account.getBalance());
        }
    }

    private void makeDeposit(int depositAmount) {

        System.out.println(Thread.currentThread().getName() + " is going to deposit $" + depositAmount + " to the Current Balance of " + account.getBalance());
            try{
                Thread.sleep(3000);
            }catch (InterruptedException ex){

            }
            account.deposit(depositAmount);
            System.out.println(Thread.currentThread().getName() + " completes the deposit of $" + depositAmount + ". Current Balance is now: " + account.getBalance());

    }
}
