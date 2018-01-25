package com.ipace.chaoJie.A000Component;

import com.ipace.chaoJie.A002Dao.A001TongYongMapper;
import com.ipace.chaoJie.A003Services.QianWeiChengBenJiSuan.ChengBenJiSuan1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Cnst {
    public static final String charJson="application/json;charset=utf-8";
    @Autowired
    public A001TongYongMapper a001TongYongMapper;
    @Autowired
    public ChengBenJiSuan1 chengBenJiSuan1;
}
