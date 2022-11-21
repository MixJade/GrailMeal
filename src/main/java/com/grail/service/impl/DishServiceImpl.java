package com.grail.service.impl;

import com.grail.entity.Dish;
import com.grail.mapper.DishMapper;
import com.grail.service.IDishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜品管理 服务实现类
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements IDishService {

}
