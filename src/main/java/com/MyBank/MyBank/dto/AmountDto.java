package com.MyBank.MyBank.dto;

import java.math.BigDecimal;
public class AmountDto {
    private Long accountno;
    private BigDecimal amount;
    private String currency;

    public Long getAccountno() {
        return accountno;
    }

    public AmountDto setAccountno(Long accountno) {
        this.accountno = accountno;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public AmountDto setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AmountDto setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public AmountDto setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    private String updatedDate;
}
