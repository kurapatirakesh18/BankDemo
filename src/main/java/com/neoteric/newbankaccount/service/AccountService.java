package com.neoteric.newbankaccount.service;

import com.neoteric.newbankaccount.model.Account;
import com.neoteric.newbankaccount.model.BankForm;

import java.util.UUID;

public class AccountService {

    public Account getAccount( BankForm customer1){

        Account account=null;

        if (customer1.Balance == 5000) {
            account = new Account();
            account.Number= UUID.randomUUID().toString();
            account.BranchName="superset";

            account.IFSC ="IFSC";
            account.Balance = 5000L;
        }

        return account;
    }

}

