package com.example.emos.wx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.emos.wx.db.pojo.TbMeeting;
import com.example.emos.wx.service.TbMeetingService;
import com.example.emos.wx.db.mapper.TbMeetingMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghefei
* @description 针对表【tb_meeting(会议表)】的数据库操作Service实现
* @createDate 2022-03-06 17:24:12
*/
@Service
public class TbMeetingServiceImpl extends ServiceImpl<TbMeetingMapper, TbMeeting>
    implements TbMeetingService{

}




