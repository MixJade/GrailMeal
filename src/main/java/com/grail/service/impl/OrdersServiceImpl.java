package com.grail.service.impl;

import com.grail.entity.Orders;
import com.grail.mapper.OrdersMapper;
import com.grail.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
