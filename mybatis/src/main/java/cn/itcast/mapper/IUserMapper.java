package cn.itcast.mapper;

import cn.itcast.domain.User;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 17:00
 */
public interface IUserMapper {
    List<User> findAll();
    User findUserById(Integer id);
    List<User> findUserByName(String username);
}
