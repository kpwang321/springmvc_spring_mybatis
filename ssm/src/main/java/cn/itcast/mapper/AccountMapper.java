package cn.itcast.mapper;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 15:31
 */
public interface AccountMapper {
    //查询所有
    @Select("select * from account")
    List<Account> findAll();
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
