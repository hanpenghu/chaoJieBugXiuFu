package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.MfIc;
import com.ipace.chaoJie.A004Dto.MfIcExample;
import com.ipace.chaoJie.A004Dto.MfIcKey;
import com.ipace.chaoJie.A004Dto.MfIcWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfIcMapper {
    int countByExample(MfIcExample example);

    int deleteByExample(MfIcExample example);

    int deleteByPrimaryKey(MfIcKey key);

    int insert(MfIcWithBLOBs record);

    int insertSelective(MfIcWithBLOBs record);

    List<MfIcWithBLOBs> selectByExampleWithBLOBs(MfIcExample example);

    List<MfIc> selectByExample(MfIcExample example);

    MfIcWithBLOBs selectByPrimaryKey(MfIcKey key);

    int updateByExampleSelective(@Param("record") MfIcWithBLOBs record, @Param("example") MfIcExample example);

    int updateByExampleWithBLOBs(@Param("record") MfIcWithBLOBs record, @Param("example") MfIcExample example);

    int updateByExample(@Param("record") MfIc record, @Param("example") MfIcExample example);

    int updateByPrimaryKeySelective(MfIcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MfIcWithBLOBs record);

    int updateByPrimaryKey(MfIc record);
}