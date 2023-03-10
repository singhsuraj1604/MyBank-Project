package com.MyBank.MyBank.mapper;

import com.MyBank.MyBank.dto.UsersAccountDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UsersAccountMapper {
    @Select("select * from registration")
    List<UsersAccountDetails> getAllUsers();

    UsersAccountDetails createAccount(UsersAccountDetails user);
    @Insert("insert into registration(accountno,name,age,address,mobileno,password) values(#{accountno},#{name},#{age},#{address},#{mobileno},#{password})")
    void insert(UsersAccountDetails mybank);

    @Select("SELECT * FROM registration WHERE accountno = #{accountno}")
    UsersAccountDetails getAccountByAccountNumber(@Param("accountno") long accountno);
}
