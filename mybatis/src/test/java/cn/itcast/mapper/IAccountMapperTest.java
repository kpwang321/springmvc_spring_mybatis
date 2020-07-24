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
 * @create 2020-07-24 17:06
 */
public class IAccountMapperTest {
    static IAccountMapper mapper;
    static {
        try {
            InputStream rs = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(rs);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(IAccountMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void findAll() {
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void findAccountByUid() {
    }
}