package com.trans.mapper;

import com.trans.pojo.OrderImg;

public interface OrderImgMapper {
    int insertImg(OrderImg record) throws Exception;

    int insertSelective(OrderImg record) throws Exception;
}