package com.example.javastudy.controller;

import org.springframework.web.bind.annotation.*;
import com.example.javastudy.service.AccountService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @GetMapping("/{id}")
    public BigDecimal getBalance(@PathVariable("id") Long id){
        return accountService.getBalance(id);
    }
    @PostMapping("/transfer")
    public String tranfer(@RequestParam("fromId") Long fromId,
                        @RequestParam("toId")Long toId,
                        @RequestParam("amount") BigDecimal amount){
        return accountService.transfer(fromId,toId,amount);
    }
}
