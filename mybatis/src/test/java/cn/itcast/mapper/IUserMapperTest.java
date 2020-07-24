package cn.itcast.mapper;

import cn.itcast.domain.User;
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
 * @create 2020-07-24 17:28
 */
public class IUserMapperTest {
    static IUserMapper mapper;
    static {
        try {
            InputStream rs = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(rs);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(IUserMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void findAll() {
        mapper.findAll();
        System.out.println("----------");
        List<User> list = mapper.findAll();
        /*for (User user : list) {
            System.out.println(user);
        }*/
    }

    @Test
    public void findUserById() {
    }

    @Test
    public void findUserByName() {
    }
}