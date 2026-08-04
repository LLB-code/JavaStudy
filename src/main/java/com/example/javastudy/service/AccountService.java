package com.example.javastudy.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    private final JdbcTemplate jdbcTemplate;
    public AccountService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public BigDecimal getBalance(Long id) {
        String sql = "select balance from account where id = ?";
        return jdbcTemplate.queryForObject(sql,BigDecimal.class,id);
    }
    @Transactional
    public String  transfer(Long fromid,Long toid,BigDecimal amount) {
        String deductsql = "update account set balance = balance - ? where id = ?";
        String addsql = "update account set balance = balance + ? where id = ?";
        jdbcTemplate.update(deductsql,amount,fromid);
        jdbcTemplate.update(addsql,amount,toid);
        throw new RuntimeException("模拟异常");
    }
}
