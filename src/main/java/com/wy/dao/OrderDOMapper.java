package com.wy.dao;

import com.wy.dataobject.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDOMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderDO record);

    int updateByPrimaryKey(OrderDO record);
}