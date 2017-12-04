package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.MfBln;
import com.ipace.chaoJie.A004Dto.MfBlnExample;
import com.ipace.chaoJie.A004Dto.MfBlnKey;
import com.ipace.chaoJie.A004Dto.MfBlnWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfBlnMapper {
    int countByExample(MfBlnExample example);

    int deleteByExample(MfBlnExample example);

    int deleteByPrimaryKey(MfBlnKey key);

    int insert(MfBlnWithBLOBs record);

    int insertSelective(MfBlnWithBLOBs record);

    List<MfBlnWithBLOBs> selectByExampleWithBLOBs(MfBlnExample example);

    List<MfBln> selectByExample(MfBlnExample example);

    MfBlnWithBLOBs selectByPrimaryKey(MfBlnKey key);

    int updateByExampleSelective(@Param("record") MfBlnWithBLOBs record, @Param("example") MfBlnExample example);

    int updateByExampleWithBLOBs(@Param("record") MfBlnWithBLOBs record, @Param("example") MfBlnExample example);

    int updateByExample(@Param("record") MfBln record, @Param("example") MfBlnExample example);

    int updateByPrimaryKeySelective(MfBlnWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MfBlnWithBLOBs record);

    int updateByPrimaryKey(MfBln record);
}