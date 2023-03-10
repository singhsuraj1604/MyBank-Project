package com.MyBank.MyBank.controller;

import com.MyBank.MyBank.dto.UsersAccountDetails;
import com.MyBank.MyBank.mapper.UsersAccountMapper;
import com.MyBank.MyBank.services.UsersAccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UsersAccountController {
    @Autowired
    private UsersAccountServices usersAccountServices;
    @Autowired
    private UsersAccountMapper usersAccountMapper;
   @GetMapping("/getallUserDetails")
    public List<UsersAccountDetails> getAllUsers()
   {
       return usersAccountMapper.getAllUsers();
   }
@PostMapping("/add")
    public void createAccount(@RequestBody UsersAccountDetails user)
{
    usersAccountServices.createAccount(user);
}
    @GetMapping("/accounts/{accountno}")
    public ResponseEntity<UsersAccountDetails> getAccountByAccountNumber(@PathVariable long accountno) {
        UsersAccountDetails account = usersAccountServices.getAccountByAccountNumber(accountno);
        if (account == null) {
            return ResponseEntity.notFound().build();
        } else {

            return ResponseEntity.ok(account);
        }
    }

}
