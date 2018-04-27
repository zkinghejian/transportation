package com.trans.mapper;

import com.trans.pojo.OrderImg;

public interface OrderImgMapper {
    int insertImg(OrderImg record);

    int insertSelective(OrderImg record);
}