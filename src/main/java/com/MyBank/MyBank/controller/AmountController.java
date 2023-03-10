package com.MyBank.MyBank.controller;

import com.MyBank.MyBank.dto.AmountDto;
import com.MyBank.MyBank.services.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class AmountController {
    @Autowired
    private AmountService amountService;
    @PostMapping("/balance/addAmount")
    public void updateAmount(@RequestBody AmountDto amountDto) {
        amountService.updateAmount(amountDto);
    }

    @GetMapping("/accounts/{accountno}")
    public String getAccount(@PathVariable Long accountno) {
        if (amountService.isAccountPresent(accountno)) {
            return "USER With AccountNumber " + accountno + " Exists , now you can add Balance ";
        } else {
            return "USER With AccountNumber " + accountno + " does not exist,First create account in MyBank ";
        }

    }
}
