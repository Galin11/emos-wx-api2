package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Set;

/**
* @author wanghefei
* @description 针对表【tb_user(用户表)】的数据库操作Mapper
* @createDate 2022-03-06 17:24:12
* @Entity com.example.emos.wx.db.pojo.TbUser
*/
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

    //是否有超管账号
    public boolean haveRootUser();
    //通过opendid查询用户id
    public Integer searchIdByOpenId(String openId);
    //添加用户
    public int insert(HashMap param);

    //根据用户id查询用户权限
    public Set<String> searchUserPermissions(int userId);

}




