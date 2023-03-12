package com.MyBank.MyBank.services;

import com.MyBank.MyBank.dto.BalanceDto;
import com.MyBank.MyBank.mapper.BalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class BalanceService {
    @Autowired
    public BalanceMapper balanceMapper;

    public void addAmount(BalanceDto balanceDto) {
        if (isAccountPresent(balanceDto.getAccountNumber())) {
            int row = balanceMapper.insert(balanceDto);
            if (row == 0) {
                // error
                System.out.println("error occurred during insertion of records");
            } else {
                System.out.println("USER With AccountNumber " + balanceDto.getAccountNumber() + " Exists , now you can add Balance ");
            }
        } else {
            System.out.println("USER With AccountNumber " + balanceDto.getAccountNumber() + " does not exist,First create account in MyBank ");
        }
    }

    public boolean isAccountPresent(long accountNumber) {
        BalanceDto accountno = balanceMapper.findByAccountNumber(accountNumber);
        return accountno != null;
    }
    public void mergeBalance(BalanceDto balanceDto) {

        if (isAccountPresent(balanceDto.getAccountNumber())) {
            balanceMapper.insertInto(balanceDto);
            BalanceDto account = balanceMapper.findByAccount(balanceDto.getAccountNumber());
            if (balanceDto.getHistory().equals("C")) {
                balanceDto.setBalance(account.getBalance().add(balanceDto.getBalance()));
                balanceMapper.updateBalance(account.getAccountNumber(), balanceDto.getBalance());
            } else if (balanceDto.getHistory().equals("D")) {
                balanceDto.setBalance(account.getBalance().subtract(balanceDto.getBalance()));
                balanceMapper.updateBalance(account.getAccountNumber(),balanceDto.getBalance());
            }
        }
        else {
            System.out.println("USER With AccountNumber " + balanceDto.getAccountNumber() + " does not exist,First create account in MyBank ");
        }
    }

}




