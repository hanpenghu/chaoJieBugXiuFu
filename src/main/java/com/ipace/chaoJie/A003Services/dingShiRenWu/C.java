package com.ipace.chaoJie.A003Services.dingShiRenWu;

import com.ipace.chaoJie.A002Dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component("c")
public class C {

    @Autowired
    public MfIcMapper mfIcMapper;

    @Autowired
    public A002ChaoJieBug002Mapper a002ChaoJieBug002Mapper;

    @Autowired
    public TfBlnMapper tfBlnMapper;

    @Autowired
    public MfBlnMapper mfBlnMapper;

    @Autowired
    public TfIcMapper tfIcMapper;

    @Autowired
    public BatRec1DayMapper batRec1DayMapper;

    @Autowired
    public BatRec1Mapper batRec1Mapper;
}
