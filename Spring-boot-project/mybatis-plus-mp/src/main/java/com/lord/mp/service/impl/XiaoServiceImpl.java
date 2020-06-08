package com.lord.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lord.mp.dao.UserMapper;
import com.lord.mp.dao.XiaoMapper;
import com.lord.mp.entity.Xiao;
import com.lord.mp.service.UserService;
import com.lord.mp.service.XiaoService;
import org.springframework.stereotype.Service;

@Service
public class XiaoServiceImpl extends ServiceImpl<XiaoMapper, Xiao> implements XiaoService {

}
