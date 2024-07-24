package com.example.Member;

import com.example.Member.mapper.TimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations = "file:src/main/java/com/example/Member/spring/rootcontext.xml")
public class TimeMapperTests {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        System.out.println(timeMapper.getTime());
    }

    @Test
    public void testGetTime2() {
        System.out.println(timeMapper.getTime2());
    }
}
