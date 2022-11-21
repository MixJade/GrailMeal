package com.grail.mapper;

import com.grail.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜品管理 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}
