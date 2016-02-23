package cn.ucai.test;

import cn.ucai.dao.UserDao;
import cn.ucai.model.UserModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/2/23.
 */
public class app {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
           UserModel userModel = (UserModel) session.selectOne("cn.ucai.dao.UserDao.getUser");
            System.out.println("333333");
            System.out.println(userModel.getUsername());
        } finally {
            System.out.println("444");
            session.close();
        }

    }
}
