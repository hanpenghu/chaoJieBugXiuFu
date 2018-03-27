package com.ipace.chaoJie.A003Services.dingShiRenWu;

import com.ipace.chaoJie.A004Dto.TfBln;

import java.util.ArrayList;
import java.util.List;

public class TfBlnListObjOfSameBlNo {
    List<TfBln> sameTfBlnNoList = new ArrayList<>();

    public List<TfBln> getSameTfBlnNoList() {
        return sameTfBlnNoList;
    }

    public TfBlnListObjOfSameBlNo setSameTfBlnNoList(List<TfBln> sameTfBlnNoList) {
        this.sameTfBlnNoList = sameTfBlnNoList;
        return this;
    }
}
