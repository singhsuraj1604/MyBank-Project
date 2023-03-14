package com.MyBank.MyBank.services;

import com.MyBank.MyBank.dto.UsersAccountDetails;
import com.MyBank.MyBank.mapper.UsersAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsersAccountServices {
    @Autowired
    public UsersAccountMapper usersAccountMapper;
    public void createAccount(UsersAccountDetails user) {
        user.setAccountNumber(generateAccountNumber());
        usersAccountMapper.insert(user);
    }
    private long generateAccountNumber() {
        long accountNumber =(long) Math.floor(Math.random() * 999999999) + 1;
        System.out.println(accountNumber);
        return accountNumber;
    }
    public UsersAccountDetails getAccountByAccountNumber(long accountNumber) {
        return usersAccountMapper.getAccountByAccountNumber(accountNumber);
    }

}
