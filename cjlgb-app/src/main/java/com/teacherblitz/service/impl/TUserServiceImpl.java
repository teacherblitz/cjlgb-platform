package com.teacherblitz.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teacherblitz.entity.TUser;
import com.teacherblitz.mapper.TUserMapper;
import com.teacherblitz.service.ITUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020-12-04
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

    private final TUserMapper tUserMapper;
    public TUserServiceImpl(TUserMapper tUserMapper) {
        this.tUserMapper = tUserMapper;
    }

    @Override
    public String index() {
        List<TUser> tUsers = tUserMapper.selectList(Wrappers.<TUser>lambdaQuery().lt(TUser::getId, 2));
        return tUsers.get(0).getNickname();
    }
}
