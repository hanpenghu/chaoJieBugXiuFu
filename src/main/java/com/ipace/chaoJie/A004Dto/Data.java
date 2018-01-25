package com.ipace.chaoJie.A004Dto;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static Data gD(){
        return new Data();
    }
    private List<Object>objs=new ArrayList<>();

    public List<Object> getObjs() {
        return objs;
    }

    public Data setObjs(List<Object> objs) {
        this.objs = objs;
        return this;
    }
}
