package com.neoteric.newbankaccount.CreateService;

import com.neoteric.newbankaccount.createdemo.Customer;
import com.neoteric.newbankaccount.createdemo.Otp;

import java.util.Date;

public class CustomerService {
    public Otp registration (Customer customer){
      Otp otp = new Otp(); //only object reference knows object the ram
        otp.otpNumber ="12345";
        otp.generateotpTime = new Date();
        otp.expiretime = new Date();
        return otp;
    }
}
