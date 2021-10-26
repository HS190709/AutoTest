package com.duliday.minato;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author duliday
 * @description 功能描述
 * @create 2021/8/31 15:34
 */
public class Demo {
    public static void main(String[] args)throws IOException {
        File file=new File("c:Users/duliday/Desktop/api-docs.json");
        ObjectMapper objectMapper=new ObjectMapper();
        Demo demo=objectMapper.readValue(file,Demo.class);
        System.out.println(demo);

    }
}
