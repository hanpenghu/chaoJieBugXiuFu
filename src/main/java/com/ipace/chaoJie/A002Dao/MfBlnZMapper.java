package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.MfBlnZ;
import com.ipace.chaoJie.A004Dto.MfBlnZExample;
import com.ipace.chaoJie.A004Dto.MfBlnZKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfBlnZMapper {
    int countByExample(MfBlnZExample example);

    int deleteByExample(MfBlnZExample example);

    int deleteByPrimaryKey(MfBlnZKey key);

    int insert(MfBlnZ record);

    int insertSelective(MfBlnZ record);

    List<MfBlnZ> selectByExample(MfBlnZExample example);

    MfBlnZ selectByPrimaryKey(MfBlnZKey key);

    int updateByExampleSelective(@Param("record") MfBlnZ record, @Param("example") MfBlnZExample example);

    int updateByExample(@Param("record") MfBlnZ record, @Param("example") MfBlnZExample example);

    int updateByPrimaryKeySelective(MfBlnZ record);

    int updateByPrimaryKey(MfBlnZ record);
}