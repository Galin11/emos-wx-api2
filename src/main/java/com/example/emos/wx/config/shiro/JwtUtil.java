package com.example.emos.wx.config.shiro;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-07 16:16
 * @version: 1.0
 */
@Component
@Slf4j
public class JwtUtil {

    @Value("${emos.jwt.secret}")
    private String secret;

    @Value("${emos.jwt.expire}")
    private int expire;

    //生成令牌字符串
    public String createToken(int userId){
        DateTime expireDate = DateUtil.offset(new Date(), DateField.DAY_OF_YEAR, expire); //过期日趋
        Algorithm algorithm = Algorithm.HMAC256(secret);    //加密算法
        JWTCreator.Builder builder =JWT.create();           //内部类
        //生成令牌
        String token = builder.withClaim("userId", userId).withExpiresAt(expireDate).sign(algorithm);
        return token;
    }

    //根据token解析userId
    public int getUserId(String token){
        DecodedJWT decode = JWT.decode(token);
        Integer userId = decode.getClaim("userId").asInt();
        return userId;
    }

    //验证令牌有效性
    public void verifierToken(String token){
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm).build();
        verifier.verify(token);
    }
}












