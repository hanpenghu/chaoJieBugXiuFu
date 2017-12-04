package com.ipace.chaoJie.A002Dao;

import com.ipace.chaoJie.A004Dto.BatRec1;
import com.ipace.chaoJie.A004Dto.BatRec1Example;
import com.ipace.chaoJie.A004Dto.BatRec1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatRec1Mapper {
    int countByExample(BatRec1Example example);

    int deleteByExample(BatRec1Example example);

    int deleteByPrimaryKey(BatRec1Key key);

    int insert(BatRec1 record);

    int insertSelective(BatRec1 record);

    List<BatRec1> selectByExampleWithBLOBs(BatRec1Example example);

    List<BatRec1> selectByExample(BatRec1Example example);

    BatRec1 selectByPrimaryKey(BatRec1Key key);

    int updateByExampleSelective(@Param("record") BatRec1 record, @Param("example") BatRec1Example example);

    int updateByExampleWithBLOBs(@Param("record") BatRec1 record, @Param("example") BatRec1Example example);

    int updateByExample(@Param("record") BatRec1 record, @Param("example") BatRec1Example example);

    int updateByPrimaryKeySelective(BatRec1 record);

    int updateByPrimaryKeyWithBLOBs(BatRec1 record);

    int updateByPrimaryKey(BatRec1 record);
}