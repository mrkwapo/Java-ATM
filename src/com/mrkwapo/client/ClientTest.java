package com.mrkwapo.client;

import com.mrkwapo.model.Account;
import com.mrkwapo.worker.AccountHolder;

public class ClientTest {
    public static void main(String[] args) {

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);
        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        t1.setName("Leo");
        t2.setName("Tameka");

        t1.start();
        t2.start();

    }
}
