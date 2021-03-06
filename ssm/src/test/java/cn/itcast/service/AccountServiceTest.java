package cn.itcast.service;

import cn.itcast.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2020-07-24 15:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void findAll() {
        List<Account> list = accountService.findAll();
        System.out.println(list);
    }

    @Test
    public void saveAccount() {
        Account account=new Account();
        account.setName("kpwang");
        account.setMoney(8000d);
        accountService.saveAccount(account);
    }
}