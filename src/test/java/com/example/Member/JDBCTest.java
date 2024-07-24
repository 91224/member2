package com.example.Member;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.assertj.core.api.Fail.fail;

public class JDBCTest {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void testConnection(){
        try(
                Connection con =
                        DriverManager.getConnection(
                                "jdbc:mysql://127.0.0.1:3306/aaaa?serverTimezone=Asia/Seoul",
                                "root",
                                "rorkxdmsqlqjsh1!")
        ){
            System.out.println(con);
        }catch (Exception e){
            fail(e.getMessage());
        }

    }
}
