package com.hhs.a_properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用过户名:");
        String s1 = scanner.nextLine();
        System.out.println("请输入密码:");
        String s2 = scanner.nextLine();

        Properties properties = new Properties();
        FileReader fr = new FileReader("D:\\java-workspaces\\BasicCode\\H_Day19\\src\\test\\aaa.properties");
        properties.load(fr);

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        if (s1.equals(username) && s2.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败!");
        }


        fr.close();
    }
}
