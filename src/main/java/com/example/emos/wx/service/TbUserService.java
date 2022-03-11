package com.example.emos.wx.service;

import com.example.emos.wx.db.pojo.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
* @author wanghefei
* @description 针对表【tb_user(用户表)】的数据库操作Service
* @createDate 2022-03-06 17:24:12
*/
public interface TbUserService extends IService<TbUser> {

    public int registerUser(String registerCode,String code,String nickname,String photo);

    public Set<String> searchUserPermissions(int userId);

    public Integer login(String code);


}
