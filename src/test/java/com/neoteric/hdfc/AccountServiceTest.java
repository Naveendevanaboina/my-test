package com.neoteric.hdfc;

import com.neoteric.hdfc.model.Account;
import com.neoteric.hdfc.model.Address;
import com.neoteric.hdfc.model.BankForm;
import com.neoteric.hdfc.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountServiceTest {


        @Test
        public void getAccountAgeGreaterThaneighteen() {


            BankForm customer1 = new BankForm();

            customer1.FirstName = "naveen";
            customer1.LastName = "kumar";
            customer1.age = 21;
            customer1.ContactNumber = 99922228882l;
            customer1.Date = 22 - 02 - 2022;
            customer1.Balance = 5000l;

            Address addresss = new Address();

            addresss.StreetName = "manasa nagar";
            addresss.Area = "busstand backside";
            addresss.City = "suryapet";
            addresss.District = "suryapet";
            addresss.PinCode = 232222;

            AccountService accountService = new AccountService();


            Account account = accountService.getAccount(customer1);

            System.out.println(customer1);
            System.out.println(account);

            Assertions.assertEquals(5000, customer1.Balance);
            Assertions.assertNotNull(account);

        }

}