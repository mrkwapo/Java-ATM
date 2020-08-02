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
            if(account.getBalance() < 0) {
                System.out.println("You're account is overdrawn!");
            }
        }
    }

    private void makeWithdrawl(int withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + withdrawAmount);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException ex){

            }
            account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal of $" + withdrawAmount);
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw from " + account.getBalance());
        }
    }
}
