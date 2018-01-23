package com.ipace.chaoJie.A000Component;

import com.ipace.chaoJie.A002Dao.A001TongYongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Cnst {
    @Autowired
    public A001TongYongMapper a001TongYongMapper;
}
