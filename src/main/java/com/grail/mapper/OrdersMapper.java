package com.grail.mapper;

import com.grail.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}
