package com.grail.service.impl;

import com.grail.entity.AddressBook;
import com.grail.mapper.AddressBookMapper;
import com.grail.service.IAddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地址管理 服务实现类
 * </p>
 *
 * @author MixJade
 * @since 2022-11-20
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements IAddressBookService {

}
