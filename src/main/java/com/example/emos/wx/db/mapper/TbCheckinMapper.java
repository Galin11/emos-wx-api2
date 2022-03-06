package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbCheckin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanghefei
* @description 针对表【tb_checkin(签到表)】的数据库操作Mapper
* @createDate 2022-03-06 17:24:12
* @Entity com.example.emos.wx.db.pojo.TbCheckin
*/
@Mapper
public interface TbCheckinMapper extends BaseMapper<TbCheckin> {

}




