package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.TfBln;
import com.ipace.chaoJie.A004Dto.TfBlnExample;
import com.ipace.chaoJie.A004Dto.TfBlnKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfBlnMapper {
    int countByExample(TfBlnExample example);

    int deleteByExample(TfBlnExample example);

    int deleteByPrimaryKey(TfBlnKey key);

    int insert(TfBln record);

    int insertSelective(TfBln record);

    List<TfBln> selectByExample(TfBlnExample example);

    TfBln selectByPrimaryKey(TfBlnKey key);

    int updateByExampleSelective(@Param("record") TfBln record, @Param("example") TfBlnExample example);

    int updateByExample(@Param("record") TfBln record, @Param("example") TfBlnExample example);

    int updateByPrimaryKeySelective(TfBln record);

    int updateByPrimaryKey(TfBln record);
}