package com.example.emos.wx.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.emos.wx.db.pojo.TbUser;
import com.example.emos.wx.db.service.TbUserService;
import com.example.emos.wx.db.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghefei
* @description 针对表【tb_user(用户表)】的数据库操作Service实现
* @createDate 2022-03-06 17:24:12
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService{

}




