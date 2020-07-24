package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.mapper.AccountMapper;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 15:45
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
        int i=1/0;

    }
}
