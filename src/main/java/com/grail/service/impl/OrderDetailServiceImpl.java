package com.grail.service.impl;

import com.grail.entity.OrderDetail;
import com.grail.mapper.OrderDetailMapper;
import com.grail.service.IOrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
