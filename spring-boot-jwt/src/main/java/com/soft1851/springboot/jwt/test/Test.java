package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.interfaces.DecodedJWT;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * @author su
 * @className Test
 * @Description TODO
 * @Date 2020/4/15 10:45
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String str = UUID.randomUUID().toString();
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        System.out.println(temp);
        String token = encrypt.getToken(temp,true, "soft1851", "suYuXi");

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("UUID:  " + jwt.getClaim("UUID").asString());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int n = jwt.getExpiresAt().compareTo(new Date(System.currentTimeMillis()));
                if (n > 0 ){
                    System.out.println("过期时间：      " + jwt.getExpiresAt());
                }else {
                    System.out.println("token已过期");
                }
            }
        };
    Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 1000, 1000);
                }
                }
