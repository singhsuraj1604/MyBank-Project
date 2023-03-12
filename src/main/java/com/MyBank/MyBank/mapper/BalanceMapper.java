package com.MyBank.MyBank.mapper;

import com.MyBank.MyBank.dto.BalanceDto;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;


@Mapper
public interface BalanceMapper {

    @Insert("insert into userbalance(accountNumber,balance, currency, updatedDate,transactionStatus) " +
            "VALUES (#{accountNumber},#{balance}, #{currency}, #{updatedDate},#{transactionStatus})")
             int insert(BalanceDto userbalance);
    @Select("SELECT * FROM registration WHERE accountNumber = #{accountNumber}")
    BalanceDto findByAccountNumber(long accountNumber);

    @Insert("insert into transactionStatus(id,accountNumber,balance, currency, updatedDate,history) " +
           "VALUES (#{id},#{accountNumber},#{balance}, #{currency}, #{updatedDate},#{history})")
     int insertInto(BalanceDto transactionStatus);
    @Select("SELECT * FROM userbalance WHERE accountNumber = #{accountNumber}")
    BalanceDto findByAccount(long accountNumber);
    @Update("UPDATE userbalance SET balance = #{balance} WHERE accountNumber = #{accountNumber}")
    int updateBalance(@Param("accountNumber") long accountNumber, @Param("balance") BigDecimal balance);

}

