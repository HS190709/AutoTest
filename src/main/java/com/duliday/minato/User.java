package com.duliday.minato;

import lombok.Data;

import java.util.Date;

/**
 * @author duliday
 * @description 功能描述
 * @create 2021/8/30 17:39
 */
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
