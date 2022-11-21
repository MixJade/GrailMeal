package com.grail.mapper;

import com.grail.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单明细表 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}
