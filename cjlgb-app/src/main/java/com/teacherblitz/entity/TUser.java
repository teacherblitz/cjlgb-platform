package com.teacherblitz.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020-12-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 性别：1->男，2->女，0->未知
     */
    private Integer sex;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 积分
     */
    private Integer bonus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
