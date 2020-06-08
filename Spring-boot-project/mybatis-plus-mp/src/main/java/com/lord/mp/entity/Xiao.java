package com.lord.mp.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.util.Date;

/**
 * @Description: 用户信息表的对应实体
 * @author Lord
 * @date 2019年5月30日
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@TableName("xiao")
@AllArgsConstructor
@RequiredArgsConstructor
public class Xiao extends Model<Xiao> {

    private static final long serialVersionUID = 2603890837103787306L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    @TableField(value = "name", condition = SqlCondition.LIKE)
    private String name;

    /**
     * 年龄
     */
    @TableField(condition = "%s&lt;#{%s}")
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 直属上级id
     */
    private Long managerId;

    /**
     * 创建时间
     */
    private Date createTime;

    /*
     * 备注（不与数据库字段对应） # transient 不参与序列化
     */
    @TableField(exist = false)
    private String remark;

}
