package com.ipace.chaoJie.A002Dao;


import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

public interface A001TongYongMapper {
/////////////////////////////////////////////////////////////////////////
    int chaoJieBug001_1();
    int chaoJieBug001_2();
    int chaoJieBug001_3();
    int chaoJieBug001_4();
    int chaoJieBug001_5();
    int chaoJieBug001_6();
    int chaoJieBug001_7();

    //测试Create表
    @Update("Create table test3 ( id int,name varchar(100))")
    void CreateTab();//返回数据居然是 0

    //判断表test1是否存在
    @Select({"Select 1 From sysObjects Where Name='test1'"})
    Integer tabCount();
/////////////////////////////////////////////////////////////////////////
    //一下是钱伟用的

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
}
