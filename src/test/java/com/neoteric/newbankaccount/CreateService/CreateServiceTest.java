package com.neoteric.newbankaccount.CreateService;

import com.neoteric.newbankaccount.createdemo.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class CreateServiceTest {
    @Test
    public void test(){
        Customer rakesh = new Customer();
        rakesh.name = "Rakesh kurapati";
        rakesh.customerloginid = "12345";
        rakesh.password = "1234";
        rakesh.addharnumber ="8998838928";

        Account rakeshAccount = new Account();
        rakeshAccount.accountnumber = "SBI8998838928";
        rakeshAccount.availablebalance = 2000;
        rakeshAccount.currentbalance = 3000;


        IfscCode ifscCode1= new IfscCode();
        ifscCode1.code = "SBIH0098";

        Address bankAddress = new Address();

        bankAddress.streetName = "marketbazar";
        bankAddress.district = "guntur";
        bankAddress.city = "guntur";
        bankAddress.area = "guntur";
        bankAddress.pinCode ="500001";

        ifscCode1.address = bankAddress;
        rakeshAccount.ifscCode = ifscCode1 ;

        Address rakeshAddress = new Address();
        rakeshAddress.streetName = "market bazar";
        rakeshAddress.area = "piduralla";
        rakeshAddress.district = "palnadu";
        rakeshAddress.city = "piduguralla";
        rakeshAddress.pinCode = "522413";

        rakeshAccount.addresss=rakeshAddress;

        RateOfIntrest rateOfIntrest1= new RateOfIntrest();
        rateOfIntrest1.accounttype = "Savings account";
        rateOfIntrest1.RateOfIntrest =0.5;
        rateOfIntrest1.startdate = "22/1/2023";
        rateOfIntrest1.enddate = "22/1/2024";

        String expertedOtp = "12345";

        rakeshAccount.rateOfIntrest=rateOfIntrest1;

        rakesh.Account=rakeshAccount;
        CustomerService customerService = new CustomerService();
        Otp rakehOtp=  customerService.registration(rakesh);

        Assertions.assertNotNull(rakehOtp);
        Assertions.assertEquals(expertedOtp,rakehOtp.otpNumber);


    }



}