package com.lord.mp.xiao.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lord.mp.MpApplicationTests;
import com.lord.mp.dao.XiaoMapper;
import com.lord.mp.entity.Xiao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class SimpleTest extends MpApplicationTests {

    @Autowired
    private XiaoMapper xiaoMapper;

    @Test
    public void insert() {
        Xiao xiao = Xiao.builder().name("肖金路")
                .age(40)
                .email("xjl@baomidou.com")
                .managerId(1088248166370832385L)
                .createTime(new Date()).build();
        int rows = xiaoMapper.insert(xiao);
        System.out.println("影响记录数：" + rows);
        System.out.println("主键：" + xiao.getId());
    }

    @Test
    public void select() {
        List<Xiao> XiaoList = xiaoMapper.selectList(null);
        Assert.assertEquals(1, XiaoList.size());
        XiaoList.forEach(System.out::println);
    }

    @Test
    public void update() {
        Xiao xiao = Xiao.builder().id(1094592041087729668L).name("肖金路1")
                .age(40)
                .email("xjl@baomidou.com")
                .managerId(1088248166370832385L)
                .createTime(new Date()).build();
        int rows = xiaoMapper.updateById(xiao);
        System.out.println("影响记录数：" + xiao);
        System.out.println("主键：" + xiao.getId());
    }

    @Test
    public void removeById() {
        Xiao xiao = Xiao.builder().id(1094592041087729668L).name("肖金路1")
                .age(40)
                .email("xjl@baomidou.com")
                .managerId(1094592041087729668L)
                .createTime(new Date()).build();
        int rows = xiaoMapper.deleteById(1094592041087729668L);
        System.out.println("影响记录数：" + rows);
        System.out.println("主键：" + xiao.getId());
    }

    @Test
    public void selecMypage() {
        // 条件构造器
        QueryWrapper<Xiao> xiaoQuery = Wrappers.query();
        xiaoQuery.ge("age", 26);

        Page<Xiao> page = new Page<>(0, 8);

        IPage<Xiao> XiaoPage = xiaoMapper.selectXiaoPage(page, xiaoQuery);
        System.out.println("总页数：" + XiaoPage.getPages());
        System.out.println("总记录数：" + XiaoPage.getTotal());

        List<Xiao> XiaoList = XiaoPage.getRecords();
        XiaoList.forEach(System.out::println);
    }

}
