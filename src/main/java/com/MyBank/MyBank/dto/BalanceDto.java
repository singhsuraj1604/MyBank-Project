package com.MyBank.MyBank.dto;

import java.math.BigDecimal;
public class BalanceDto {
    private int id;
    private long accountNumber;
    private BigDecimal balance;
    private String currency;
    private String updatedDate;
    private String status;

    public int getId() {
        return id;
    }

    public BalanceDto setId(int id) {
        this.id = id;
        return this;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public BalanceDto setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BalanceDto setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public BalanceDto setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public BalanceDto setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BalanceDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
