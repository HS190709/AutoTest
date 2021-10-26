package com.duliday.minato;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/8/26 20:33
 */
public class TestUser {
    @Test
    public void testJson() throws Exception {
        User user = getUser();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
        User user1=objectMapper.readValue(json,User.class);
        System.out.println(user1);
    }

    public static User getUser() {
        User user = new User();
        user.setName("小民");
        user.setEmail("xiaomin@sina.com");
        user.setAge(20);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setBirthday(dateformat.parse("1996-10-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return user;
    }

}

