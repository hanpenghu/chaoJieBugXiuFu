package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.BatRec1Day;
import com.ipace.chaoJie.A004Dto.BatRec1DayExample;
import com.ipace.chaoJie.A004Dto.BatRec1DayKey;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatRec1DayMapper {
    int countByExample(BatRec1DayExample example);

    int deleteByExample(BatRec1DayExample example);

    int deleteByPrimaryKey(BatRec1DayKey key);

    int insert(BatRec1Day record);

    int insertSelective(BatRec1Day record);

    List<BatRec1Day> selectByExample(BatRec1DayExample example);

    BatRec1Day selectByPrimaryKey(BatRec1DayKey key);

    int updateByExampleSelective(@Param("record") BatRec1Day record, @Param("example") BatRec1DayExample example);

    int updateByExample(@Param("record") BatRec1Day record, @Param("example") BatRec1DayExample example);

    int updateByPrimaryKeySelective(BatRec1Day record);

    int updateByPrimaryKey(BatRec1Day record);

}