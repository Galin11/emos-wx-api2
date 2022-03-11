package com.example.emos.wx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.emos.wx.db.pojo.TbHolidays;
import com.example.emos.wx.service.TbHolidaysService;
import com.example.emos.wx.db.mapper.TbHolidaysMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghefei
* @description 针对表【tb_holidays(节假日表)】的数据库操作Service实现
* @createDate 2022-03-06 17:24:12
*/
@Service
public class TbHolidaysServiceImpl extends ServiceImpl<TbHolidaysMapper, TbHolidays>
    implements TbHolidaysService{

}




