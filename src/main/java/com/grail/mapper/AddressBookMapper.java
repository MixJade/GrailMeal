package com.grail.mapper;

import com.grail.entity.AddressBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 地址管理 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
