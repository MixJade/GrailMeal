package com.grail.service.impl;

import com.grail.entity.ShoppingCart;
import com.grail.mapper.ShoppingCartMapper;
import com.grail.service.IShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements IShoppingCartService {

}
