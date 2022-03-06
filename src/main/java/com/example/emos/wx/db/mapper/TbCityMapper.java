package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbCity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanghefei
* @description 针对表【tb_city(疫情城市列表)】的数据库操作Mapper
* @createDate 2022-03-06 17:24:12
* @Entity com.example.emos.wx.db.pojo.TbCity
*/
@Mapper
public interface TbCityMapper extends BaseMapper<TbCity> {

}




