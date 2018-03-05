package com.ipace.chaoJie.A002Dao;


import com.ipace.chaoJie.A004Dto.BatRec1Day;
import com.ipace.chaoJie.A004Dto.MfBln;
import com.ipace.chaoJie.A004Dto.TfIc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface A002ChaoJieBug002Mapper {
        /////////////////////////////////////////////////////////////////////////
       List<MfBln> getMfBln001();

    List<BatRec1Day> getSamePrdNoBatNoWh_bat_rec1_day(TfIc tfIc);

    int getSamePrdNoBatNoWh_bat_rec1_dayCount(TfIc tfIc);

    List<TfIc> getItmOfLastOfTfIcOfICLN(TfIc tfIc1);

    @Insert({"insert into bat_rec1(bat_no,prd_no,wh,qty_in)values(#{batNo},#{prdNo},#{diaoBoDanRuHuoKuWei},#{qtyIn})"})
    Integer insertBatRec1(@Param("batNo")String  batNo,
                          @Param("prdNo")String prdNo,
                          @Param("diaoBoDanRuHuoKuWei")String diaoBoDanRuHuoKuWei,
                          @Param("qtyIn")String qtyIn);


/////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////
////////////////A002ChaoJieBug002Mapper/////////////////////////////////////////////////////////
}

