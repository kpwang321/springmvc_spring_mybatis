package cn.itcast.mapper;

import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2020-07-24 16:50
 */

public class IAccountDaoTest {
    static IAccountDao accountDao;
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            accountDao = sqlSession.getMapper(IAccountDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findAll() {
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }

    }

    @Test
    public void findAccountByUid() {
    }
}