package com.example.emos.wx.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 *
 * @description:
 * @author: wanghefei
 * @date: 2022-03-07 16:41
 * @version: 1.0
 */

public class OAuth2Token implements AuthenticationToken {

    private String token;

    public OAuth2Token(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }
}
