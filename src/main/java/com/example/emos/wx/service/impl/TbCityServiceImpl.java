package com.example.emos.wx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.emos.wx.db.pojo.TbCity;
import com.example.emos.wx.service.TbCityService;
import com.example.emos.wx.db.mapper.TbCityMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghefei
* @description 针对表【tb_city(疫情城市列表)】的数据库操作Service实现
* @createDate 2022-03-06 17:24:12
*/
@Service
public class TbCityServiceImpl extends ServiceImpl<TbCityMapper, TbCity>
    implements TbCityService{

}




