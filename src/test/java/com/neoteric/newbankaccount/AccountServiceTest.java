package com.neoteric.newbankaccount;

import com.neoteric.newbankaccount.model.Account;
import com.neoteric.newbankaccount.model.BankForm;
import com.neoteric.newbankaccount.service.AccountService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
//import #java service method test
//import sun.jvm.hotspot.debugger.Address;
import org.junit.jupiter.api.Assertions;

import java.util.UUID;
import com.neoteric.Address.model.Addresss;

public class AccountServiceTest {

    @Test
    public void getAccountAgeGreaterThaneighteen() {


        BankForm customer1 = new BankForm();

        customer1.FirstName = "Rakesh";
        customer1.LastName = "kurapati";
        customer1.age = 21;
        customer1.ContactNumber = 1234567890;
        customer1.Date = 22 - 02 - 2022;
        customer1.Balance = 5000l;


        Addresss addresss = new Addresss();

        addresss.StreetName = "nijampet";
        addresss.Area = "jntu metro";
        addresss.City = "hyderbad";
        addresss.District = "hyderbad";
        addresss.PinCode = 500061;

        AccountService accountService = new AccountService();


        Account account = accountService.getAccount(customer1);

        System.out.println(customer1);
        System.out.println(account);

        Assertions.assertEquals(5000, customer1.Balance);
        Assertions.assertNotNull(account);

    }

}