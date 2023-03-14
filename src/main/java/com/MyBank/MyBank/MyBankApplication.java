package com.MyBank.MyBank;

import com.MyBank.MyBank.dto.BalanceDto;
import com.MyBank.MyBank.dto.UsersAccountDetails;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MappedTypes(value = {UsersAccountDetails.class, BalanceDto.class})
@MapperScan("com.MyBank.MyBank.mapper")
@SpringBootApplication
public class MyBankApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyBankApplication.class, args);
	}

}
