package com.neoteric.hdfc.service;
import com.neoteric.hdfc.model.Account;
import com.neoteric.hdfc.model.BankForm;

import java.util.UUID;
public class AccountService {


        public Account getAccount(BankForm customer1){

            Account account=null;

            if(customer1.Balance == 5000) {


                account = new Account();


                account.Number = UUID.randomUUID().toString();
                account.BranchName = "suryapet";
                account.IFSC = "SBIIFSC";
                account.Balance = 5000l;

            }

            return account;
        }

    }

