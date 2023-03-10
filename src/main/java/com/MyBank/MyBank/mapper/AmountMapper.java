package com.MyBank.MyBank.mapper;

import com.MyBank.MyBank.dto.AmountDto;
import org.apache.ibatis.annotations.*;
@Mapper
public interface AmountMapper {
    @Insert("insert into userbalance(accountno,amount, currency, updatedDate) " +
            "VALUES (#{accountno},#{amount}, #{currency}, #{updatedDate})")
             int insert(AmountDto amountDto);
    @Select("SELECT * FROM userbalance WHERE accountno = #{accountno}")
    AmountDto findByAccountno(Long accountno);
}

