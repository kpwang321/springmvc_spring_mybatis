package cn.itcast.mapper;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 17:00
 */
public interface IAccountMapper {
    List<Account> findAll();
    List<Account> findAccountByUid(Integer uid);
}
