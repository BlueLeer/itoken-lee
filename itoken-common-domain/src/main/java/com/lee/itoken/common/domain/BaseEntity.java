package com.lee.itoken.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author lee
 * @date 2020/4/13 11:23
 */
@Getter
@Setter
public class BaseEntity implements Serializable {
    /**
     * 状态（0正常 1删除 2停用 3冻结）
     */
    private String status;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 备注信息
     */
    private String remarks;
}
