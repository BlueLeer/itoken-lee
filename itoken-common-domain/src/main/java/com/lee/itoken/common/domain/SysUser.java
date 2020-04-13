package com.lee.itoken.common.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Lee
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_sys_user")
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 登录账号
     */
    private String loginCode;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 办公电话
     */
    private String phone;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 头像路径
     */
    private String avatar;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 绑定的微信号
     */
    private String wxOpenid;

    /**
     * 绑定的手机串号
     */
    private String mobileImei;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户类型引用编号
     */
    private String refCode;

    /**
     * 用户类型引用姓名
     */
    private String refName;

    /**
     * 管理员类型（0非管理员 1系统管理员  2二级管理员）
     */
    private String mgrType;

    /**
     * 密码安全级别（0初始 1很弱 2弱 3安全 4很安全）
     */
    private BigDecimal pwdSecurityLevel;

    /**
     * 密码最后更新时间
     */
    private LocalDateTime pwdUpdateDate;

    /**
     * 密码修改记录
     */
    private String pwdUpdateRecord;

    /**
     * 密保问题
     */
    private String pwdQuestion;

    /**
     * 密保问题答案
     */
    private String pwdQuestionAnswer;

    /**
     * 密保问题2
     */
    @TableField("pwd_question_2")
    private String pwdQuestion2;

    /**
     * 密保问题答案2
     */
    @TableField("pwd_question_answer_2")
    private String pwdQuestionAnswer2;

    /**
     * 密保问题3
     */
    @TableField("pwd_question_3")
    private String pwdQuestion3;

    /**
     * 密保问题答案3
     */
    @TableField("pwd_question_answer_3")
    private String pwdQuestionAnswer3;

    /**
     * 密码问题修改时间
     */
    private LocalDateTime pwdQuestUpdateDate;

    /**
     * 最后登陆IP
     */
    private String lastLoginIp;

    /**
     * 最后登陆时间
     */
    private LocalDateTime lastLoginDate;

    /**
     * 冻结时间
     */
    private LocalDateTime freezeDate;

    /**
     * 冻结原因
     */
    private String freezeCause;

    /**
     * 用户权重（降序）
     */
    private BigDecimal userWeight;

    /**
     * 归属集团Code
     */
    private String corpCode;

    /**
     * 归属集团Name
     */
    private String corpName;

}
