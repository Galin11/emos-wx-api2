package com.example.emos.wx.config.shiro;

import org.springframework.stereotype.Component;

/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-07 17:21
 * @version: 1.0
 */

@Component
public class ThreadLocalToken {

    private ThreadLocal<String> lcoal = new ThreadLocal<String>();

    public void setToken(String token){
        lcoal.set(token);
    }

    public String getToken(){
        return lcoal.get();
    }

    public void clear(){
        lcoal.remove();
    }
}
