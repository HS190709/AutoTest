package com.duliday.minato;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author duliday
 * @description 功能描述
 * @create 2021/8/17 20:33
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Demo1 testDemo1 = new Demo1();
       /* List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(TestDemo1::printUtil);
        File file = new File("C:\\Users\\duliday\\Desktop\\test.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, testDemo1);*/
        testDemo1.testJson();
    }

    public static void printUtil(Integer x) {
        System.out.print(x);
    }

    /*public int testJson() throws Exception {
        String json = "{\"xxx\":121,\"yyy\":222}";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(json, JsonNode.class);
        JsonNode a = jsonNode.get("xxx");
        int x = a.asInt();
        System.out.println(x);
        return x;
    }*/
    @Test
    public String testJson() throws Exception {
        User user = new User();
        Demo1 testDemo1 = new Demo1();
        testDemo1.setUser();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
        return json;
    }

    public void setUser() {
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
    }

    @Data
    public class User {
        String name;
        Date birthday;
        String email;
        int age;

        public User() {
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

