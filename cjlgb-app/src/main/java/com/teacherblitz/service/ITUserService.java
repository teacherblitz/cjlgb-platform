package com.teacherblitz.service;

import com.teacherblitz.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020-12-04
 */
public interface ITUserService extends IService<TUser> {

    String index();
}
