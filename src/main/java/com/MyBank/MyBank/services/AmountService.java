package com.MyBank.MyBank.services;

import com.MyBank.MyBank.dto.AmountDto;
import com.MyBank.MyBank.mapper.AmountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AmountService {
    private  AmountMapper amountMappe;

    public AmountService(AmountMapper amountMappe) {
        this.amountMappe = amountMappe;
    }
    @Autowired
    public AmountMapper amountMapper;
    public void updateAmount(AmountDto amountDto) {

        amountMapper.insert(amountDto);
    }

    public boolean isAccountPresent(Long accountno) {
        AmountDto accountnu = amountMappe.findByAccountno(accountno);
        return accountnu != null;
    }
}
