package com.grail.mapper;

import com.grail.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
