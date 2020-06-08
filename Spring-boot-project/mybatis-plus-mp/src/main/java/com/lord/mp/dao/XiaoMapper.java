package com.lord.mp.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lord.mp.entity.User;
import com.lord.mp.entity.Xiao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 用户信息持久层
 * @author Lord
 * @date 2019年5月30日
 */
@Repository
public interface XiaoMapper extends BaseMapper<Xiao> {

    // @Select("select * from user ${ew.customSqlSegment}")
    List<Xiao> selectAll(@Param(Constants.WRAPPER) Wrapper<Xiao> wrapper);

    IPage<Xiao> selectXiaoPage(Page<Xiao> page, @Param(Constants.WRAPPER) Wrapper<Xiao> wrapper);

}
