package com.grail.mapper;

import com.grail.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜品及套餐分类 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
