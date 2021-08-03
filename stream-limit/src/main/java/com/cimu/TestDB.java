package com.cimu;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/23 10:25
 * @since: 1.0.0
 */
public class TestDB {
    public static void main(String[] args) throws IOException {
//        URL resource1 = TestDB.class.getResource("my.db");
        URL resource2 = TestDB.class.getClassLoader().getResource("my.db");
        Properties properties = new Properties();
        InputStream resource = TestDB.class.getClassLoader().getResourceAsStream("my.db");
        properties.load(resource);
        System.out.println(properties.get("user"));

    }
}
