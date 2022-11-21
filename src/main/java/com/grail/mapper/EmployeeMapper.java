package com.grail.mapper;

import com.grail.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
