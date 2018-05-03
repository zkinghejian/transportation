package com.trans.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.trans.pojo.Order;

public interface BaseMapper {
	List<Order> getOrders(@Param("phoneno")String phoneno);
}
