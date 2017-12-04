package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.TfIc;
import com.ipace.chaoJie.A004Dto.TfIcExample;
import com.ipace.chaoJie.A004Dto.TfIcKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfIcMapper {
    int countByExample(TfIcExample example);

    int deleteByExample(TfIcExample example);

    int deleteByPrimaryKey(TfIcKey key);

    int insert(TfIc record);

    int insertSelective(TfIc record);

    List<TfIc> selectByExample(TfIcExample example);

    TfIc selectByPrimaryKey(TfIcKey key);

    int updateByExampleSelective(@Param("record") TfIc record, @Param("example") TfIcExample example);

    int updateByExample(@Param("record") TfIc record, @Param("example") TfIcExample example);

    int updateByPrimaryKeySelective(TfIc record);

    int updateByPrimaryKey(TfIc record);
}