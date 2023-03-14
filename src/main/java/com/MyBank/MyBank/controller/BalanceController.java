package com.MyBank.MyBank.controller;

import com.MyBank.MyBank.dto.BalanceDto;
import com.MyBank.MyBank.dto.UsersAccountDetails;
import com.MyBank.MyBank.services.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    @Autowired
    private BalanceService balanceService;

    @PostMapping("/addBalance")
    public void addAmount(@RequestBody BalanceDto balanceDto) {
        balanceService.addAmount(balanceDto);
    }

    @PutMapping("/addBalance")
    public BalanceDto mergeBalance(@RequestBody BalanceDto balanceDto) {
        balanceService.mergeBalance(balanceDto);
        return balanceDto;
    }

    @GetMapping("/getBalance/{accountNumber}")
    public ResponseEntity<BalanceDto> getBalanceByAccountNumber(@PathVariable long accountNumber) {
        BalanceDto account = balanceService.getBalanceByAccountNumber(accountNumber);
        if (account == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(account);
        }

    }
}
