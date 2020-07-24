package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 15:44
 */
public interface AccountService {
    List<Account> findAll();
    void saveAccount(Account account);
}
