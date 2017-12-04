package com.ipace.chaoJie.A002Dao;


import com.ipace.chaoJie.A004Dto.BatRec1Day;
import com.ipace.chaoJie.A004Dto.MfBln;
import com.ipace.chaoJie.A004Dto.TfIc;

import java.util.List;

public interface A002ChaoJieBug002Mapper {
        /////////////////////////////////////////////////////////////////////////
       List<MfBln> getMfBln001();

    List<BatRec1Day> getSamePrdNoBatNoWh_bat_rec1_day(TfIc tfIc);

    int getSamePrdNoBatNoWh_bat_rec1_dayCount(TfIc tfIc);

    List<TfIc> getItmOfLastOfTfIcOfICLN(TfIc tfIc1);
/////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////
////////////////A002ChaoJieBug002Mapper/////////////////////////////////////////////////////////
}

