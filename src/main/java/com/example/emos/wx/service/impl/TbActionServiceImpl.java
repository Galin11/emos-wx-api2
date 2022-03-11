package com.example.emos.wx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.emos.wx.db.pojo.TbAction;
import com.example.emos.wx.service.TbActionService;
import com.example.emos.wx.db.mapper.TbActionMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghefei
* @description 针对表【tb_action(行为表)】的数据库操作Service实现
* @createDate 2022-03-06 17:24:12
*/
@Service
public class TbActionServiceImpl extends ServiceImpl<TbActionMapper, TbAction>
    implements TbActionService{

}




