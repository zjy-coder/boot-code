package com.zjy.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.zjy.entity.User;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * @Date 2020/4/7 14:26
 * @Created by zjy
 */
@Service
public class TokenService {
    public String getToken(User user) throws UnsupportedEncodingException {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getId()))// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}
