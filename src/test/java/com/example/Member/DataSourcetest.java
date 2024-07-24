package com.example.Member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DataSourcetest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testConnection() {
        try(
                Connection con = dataSource.getConnection();
                SqlSession session = sqlSessionFactory.openSession();
        ){

            System.out.println("con="+con);
            System.out.println("session=" + session);

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
