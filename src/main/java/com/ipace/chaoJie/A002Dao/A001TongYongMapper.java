package com.ipace.chaoJie.A002Dao;
import org.apache.ibatis.annotations.*;

public interface A001TongYongMapper {
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

    @Update({"drop table test1"})
    void droptab1();

////////////////////钱伟11月份直接(或者其他)执行前清理//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////
    //一下是钱伟用的


    @Update({"drop table A_A1"})
    void qinWei_QingChuShuju1();
    @Update({"drop table A_A2"})
    void qinWei_QingChuShuju2();
    @Update({"drop table A_A3"})
    void qinWei_QingChuShuju3();
    @Update({"drop table A_B1"})
    void qinWei_QingChuShuju4();
    @Update({"drop table A_B2"})
    void qinWei_QingChuShuju5();
    @Update({"drop table A_B3"})
    void qinWei_QingChuShuju6();
    @Update({"drop table A_B4"})
    void qinWei_QingChuShuju7();
    @Update({"drop table A_CB4"})
    void qinWei_QingChuShuju8();
    @Update({"drop table A_CB6"})
    void qinWei_QingChuShuju9();
    @Update({"drop table A_A1_A"})
    void qinWei_QingChuShuju10();
    @Update({"drop table A_A1_B"})
    void qinWei_QingChuShuju11();
    @Delete({"DELETE FROM A_CB2 WHERE YY='2016' or YY ='2017'"})
    void qinWei_QingChuShuju12();

    @Insert({"insert into A_CB2(YY,MM,PRD_NO) SELECT #{a1},#{a2},PRD_NO FROM PRDT WHERE KND='2' OR KND='3'"})
    Integer x1(@Param("a1") String a1,@Param("a2")  String a2);


    @Update({"CREATE TABLE A_A1" +
            "(" +
            "TZ_NO varchar(20) NOT NULL," +
            "MO_NO varchar(20) NOT NULL," +
            "TZ_QTY numeric(22, 8) NULL," +
            "ZZFY numeric(22, 8) NULL," +
            "BZFY numeric(22, 8) NULL," +
            "YTZF numeric(22, 8) NULL," +
            "ZRGF numeric(22, 8) NULL," +
            "BRGF numeric(22, 8) NULL," +
            "YTRG numeric(22, 8) NULL," +
            "ZWR_QTY numeric(22, 8) NULL," +
            "YT_QTY numeric(22, 8) NULL," +
            "BWR_QTY numeric(22, 8) NULL," +
            "BMM_QTY numeric(22, 8) NULL," +
            "YWR_QTY numeric(22, 8) NULL" +
            ")"})
    void x2();

    @Insert({"insert into A_A1(TZ_NO,MO_NO,TZ_QTY)" +
            "SELECT TZ_NO,MO_NO,QTY FROM MF_TZ WHERE TZ_DD<#{a3} AND MO_NO IN (SELECT MO_NO FROM MF_MO)"})
    void x3(@Param("a3") String a3);

    @Insert({"insert into A_A1(TZ_NO,MO_NO,TZ_QTY)" +
            "SELECT TZ_NO,MO_NO,QTY FROM MF_TZ WHERE TZ_DD>=#{a3} and TZ_DD<=#{a4} " +
            "and mo_no in (select mo_no from mf_mo)"})
    void x4(@Param("a3") String a3, @Param("a4") String a4);

    @Update({"CREATE TABLE A_CB4\n" +
            "(\n" +
            "YY smallint NOT NULL,\n" +
            "MM smallint NOT NULL,\n" +
            "TZ_NO varchar(20) NULL,\n" +
            "MO_NO varchar(20) NULL,\n" +
            "PRD_NO varchar(255) NULL,\n" +
            "ID_NO varchar(255) NULL,\n" +
            "WR_QTY numeric(22,8) NULL,\n" +
            "DEP varchar(20) NULL,\n" +
            "ZC_NO varchar(20) NULL,\n" +
            "UT_TIME numeric(22,8) NULL,\n" +
            "ZJS numeric(22,8) NULL,\n" +
            "ZJE numeric(22,8) NULL,\n" +
            "ZZL numeric(30,18) NULL,\n" +
            "ZJF numeric(30,18) NULL,\n" +
            "MJF numeric(30,18) NULL,\n" +
            "YSF numeric(30,18) NULL,\n" +
            "GJF numeric(30,18) NULL,\n" +
            "WHF numeric(30,18) NULL,\n" +
            "XLF numeric(30,18) NULL,\n" +
            "TXF numeric(30,18) NULL,\n" +
            "DF numeric(30,18) NULL,\n" +
            "QTF numeric(30,18) NULL,\n" +
            "RJS numeric(22,8) NULL,\n" +
            "RJE numeric(22,8) NULL,\n" +
            "RGL numeric(30,18) NULL,\n" +
            "RGF numeric(30,18) NULL,\n" +
            "ZZF numeric(30,18) NULL\n" +
            ")"})
    void x5();

    @Insert("insert into A_CB4(YY,MM,TZ_NO,MO_NO,PRD_NO,ID_NO,WR_QTY,DEP,ZC_NO,UT_TIME,ZJS,RJS)\n" +
            "SELECT #{a1},#{a2},A.TZ_NO,\n" +
            "(SELECT MO_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)MO_NO,\n" +
            "A.PRD_NO,A.ID_NO,SUM(isnull(A.QTY_FIN,0))WR_QTY,\n" +
            "(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)DEP,\n" +
            "(SELECT ZC_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)ZC_NO,\n" +
            "(select UT_TIME from tf_zc where bom_no=A.id_no " +
            "and ZC_NO=(SELECT ZC_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)) UT_TIME,\n" +
            "isnull((select RT_MAKE from dept where dep=(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)),0) ZJS,\n" +
            "isnull((select RT_MAN from dept where dep=(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)),0) RJS\n" +
            "FROM TF_WR A\n" +
            "WHERE A.WR_NO in (select WR_NO from MF_WR where WR_DD>=#{a3} and WR_DD<=#{a4})\n" +
            "GROUP BY A.TZ_NO,A.PRD_NO,A.ID_NO")
    void x6(@Param("a1") String a1,@Param("a2") String a2,@Param("a3") String a3,@Param("a4") String a4);

    @Update("update A_CB4\n" +
            "set ZJE=(WR_QTY/UT_TIME/60*ISNULL(ZJS,0)),RJE=(WR_QTY/UT_TIME/60*ISNULL(RJS,0))\n" +
            "from A_CB4 where yy=#{a1} and mm=#{a2} and isnull(UT_TIME,0)!=0")
    Integer x7(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */

    @Update("update A_CB4\n" +
            "SET ZZL= ZJE/(select SUM(isnull(ZJE,0)) from A_CB4)," +
            "RGL= RJE/(select SUM(isnull(RJE,0)) from A_CB4) \n" +
            "FROM A_CB4\n" +
            "where YY=#{a1} and MM=#{a2}")
    Integer x8(@Param("a1") String a1, @Param("a2") String a2,
               @Param("a3") String a3, @Param("a4") String a4);



    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("update A_CB4\n" +
            "set ZJF = ZZL * (select ZJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    MJF = ZZL * (select MJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    YSF = ZZL * (select YSF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    GJF = ZZL * (select GJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    WHF = ZZL * (select WHF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    XLF = ZZL * (select XLF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    TXF = ZZL * (select TXF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    DF = ZZL * (select DF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    QTF = ZZL * (select QTF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    RGF = RGL * (select RGF from A_CB3 where yy=#{a1} and mm=#{a2})    \n" +
            "from A_CB4 where YY=#{a1} and MM=#{a2}")
    Integer x9(@Param("a1") String a1, @Param("a2") String a2,
               @Param("a3") String a3, @Param("a4") String a4);

    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("update A_CB4\n" +
            "set ZZF = ZJF+MJF+YSF+GJF+WHF+XLF+TXF+DF+QTF\n" +
            "from A_CB4\n" +
            "where yy=#{a1} and mm=#{a2}")
    Integer x10(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET BZFY=(SELECT ISNULL(ZZF,0) FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BRGF=(SELECT ISNULL(RGF,0) FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BWR_QTY=(SELECT WR_QTY FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BMM_QTY=(SELECT SUM(isnull(QTY,0)) FROM " +
            "TF_MM0 WHERE MO_NO=A.MO_NO and mm_dd>=#{a3} and mm_dd<=#{a4} GROUP BY MO_NO)\n" +
            "FROM A_A1 A WHERE A.TZ_NO IN (SELECT TZ_NO FROM A_CB4 WHERE YY=#{a1} AND MM=#{a2})\n")
    Integer x11(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_CB6\n" +
            "(\n" +
            "\tYY smallint NOT NULL,\n" +
            "    MM smallint NOT NULL,\n" +
            "\tMM_NO varchar(20) NOT NULL,\n" +
            "\tMM_DD datetime NULL,\n" +
            "\tMO_NO varchar(20) NULL,\n" +
            "\tPRD_NO varchar(225) NULL,\n" +
            "\tID_NO varchar(38) NULL,\n" +
            "\tQTY numeric(22, 8) NULL,\n" +
            "\tCLFY numeric(22, 8) NULL,\n" +
            "\tTGFY numeric(22, 8) NULL,\n" +
            "\tZZFY numeric(22, 8) NULL,\n" +
            "\tRGFY numeric(22, 8) NULL,\n" +
            "\tQTFY numeric(22, 8) NULL,\n" +
            "\tZCB numeric(22, 8) NULL\n" +
            ")\n")
    void x12(@Param("a1") String a1, @Param("a2") String a2,
             @Param("a3") String a3, @Param("a4") String a4);


    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Insert("insert into A_CB6(YY,MM,MM_NO,MM_DD,MO_NO,PRD_NO,iD_NO,QTY) select #{a1}," +
            "#{a2},MM_NO,MM_DD,MO_NO,PRD_NO,ID_NO,QTY from TF_MM0 where MM_DD>=#{a3} " +
            "and MM_DD<=#{a4}")
    void x13(@Param("a1") String a1, @Param("a2") String a2,
             @Param("a3") String a3, @Param("a4") String a4);



    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("update A_CB6\n" +
            "set zcb=((select dwcb from A_CB1 where mo_no=A.mo_no and mrp_no=A.prd_no)*A.QTY)\n" +
            "from A_CB6 A where mo_no in (select mo_no from A_CB1) and yy=#{a1} and mm=#{a2}")
    Integer x14(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);
    /**
     *update A_CB6
     set zcb=((select dwcb from A_CB1 where mo_no=A.mo_no and mrp_no=A.prd_no)*A.QTY)
     from A_CB6 A where mo_no in (select mo_no from A_CB1) and yy='2016' and mm='1'
     * */

    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("UPDATE A_CB6\n" +
            "SET \n" +
            "ZZFY=(SELECT ((SUM(ISNULL(ZZFY,0))-SUM(ISNULL(YTZF,0))+SUM(ISNULL(BZFY,0)))/(SUM(ISNULL(ZWR_QTY,0))-SUM(ISNULL(YWR_QTY,0))+SUM(ISNULL(BWR_QTY,0))))" +
            " FROM A_A1 WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0))!=0 AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY,\n" +
            "RGFY=(SELECT ((SUM(ISNULL(ZRGF,0))-SUM(ISNULL(YTRG,0))+SUM(ISNULL(BRGF,0)))/(SUM(ISNULL(ZWR_QTY,0))-SUM(ISNULL(YWR_QTY,0))+SUM(ISNULL(BWR_QTY,0)))) " +
            "FROM A_A1 WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0))!=0 AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY\n" +
            "FROM A_CB6 A\n" +
            "WHERE A.MO_NO IN (SELECT MO_NO FROM A_CB4 WHERE YY=#{a1} AND MM=#{a2})")
    Integer x15(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("CREATE TABLE A_B1\n" +
            "(\n" +
            "\tYY smallint NOT NULL,\n" +
            "    MM smallint NOT NULL,\n" +
            "\tTZ_NO varchar(20) NOT NULL,\n" +
            "\tMO_NO varchar(20) NOT NULL,\n" +
            "\tTZ_QTY numeric(22, 8) NULL,\n" +
            "\tZZFY numeric(22, 8) NULL,\n" +
            "\tBZFY numeric(22, 8) NULL,\n" +
            "\tYTZF numeric(22, 8) NULL,\n" +
            "\tZRGF numeric(22, 8) NULL,\n" +
            "\tBRGF numeric(22, 8) NULL,\n" +
            "\tYTRG numeric(22, 8) NULL,\n" +
            "\tZWR_QTY numeric(22, 8) NULL,\n" +
            "\tYT_QTY numeric(22, 8) NULL,\n" +
            "\tBWR_QTY numeric(22, 8) NULL,\n" +
            "\tBMM_QTY numeric(22, 8) NULL,\n" +
            "\tYWR_QTY numeric(22, 8) NULL\n" +
            ")")
    void x16(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_B1 SELECT #{a1},#{a2},* FROM A_A1")
    void x17(@Param("a1") String a1, @Param("a2") String a2,
             @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A1\n" +
            "SET ZZFY=ISNULL(ZZFY,0)+ISNULL(BZFY,0),ZRGF=ISNULL(ZRGF,0)+ISNULL(BRGF,0)," +
            "ZWR_QTY=ISNULL(ZWR_QTY,0)+ISNULL(BWR_QTY,0)\n" +
            "FROM A_A1")
    Integer x18(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);



    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("UPDATE A_A1\n" +
            "SET YTZF=A.BZFY,YTRG=A.BRGF\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY<=(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 " +
            "WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x19(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET \n" +
            "YTZF=(ISNULL(ZZFY,0)-ISNULL(YTZF,0))/(ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))*ISNULL(BMM_QTY,0),\n" +
            "YTRG=(ISNULL(ZRGF,0)-ISNULL(YTRG,0))/(ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))*ISNULL(BMM_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY>(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x20(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET YWR_QTY=ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY<=(SELECT SUM(isnull(QTY,0)) FROM TF_MM0" +
            " WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x21(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET YWR_QTY=ISNULL(YWR_QTY,0)+ISNULL(BMM_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY>(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 " +
            "WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x22(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET BZFY=0,BRGF=0,BWR_QTY=0,BMM_QTY=0\n" +
            "FROM A_A1")
    Integer x23(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_B4\n" +
            "(\n" +
            "\tYY smallint NOT NULL,\n" +
            "    MM smallint NOT NULL,\n" +
            "\tMO_NO varchar(20) NOT NULL,\n" +
            "\tMRP_NO varchar(255) NULL,\n" +
            "\tKND varchar(2) NULL,\n" +
            "\tCST numeric(22, 8) NULL,\n" +
            "\tDWCB numeric(22, 8) NULL\n" +
            "\t)")
    void x24(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Insert("insert into A_B4(YY,MM,MO_NO,MRP_NO,KND,CST)\n" +
            "select \n" +
            "#{a1},#{a2},A.MO_NO,(select mrp_no from mf_mo where mo_no=A.mo_no)MRP_NO,\n" +
            "(SELECT KND FROM PRDT WHERE PRD_NO=(select mrp_no from mf_mo where mo_no=A.mo_no))KND,\n" +
            "sum(isnull(A.cst,0))CST\n" +
            "from tf_ml A where A.mlid='ML' and \n" +
            "A.mo_no in (SELECT mo_no FROM MF_MO WHERE FIN_DD<=#{a4} " +
            "and isnull(qty_fin,0)=0) and A.mo_no not in" +
            " (select mo_no from mf_mo where mo_dd<#{a3})\n" +
            "group by A.mo_no")
    void x25(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_B4\n" +
            "SET\n" +
            "DWCB=(SELECT SUM(CST) FROM A_B4 WHERE YY=#{a1} " +
            "AND MM=#{a2} AND MRP_NO=A.MRP_NO GROUP BY MRP_NO)/(SELECT SUM(QTY) FROM A_CB6 WHERE YY=#{a1} " +
            "AND MM=#{a2} AND MO_NO NOT IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3})AND " +
            "PRD_NO IN (SELECT MRP_NO FROM A_B4 WHERE YY=#{a1} AND MM=#{a2}) " +
            "AND PRD_NO=A.MRP_NO GROUP BY PRD_NO)\n" +
            "FROM A_B4 A WHERE YY=#{a1} AND MM=#{a2}")
    Integer x26(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET QTFY =(SELECT DWCB FROM A_B4 WHERE YY=#{a1} AND MM=#{a2} AND MRP_NO=A.PRD_NO)*A.QTY\n" +
            "FROM A_CB6 A \n" +
            "WHERE A.YY=#{a1} AND A.MM=#{a2} \n" +
            "AND MO_NO NOT IN (SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3})\n" +
            "AND PRD_NO IN (SELECT MRP_NO FROM A_B4 WHERE YY=#{a1} AND MM=#{a2})")
    Integer x27(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET\n" +
            "QTFY=ISNULL(QTFY,0)+((SELECT SUM(CST) FROM A_B4 WHERE YY=#{a1} " +
            "AND MM=#{a2} AND DWCB IS NULL)/(SELECT SUM(QTY) FROM A_CB6 " +
            "WHERE YY=#{a1} AND MM=#{a2} AND MO_NO NOT IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3}))*A.QTY)\n" +
            "FROM A_CB6 A WHERE A.YY=#{a1} AND A.MM=#{a2} \n" +
            "AND A.mo_no NOT IN (SELECT mo_no FROM MF_MO WHERE MO_DD<#{a3})")
    Integer x28(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_A2\n" +
            "(\n" +
            "MLID varchar(4) NULL,\n" +
            "TZ_NO varchar(20) NULL,\n" +
            "MO_NO varchar(20) NULL,\n" +
            "MRP_NO varchar(255) NULL,\n" +
            "MRP_QTY numeric(22,8) NULL,\n" +
            "MM_ZQTY numeric(22,8) NULL,\n" +
            "MM_YTQTY numeric(22,8) NULL,\n" +
            "MM_BQTY numeric(22,8) NULL,\n" +
            "MO_FIN datetime NULL,\n" +
            "PRD_NO varchar(255) NULL,\n" +
            "KND varchar(2) NULL,\n" +
            "EST_ITM varchar(4) NULL,\n" +
            "YL_QTY numeric(22,8) NULL,\n" +
            "ZQTY numeric(22,8) NULL,\n" +
            "ZCST numeric(22,8) NULL,\n" +
            "YTQTY numeric(22,8) NULL,\n" +
            "YTCST numeric(22,8) NULL,\n" +
            "BQTY numeric(22,8) NULL,\n" +
            "BCST numeric(22,8) NULL,\n" +
            "CY numeric(22,8) NULL,\n" +
            "B_DWCB numeric(22,8) NULL\n" +
            ")")
    void x29(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Insert("insert into A_A2(MLID,TZ_NO,MO_NO,MRP_NO,MRP_QTY,MM_BQTY,MO_FIN,PRD_NO,KND,EST_ITM,YL_QTY,BQTY,BCST,CY)\n" +
            "select A.MLID,A.TZ_NO,(select mo_no from mf_tz where tz_no=A.tz_no)MO_NO,\n" +
            "(SELECT MRP_NO FROM MF_MO WHERE MO_NO=(select mo_no from mf_tz where tz_no=A.tz_no))MRP_NO,\n" +
            "(SELECT QTY FROM MF_MO WHERE MO_NO=(select mo_no from mf_tz where tz_no=A.tz_no))MRP_BQTY,\n" +
            "(SELECT SUM(QTY) FROM TF_MM0 WHERE MO_NO=(select mo_no from mf_tz where tz_no=A.tz_no)" +
            " AND MM_DD>=#{a3} AND MM_DD<=#{a4})MM_BQTY,\n" +
            "(select FIN_DD from mf_mo where mo_no=(select mo_no from mf_tz where tz_no=A.tz_no))MO_FIN,\n" +
            "A.PRD_NO,(select knd from prdt where prd_no=A.prd_no)KND,\n" +
            "A.EST_ITM,(select qty from tf_tz where tz_no=A.tz_no and itm=A.est_itm)YL_QTY,\n" +
            "SUM(A.QTY)BQTY,SUM(A.CST)BCST,((select qty from tf_tz where tz_no=A.tz_no and itm=A.est_itm)-SUM(A.QTY))CY\n" +
            "from tf_ml A \n" +
            "where A.ml_dd>=#{a3} and A.ml_dd<=#{a4} and (tz_no is not null and tz_no !='') and A.mlid!='M4' \n" +
            "group by A.MLID,A.TZ_NO,A.PRD_NO,A.EST_ITM")
    void  x30(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Insert("insert into A_A2(MLID,TZ_NO,MO_NO,MRP_NO,MRP_QTY,MM_BQTY,MO_FIN,PRD_NO,KND,EST_ITM,YL_QTY,BQTY,BCST,CY)\n" +
            "select A.MLID,''TZ_NO,A.MO_NO,\n" +
            "(SELECT MRP_NO FROM MF_MO WHERE MO_NO=A.MO_NO)MRP_NO,\n" +
            "(SELECT ISNULL(QTY,0) FROM MF_MO WHERE MO_NO=A.MO_NO)MRP_QTY,\n" +
            "(SELECT SUM(ISNULL(QTY,0)) FROM TF_MM0 WHERE MO_NO=A.MO_NO AND MM_DD>=#{a3} AND MM_DD<=#{a4})MM_BQTY,\n" +
            "(select FIN_DD from mf_mo where mo_no=A.MO_NO)MO_FIN,\n" +
            "A.PRD_NO,(select knd from prdt where prd_no=A.prd_no)KND,A.EST_ITM," +
            "(select QTY_RSV from tf_mo where mo_no=A.mo_no and itm=A.est_itm)YL_QTY,\n" +
            "SUM(ISNULL(A.QTY,0))BQTY,SUM(ISNULL(A.CST,0))BCST,((select ISNULL(QTY_RSV,0)" +
            " from tf_mo where mo_no=A.mo_no and itm=A.est_itm)-SUM(ISNULL(A.QTY,0)))CY\n" +
            "from tf_ml A \n" +
            "where A.ml_dd>=#{a3} and A.ml_dd<=#{a4} and (tz_no is null or tz_no ='' or A.mlid='M4') \n" +
            "group by A.MLID,A.MO_NO,A.PRD_NO,A.EST_ITM")
    void x31(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_A2\n" +
            "set bcst=0\n" +
            "from A_A2 where knd!='4'")
    Integer x32(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(-(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0)))\n" +
            "from A_A2 WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND  MLID='M2'")
    Integer x33(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    //////////////下面是后来一次性替换的////////////////////////////////////
    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)<=(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)<=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x34(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MRP_QTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)<=(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)>(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x35(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)>(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)<=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x36(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MRP_QTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)>(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)>(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x37(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET CLFY=((SELECT SUM(isnull(B_DWCB,0)) FROM A_A2 WHERE KND='4' AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY)\n" +
            "FROM A_CB6 A WHERE A.YY=#{a1} AND A.MM=#{a2}")
    Integer x38(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_A3\n" +
            "(\n" +
            "MO_NO varchar(20) NULL,\n" +
            "PRD_NO varchar(255) NULL,\n" +
            "MO_QTY varchar(255) NULL,\n" +
            "ZMM_QTY numeric(22,8) NULL,\n" +
            "BMM_QTY numeric(22,8) NULL,\n" +
            "YMM_QTY numeric(22,8) NULL,\n" +
            "Z_QTY numeric(22,8) NULL,\n" +
            "B_QTY numeric(22,8) NULL,\n" +
            "Y_QTY numeric(22,8) NULL,\n" +
            "Z_AMT numeric(22,8) NULL,\n" +
            "B_AMT numeric(22,8) NULL,\n" +
            "Y_AMT numeric(22,8) NULL,\n" +
            "B_DWCB numeric(22,8) NULL\n" +
            ")")
    void x39(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_A3(MO_NO,PRD_NO,MO_QTY,BMM_QTY,B_QTY,B_AMT)\n" +
            "select A.MO_NO,A.PRD_NO,(SELECT QTY FROM MF_MO WHERE MO_NO=A.MO_NO)MO_QTY,\n" +
            "(SELECT SUM(ISNULL(QTY,0)) FROM TF_MM0 WHERE  MM_DD>=#{a3} AND MM_DD<=#{a4} AND MO_NO=A.MO_NO)BMM_QTY,\n" +
            "SUM(ISNULL(A.QTY,0))B_QTY,SUM(ISNULL(A.AMT,0))B_AMT from tf_tb A\n" +
            "where A.tb_no in (select tb_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "GROUP BY A.MO_NO,A.PRD_NO")
    void x40(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "B_DWCB= (((isnull(Z_AMT,0)-isnull(Y_AMT,0)+isnull(B_AMT,0))/(isnull(ZMM_QTY,0)-isnull(YMM_QTY,0)+isnull(BMM_QTY,0)))) \n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))>=(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x41(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "B_DWCB= (((isnull(Z_AMT,0)-isnull(Y_AMT,0)+isnull(B_AMT,0))/(isnull(Z_QTY,0)-isnull(Y_QTY,0)+isnull(B_QTY,0)))) \n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))<(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x42(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB6\n" +
            "set tgfy=(select isnull(b_dwcb,0) from A_A3 where mo_no=A.mo_no)*A.qty\n" +
            "from a_cb6 A where A.yy=#{a1} and A.mm=#{a2}")
    Integer x43(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET ZCB=(ISNULL(A.CLFY,0)+ISNULL(A.TGFY,0)+ISNULL(A.ZZFY,0)+ISNULL(A.RGFY,0))+isnull(A.QTFY,0)\n" +
            "from A_CB6 A \n" +
            "where A.YY=#{a1} AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' \n" +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE  MO_DD<=#{a4})")
    Integer x44(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=\n" +
            "(SELECT SUM(A.ZCB)/SUM(A.QTY) from A_CB6 A where A.YY=#{a1} " +
            "AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' " +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) " +
            "GROUP BY A.PRD_NO)\n" +
            "FROM A_A2 B WHERE B.PRD_NO IN (SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} " +
            "AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' " +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) GROUP BY A.PRD_NO)")
    Integer x45(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET BCST=ISNULL(B_DWCB,0)*BQTY\n" +
            "FROM A_A2 B WHERE B.PRD_NO IN " +
            "(SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} AND A.MM=#{a2} AND " +
            "(SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' AND A.MO_NO IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) GROUP BY A.PRD_NO)")
    Integer x46(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB6\n" +
            "SET CLFY=(SELECT SUM(ISNULL(B_DWCB,0)) FROM A_A2 WHERE " +
            "PRD_NO IN(SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} " +
            "AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' " +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} " +
            "AND MO_DD<=#{a4}) GROUP BY A.PRD_NO) AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY\n" +
            "FROM A_CB6 A WHERE A.MO_NO IN (SELECT MO_NO FROM A_A2 WHERE PRD_NO " +
            "IN(SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} AND A.MM=#{a2} AND " +
            "(SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' AND A.MO_NO IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) GROUP BY A.PRD_NO) GROUP BY MO_NO)")
    Integer x47(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_cb6\n" +
            "set ZCB=(ISNULL(A.CLFY,0)+ISNULL(A.TGFY,0)+ISNULL(A.ZZFY,0)+ISNULL(A.RGFY,0))+ISNULL(QTFY,0)\n" +
            "from A_cb6 A \n" +
            "where A.yy=#{a1} and A.mm=#{a2} and A.mo_no in " +
            "(select mo_no from mf_mo where mo_dd<=#{a4})")
    Integer x48(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_B2\n" +
            "(\n" +
            "\tYY smallint NOT NULL,\n" +
            "    MM smallint NOT NULL,\n" +
            "\tMLID varchar(4) NULL,\n" +
            "\tTZ_NO varchar(20) NULL,\n" +
            "\tMO_NO varchar(20) NULL,\n" +
            "\tMRP_NO varchar(255) NULL,\n" +
            "\tMRP_QTY numeric(22, 8) NULL,\n" +
            "\tMM_ZQTY numeric(22, 8) NULL,\n" +
            "\tMM_YTQTY numeric(22, 8) NULL,\n" +
            "\tMM_BQTY numeric(22, 8) NULL,\n" +
            "\tMO_FIN datetime NULL,\n" +
            "\tPRD_NO varchar(255) NULL,\n" +
            "\tKND varchar(2) NULL,\n" +
            "\tEST_ITM varchar(4) NULL,\n" +
            "\tYL_QTY numeric(22, 8) NULL,\n" +
            "\tZQTY numeric(22, 8) NULL,\n" +
            "\tZCST numeric(22, 8) NULL,\n" +
            "\tYTQTY numeric(22, 8) NULL,\n" +
            "\tYTCST numeric(22, 8) NULL,\n" +
            "\tBQTY numeric(22, 8) NULL,\n" +
            "\tBCST numeric(22, 8) NULL,\n" +
            "\tCY numeric(22, 8) NULL,\n" +
            "\tB_DWCB numeric(22, 8) NULL\n" +
            ")")
    void x49(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_B2 SELECT #{a1},#{a2},* FROM A_A2")
    void x50(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("CREATE TABLE A_B3\n" +
            "(\n" +
            "\tYY smallint NOT NULL,\n" +
            "    MM smallint NOT NULL,\n" +
            "\tMO_NO varchar(20) NULL,\n" +
            "\tPRD_NO varchar(255) NULL,\n" +
            "\tMO_QTY varchar(255) NULL,\n" +
            "\tZMM_QTY numeric(22, 8) NULL,\n" +
            "\tBMM_QTY numeric(22, 8) NULL,\n" +
            "\tYMM_QTY numeric(22, 8) NULL,\n" +
            "\tZ_QTY numeric(22, 8) NULL,\n" +
            "\tB_QTY numeric(22, 8) NULL,\n" +
            "\tY_QTY numeric(22, 8) NULL,\n" +
            "\tZ_AMT numeric(22, 8) NULL,\n" +
            "\tB_AMT numeric(22, 8) NULL,\n" +
            "\tY_AMT numeric(22, 8) NULL,\n" +
            "\tB_DWCB numeric(22, 8) NULL\n" +
            ")")
    void x51(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_B3 SELECT #{a1},#{a2},* FROM A_A3")
    void x52(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET\n" +
            "ZQTY=(ISNULL(ZQTY,0)+ISNULL(BQTY,0)),\n" +
            "MM_ZQTY=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0)) \n" +
            "FROM A_A2 WHERE MLID!='M2'")
    Integer x53(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET\n" +
            "MM_YTQTY=(ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0)) \n" +
            "FROM A_A2 \n" +
            "WHERE TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND MLID!='M2'")
    Integer x54(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET \n" +
            "MM_BQTY=0,\n" +
            "BQTY=0,\n" +
            "BCST=0,\n" +
            "B_DWCB=0,\n" +
            "CY=0\n" +
            "FROM A_A2")
    Integer x55(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "ZMM_QTY=ISNULL(ZMM_QTY,0)+ ISNULL(BMM_QTY,0),\n" +
            "Z_QTY=ISNULL(Z_QTY,0)+ISNULL(B_QTY,0),\n" +
            "YMM_QTY=ISNULL(YMM_QTY,0)+ISNULL(BMM_QTY,0),\n" +
            "Y_QTY=ISNULL(Y_QTY,0)+ISNULL(B_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))>=(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x56(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "ZMM_QTY=ISNULL(ZMM_QTY,0)+ ISNULL(BMM_QTY,0),\n" +
            "Z_QTY=ISNULL(Z_QTY,0)+ISNULL(B_QTY,0),\n" +
            "YMM_QTY=ISNULL(YMM_QTY,0)+ISNULL(BMM_QTY,0),\n" +
            "Y_QTY=ISNULL(Y_QTY,0)+ISNULL(BMM_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))<(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x57(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "Z_AMT=ISNULL(Z_AMT,0)+ISNULL(B_AMT,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})")
    Integer x58(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "Y_AMT=ISNULL(Z_AMT,0)-ISNULL(B_DWCB,0)*ISNULL(BMM_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})")
    Integer x59(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET \n" +
            "BMM_QTY=0,\n" +
            "B_QTY=0,\n" +
            "B_AMT=0,\n" +
            "B_DWCB=0\n" +
            "FROM A_A3")
    Integer x60(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB2\n" +
            "SET \n" +
            "DWCB=(SELECT SUM(ZCB)/SUM(QTY) FROM A_CB6 WHERE PRD_NO=A.PRD_NO GROUP BY PRD_NO)\n" +
            "FROM A_CB2 A WHERE A.YY=#{a1} AND A.MM=#{a2}")
    Integer x61(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    /////////////////////Q20180123/////下面是钱伟第二个计算用的/////////////////////////////////////////


    @Insert("insert into A_CB2(YY,MM,PRD_NO) SELECT #{a1},#{a2},PRD_NO FROM PRDT WHERE KND='2' OR KND='3'")
    void x62(@Param("a1") String a1, @Param("a2") String a2,
             @Param("a3") String a3, @Param("a4") String a4);
    @Insert("insert into A_A1(TZ_NO,MO_NO,TZ_QTY) \n" +
            "SELECT TZ_NO,MO_NO,QTY \n" +
            "FROM MF_TZ WHERE TZ_DD>=#{a3} and TZ_DD<=#{a4} and mo_no in (select mo_no from mf_mo)\n" +
            "AND TZ_NO NOT IN (SELECT TZ_NO FROM A_A1)")
    void x63(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);
    @Insert("insert into A_CB4(YY,MM,TZ_NO,MO_NO,PRD_NO,ID_NO,WR_QTY,DEP,ZC_NO,UT_TIME,ZJS,RJS)\n" +
            "SELECT #{a1},#{a2},A.TZ_NO,\n" +
            "(SELECT MO_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)MO_NO,\n" +
            "A.PRD_NO,A.ID_NO,SUM(isnull(A.QTY_FIN,0))WR_QTY,\n" +
            "(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)DEP,\n" +
            "(SELECT ZC_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)ZC_NO,\n" +
            "(select UT_TIME from tf_zc where bom_no=A.id_no and ZC_NO=(SELECT ZC_NO FROM MF_TZ WHERE TZ_NO=A.TZ_NO)) UT_TIME,\n" +
            "isnull((select RT_MAKE from dept where dep=(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)),0) ZJS,\n" +
            "isnull((select RT_MAN from dept where dep=(SELECT DEP FROM MF_TZ WHERE TZ_NO=A.TZ_NO)),0) RJS\n" +
            "FROM TF_WR A\n" +
            "WHERE A.WR_NO in (select WR_NO from MF_WR where WR_DD>=#{a3} and WR_DD<=#{a4})\n" +
            "GROUP BY A.TZ_NO,A.PRD_NO,A.ID_NO")
    void x64(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB4\n" +
            "set ZJE=(WR_QTY/UT_TIME/60*ISNULL(ZJS,0)),RJE=(WR_QTY/UT_TIME/60*ISNULL(RJS,0))\n" +
            "from A_CB4 where yy=#{a1} and mm=#{a2} and isnull(UT_TIME,0)!=0")
    Integer x65(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB4\n" +
            "SET ZZL= ZJE/(select SUM(isnull(ZJE,0)) from A_CB4 WHERE YY=#{a1} AND MM=#{a2})" +
            ",RGL= RJE/(select SUM(isnull(RJE,0)) from A_CB4 WHERE YY=#{a1} AND MM=#{a2}) \n" +
            "FROM A_CB4\n" +
            "where YY=#{a1} and MM=#{a2}")
    Integer x66(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("update A_CB4\n" +
            "set ZJF = ZZL * (select ZJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    MJF = ZZL * (select MJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    YSF = ZZL * (select YSF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    GJF = ZZL * (select GJF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    WHF = ZZL * (select WHF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    XLF = ZZL * (select XLF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    TXF = ZZL * (select TXF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    DF = ZZL * (select DF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    QTF = ZZL * (select QTF from A_CB3 where yy=#{a1} and mm=#{a2}),\n" +
            "    RGF = RGL * (select RGF from A_CB3 where yy=#{a1} and mm=#{a2})    \n" +
            "from A_CB4 where YY=#{a1} and MM=#{a2}")
    Integer x67(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB4\n" +
            "set ZZF = ZJF+MJF+YSF+GJF+WHF+XLF+TXF+DF+QTF\n" +
            "from A_CB4\n" +
            "where yy=#{a1} and mm=#{a2}")
    Integer x68(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET BZFY=(SELECT ISNULL(ZZF,0) FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BRGF=(SELECT ISNULL(RGF,0) FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BWR_QTY=(SELECT WR_QTY FROM A_CB4 WHERE TZ_NO=A.TZ_NO and YY=#{a1} AND MM=#{a2}),\n" +
            "    BMM_QTY=(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MO_NO=A.MO_NO and mm_dd>=#{a3} " +
            "and mm_dd<=#{a4} GROUP BY MO_NO)\n" +
            "FROM A_A1 A WHERE A.TZ_NO IN (SELECT TZ_NO FROM A_CB4 WHERE YY=#{a1} AND MM=#{a2})")
    Integer x69(@Param("a1") String a1, @Param("a2") String a2,
                @Param("a3") String a3, @Param("a4") String a4);

    @Insert("\n" +
            "insert into A_CB6(YY,MM,MM_NO,MM_DD,MO_NO,PRD_NO,iD_NO,QTY) select #{a1},#{a2},MM_NO,MM_DD,MO_NO,PRD_NO,ID_NO,QTY from TF_MM0 where MM_DD>=#{a3} and MM_DD<=#{a4}\n" +
            "\n")
    void x70(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB6\n" +
            "set zcb=((select dwcb from A_CB1 where mo_no=A.mo_no and mrp_no=A.prd_no)*A.QTY)\n" +
            "from A_CB6 A where mo_no in (select mo_no from A_CB1) and yy=#{a1} and mm=#{a2}")
    Integer x71(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET \n" +
            "ZZFY=(SELECT ((SUM(ISNULL(ZZFY,0))-SUM(ISNULL(YTZF,0))+SUM(ISNULL(BZFY,0)))/(SUM(ISNULL(ZWR_QTY,0))-SUM(ISNULL(YWR_QTY,0))+SUM(ISNULL(BWR_QTY,0)))) FROM A_A1 WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0))!=0 AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY,\n" +
            "RGFY=(SELECT ((SUM(ISNULL(ZRGF,0))-SUM(ISNULL(YTRG,0))+SUM(ISNULL(BRGF,0)))/(SUM(ISNULL(ZWR_QTY,0))-SUM(ISNULL(YWR_QTY,0))+SUM(ISNULL(BWR_QTY,0)))) FROM A_A1 WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0))!=0 AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY\n" +
            "FROM A_CB6 A\n" +
            "WHERE A.MO_NO IN (SELECT MO_NO FROM A_CB4 WHERE YY=#{a1} AND MM=#{a2})")
    Integer x72(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Insert("insert into A_B1 SELECT #{a1},#{a2},* FROM A_A1")
    void x73(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A1\n" +
            "SET ZZFY=ISNULL(ZZFY,0)+ISNULL(BZFY,0),ZRGF=ISNULL(ZRGF,0)+ISNULL(BRGF,0),ZWR_QTY=ISNULL(ZWR_QTY,0)+ISNULL(BWR_QTY,0)\n" +
            "FROM A_A1")
    Integer x74(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET YTZF=ISNULL(ZZFY,0),YTRG=ISNULL(ZRGF,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY<=(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x75(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET \n" +
            "YTZF=(ISNULL(ZZFY,0)-ISNULL(YTZF,0))/(ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))*ISNULL(BMM_QTY,0),\n" +
            "YTRG=(ISNULL(ZRGF,0)-ISNULL(YTRG,0))/(ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))*ISNULL(BMM_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY>(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x76(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A1\n" +
            "SET YWR_QTY=ISNULL(YWR_QTY,0)+ISNULL(BWR_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY<=(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x77(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Update("UPDATE A_A1\n" +
            "SET YWR_QTY=ISNULL(YWR_QTY,0)+ISNULL(BMM_QTY,0)\n" +
            "FROM A_A1 A WHERE (ISNULL(ZWR_QTY,0)-ISNULL(YWR_QTY,0))!=0 AND\n" +
            "ZWR_QTY>(SELECT SUM(isnull(QTY,0)) FROM TF_MM0 WHERE MM_DD<=#{a4} AND MO_NO=A.MO_NO GROUP BY MO_NO)")
    Integer x78(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A1\n" +
            "SET BZFY=0,BRGF=0,BWR_QTY=0,BMM_QTY=0\n" +
            "FROM A_A1")
    Integer x79(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Insert("insert into A_B4(YY,MM,MO_NO,MRP_NO,KND,CST)\n" +
            "select \n" +
            "#{a1},#{a2},A.MO_NO,(select mrp_no from mf_mo where mo_no=A.mo_no)MRP_NO,\n" +
            "(SELECT KND FROM PRDT WHERE PRD_NO=(select mrp_no from mf_mo where mo_no=A.mo_no))KND,\n" +
            "sum(isnull(A.cst,0))CST\n" +
            "from tf_ml A where A.mlid='ML' and \n" +
            "A.mo_no in (SELECT mo_no FROM MF_MO WHERE FIN_DD<=#{a4} and isnull(qty_fin,0)=0) and A.mo_no not in (select mo_no from mf_mo where mo_dd<#{a3})\n" +
            "group by A.mo_no")
    void x80(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_B4\n" +
            "SET\n" +
            "DWCB=(SELECT SUM(CST) FROM A_B4 WHERE YY=#{a1} AND MM=#{a2} AND MRP_NO=A.MRP_NO GROUP BY MRP_NO)\n" +
            "/(SELECT SUM(QTY) FROM A_CB6 WHERE YY=#{a1} AND MM=#{a2} AND MO_NO NOT IN (SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3})AND PRD_NO IN (SELECT MRP_NO FROM A_B4 WHERE YY=#{a1} AND MM=#{a2}) AND PRD_NO=A.MRP_NO GROUP BY PRD_NO)\n" +
            "FROM A_B4 A WHERE YY=#{a1} AND MM=#{a2}")
    Integer x81(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("UPDATE A_CB6\n" +
            "SET QTFY = (SELECT TOP 1 DWCB FROM A_B4 WHERE YY= #{a1} AND MM=#{a2} " +
            "AND isnull(dwcb,0)!=0 AND MRP_NO=A.PRD_NO)*A.QTY\n" +
            "FROM A_CB6 A \n" +
            "WHERE A.YY=#{a1} AND A.MM=#{a2} \n" +
            "AND MO_NO NOT IN (SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3})\n" +
            "AND PRD_NO IN (SELECT MRP_NO FROM A_B4 WHERE YY=#{a1} AND MM=#{a2}) ")
    Integer x82(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_CB6\n" +
            "SET\n" +
            "QTFY=ISNULL(QTFY,0)+((SELECT SUM(CST) FROM A_B4 WHERE YY=#{a1} AND MM=#{a2} AND DWCB IS NULL)/(SELECT SUM(QTY) FROM A_CB6 WHERE YY=#{a1} AND MM=#{a2} AND MO_NO NOT IN (SELECT MO_NO FROM MF_MO WHERE MO_DD<#{a3}))*A.QTY)\n" +
            "FROM A_CB6 A WHERE A.YY=#{a1} AND A.MM=#{a2} \n" +
            "AND A.mo_no NOT IN (SELECT mo_no FROM MF_MO WHERE MO_DD<#{a3})")
    Integer x83(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Select("select A.MLID,A.TZ_NO,(select mo_no from mf_tz where tz_no=A.tz_no)MO_NO,\n" +
            "(SELECT MRP_NO FROM MF_MO WHERE MO_NO=(select mo_no from mf_tz where tz_no=A.tz_no))MRP_NO,\n" +
            "(SELECT QTY FROM MF_MO WHERE MO_NO=(select mo_no from mf_tz where tz_no=A.tz_no))MRP_BQTY,\n" +
            "(select FIN_DD from mf_mo where mo_no=(select mo_no from mf_tz where tz_no=A.tz_no))MO_FIN,\n" +
            "A.PRD_NO,(select knd from prdt where prd_no=A.prd_no)KND,\n" +
            "A.EST_ITM,(select qty from tf_tz where tz_no=A.tz_no and itm=A.est_itm)YL_QTY\n" +
            "INTO A_A2_A\n" +
            "from tf_ml A \n" +
            "where A.ml_dd>=#{a3} and A.ml_dd<=#{a4} and (tz_no is not null and tz_no !='') and A.mlid!='M4' \n" +
            "group by A.MLID,A.TZ_NO,A.PRD_NO,A.EST_ITM")
    void x84(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Delete("delete from A_A2_A where exists (select 1 from A_A2 WHERE A_A2_A.MLID=A_A2.MLID AND A_A2_A.TZ_NO=A_A2.TZ_NO AND A_A2_A.PRD_NO=A_A2.PRD_NO AND A_A2_A.EST_ITM=A_A2.EST_ITM)")
    Integer x85(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_A2(MLID,TZ_NO,MO_NO,MRP_NO,MRP_QTY,MO_FIN,PRD_NO,KND,EST_ITM,YL_QTY)\n" +
            "SELECT * FROM A_A2_A ")
    void x86(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET MM_BQTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_MM0 WHERE MO_NO=A.MO_NO AND MM_DD>=#{a3} AND MM_DD<=#{a4}),\n" +
            "BQTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_ML WHERE ml_dd>=#{a3} and ml_dd<=#{a4} and (tz_no is not null and tz_no !='') and A.mlid!='M4' AND MLID=A.MLID AND TZ_NO=A.TZ_NO AND PRD_NO=A.PRD_NO AND EST_ITM=A.EST_ITM group by MLID,TZ_NO,PRD_NO,EST_ITM),\n" +
            "BCST=(SELECT SUM(ISNULL(CST,0)) FROM TF_ML WHERE ml_dd>=#{a3} and ml_dd<=#{a4} and (tz_no is not null and tz_no !='') and A.mlid!='M4' AND MLID=A.MLID AND TZ_NO=A.TZ_NO AND PRD_NO=A.PRD_NO AND EST_ITM=A.EST_ITM group by MLID,TZ_NO,PRD_NO,EST_ITM)\n" +
            "FROM A_A2 A WHERE (A.tz_no is not null and A.tz_no !='') and A.mlid!='M4'")
    Integer x87(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Select("select A.MLID,''TZ_NO,A.MO_NO,\n" +
            "(SELECT MRP_NO FROM MF_MO WHERE MO_NO=A.MO_NO)MRP_NO,\n" +
            "(SELECT ISNULL(QTY,0) FROM MF_MO WHERE MO_NO=A.MO_NO)MRP_QTY,\n" +
            "(select FIN_DD from mf_mo where mo_no=A.MO_NO)MO_FIN,\n" +
            "A.PRD_NO,(select knd from prdt where prd_no=A.prd_no)KND,A.EST_ITM," +
            "(select QTY_RSV from tf_mo where mo_no=A.mo_no and itm=A.est_itm)YL_QTY\n" +
            "INTO A_A2_B\n" +
            "from tf_ml A \n" +
            "where A.ml_dd>=#{a3} and A.ml_dd<=#{a4} and (tz_no is null or tz_no ='' or A.mlid='M4') \n" +
            "group by A.MLID,A.MO_NO,A.PRD_NO,A.EST_ITM")
    void x88(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Delete("delete from A_A2_B where exists (select 1 from A_A2 WHERE A_A2_B.MLID=A_A2.MLID AND A_A2_B.MO_NO=A_A2.MO_NO AND A_A2_B.PRD_NO=A_A2.PRD_NO AND A_A2_B.EST_ITM=A_A2.EST_ITM)")
    Integer x89(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_A2(MLID,TZ_NO,MO_NO,MRP_NO,MRP_QTY,MO_FIN,PRD_NO,KND,EST_ITM,YL_QTY)\n" +
            "SELECT * FROM A_A2_B")
    void x90(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A2\n" +
            "SET\n" +
            "MM_BQTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_MM0 WHERE MO_NO=A.MO_NO AND MM_DD>=#{a3} AND MM_DD<=#{a4}),\n" +
            "BQTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_ML WHERE ml_dd>=#{a3} and ml_dd<=#{a4} and (tz_no is null or tz_no ='' or A.mlid='M4')\n" +
            "AND MLID=A.MLID AND MO_NO=A.MO_NO AND PRD_NO=A.PRD_NO AND EST_ITM=A.EST_ITM group by MLID,MO_NO,PRD_NO,EST_ITM),\n" +
            "BCST=(SELECT SUM(ISNULL(CST,0)) FROM TF_ML WHERE ml_dd>=#{a3} and ml_dd<=#{a4} and (tz_no is null or tz_no ='' or A.mlid='M4')\n" +
            "AND MLID=A.MLID AND MO_NO=A.MO_NO AND PRD_NO=A.PRD_NO AND EST_ITM=A.EST_ITM group by MLID,MO_NO,PRD_NO,EST_ITM)\n" +
            "FROM A_A2 A WHERE A.tz_no is null or A.tz_no ='' or A.mlid='M4'")
    Integer x91(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("drop table A_A2_A")
    void x92(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("drop table A_A2_B")
    void x93(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_A2\n" +
            "set bcst=0\n" +
            "from A_A2 where knd!='4'")
    Integer x94(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(-(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0)))\n" +
            "from A_A2 WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND  MLID='M2'")
    Integer x95(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)<=(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)<=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x96(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MRP_QTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)<=(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)>(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x97(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)>(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)<=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x98(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=(ISNULL(ZCST,0)-ISNULL(YTCST,0)+ISNULL(BCST,0))/(ISNULL(MRP_QTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))\n" +
            "FROM A_A2 \n" +
            "WHERE (ISNULL(MM_ZQTY,0)-ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0))!=0 \n" +
            "AND TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND ISNULL(YL_QTY,0)>(ISNULL(YTQTY,0)+ISNULL(BQTY,0))\n" +
            "AND ISNULL(MRP_QTY,0)>(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0))")
    Integer x99(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_CB6\n" +
            "SET CLFY=((SELECT SUM(isnull(B_DWCB,0)) FROM A_A2 WHERE KND='4' AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY)\n" +
            "FROM A_CB6 A WHERE A.YY=#{a1} AND A.MM=#{a2}")
    Integer x100(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_A3(MO_NO,PRD_NO,MO_QTY)\n" +
            "select A.MO_NO,A.PRD_NO,(SELECT QTY FROM MF_MO WHERE MO_NO=A.MO_NO)MO_QTY from tf_tb A\n" +
            "where A.tb_no in (select tb_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4}) AND A.MO_NO NOT IN(SELECT MO_NO FROM A_A3)\n" +
            "GROUP BY A.MO_NO,A.PRD_NO")
    void x101(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "BMM_QTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_MM0 WHERE  MM_DD>=#{a3} AND MM_DD<=#{a4} AND MO_NO=A.MO_NO),\n" +
            "B_QTY=(SELECT SUM(ISNULL(QTY,0)) FROM TF_TB WHERE tb_no in (select tb_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND MO_NO=A.MO_NO AND PRD_NO=A.PRD_NO GROUP BY MO_NO,PRD_NO),\n" +
            "B_AMT=(SELECT SUM(ISNULL(AMT,0)) FROM TF_TB WHERE tb_no in (select tb_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND MO_NO=A.MO_NO AND PRD_NO=A.PRD_NO GROUP BY MO_NO,PRD_NO)\n" +
            "FROM A_A3 A")
    Integer x102(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "B_DWCB= (((isnull(Z_AMT,0)-isnull(Y_AMT,0)+isnull(B_AMT,0))/(isnull(ZMM_QTY,0)-isnull(YMM_QTY,0)+isnull(BMM_QTY,0)))) \n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))>=(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))\n" +
            "AND (isnull(ZMM_QTY,0)-isnull(YMM_QTY,0)+isnull(BMM_QTY,0))!=0")
    Integer x103(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "B_DWCB= (((isnull(Z_AMT,0)-isnull(Y_AMT,0)+isnull(B_AMT,0))/(isnull(Z_QTY,0)-isnull(Y_QTY,0)+isnull(B_QTY,0)))) \n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))<(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))\n" +
            "AND (isnull(Z_QTY,0)-isnull(Y_QTY,0)+isnull(B_QTY,0))!=0")
    Integer x104(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB6\n" +
            "set tgfy=(select isnull(b_dwcb,0) from A_A3 where mo_no=A.mo_no)*A.qty\n" +
            "from a_cb6 A where A.yy=#{a1} and A.mm=#{a2}")
    Integer x105(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_CB6\n" +
            "SET ZCB=(ISNULL(A.CLFY,0)+ISNULL(A.TGFY,0)+ISNULL(A.ZZFY,0)+ISNULL(A.RGFY,0))+isnull(A.QTFY,0)\n" +
            "from A_CB6 A \n" +
            "where A.YY=#{a1} AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' \n" +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD<=#{a4})\n")
    Integer x106(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    @Update("UPDATE A_A2\n" +
            "SET B_DWCB=\n" +
            "(SELECT SUM(A.ZCB)/SUM(A.QTY) from A_CB6 A where A.YY=#{a1} " +
            "AND A.MM='4' AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3'" +
            " AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} " +
            "AND MO_DD<=#{a4}) AND A.PRD_NO=B.PRD_NO GROUP BY A.PRD_NO)\n" +
            "FROM A_A2 B WHERE B.PRD_NO IN (SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1}" +
            " AND A.MM='4' AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' " +
            "AND A.MO_NO IN (SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} " +
            "AND MO_DD<=#{a4}) GROUP BY A.PRD_NO)\n")
    Integer x107(@Param("a1") String a1, @Param("a2") String a2,
                 @Param("a3") String a3, @Param("a4") String a4);

    @Update("UPDATE A_A2\n" +
            "SET BCST=ISNULL(B_DWCB,0)*BQTY\n" +
            "FROM A_A2 B WHERE B.PRD_NO IN (SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} " +
            "AND A.MM=#{a2} AND (SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' AND A.MO_NO IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) GROUP BY A.PRD_NO)")
    Integer x108(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);

    @Update("update A_CB6\n" +
            "SET CLFY=(SELECT SUM(ISNULL(B_DWCB,0)) FROM A_A2 WHERE PRD_NO IN" +
            "(SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} AND A.MM=#{a2} AND " +
            "(SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' AND A.MO_NO IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} AND MO_DD<=#{a4}) GROUP BY A.PRD_NO)" +
            " AND MO_NO=A.MO_NO GROUP BY MO_NO)*A.QTY\n" +
            "FROM A_CB6 A WHERE A.MO_NO IN (SELECT MO_NO FROM A_A2 WHERE PRD_NO IN" +
            "(SELECT A.PRD_NO from A_CB6 A where A.YY=#{a1} AND A.MM=#{a2} AND " +
            "(SELECT KND FROM PRDT WHERE PRD_NO=A.PRD_NO)='3' AND A.MO_NO IN " +
            "(SELECT MO_NO FROM MF_MO WHERE MO_DD>=#{a3} " +
            "AND MO_DD<=#{a4}) GROUP BY A.PRD_NO) GROUP BY MO_NO)")
    Integer x109(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("update A_cb6\n" +
            "set ZCB=(ISNULL(A.CLFY,0)+ISNULL(A.TGFY,0)+ISNULL(A.ZZFY,0)+ISNULL(A.RGFY,0))+ISNULL(QTFY,0)\n" +
            "from A_cb6 A \n" +
            "where A.yy=#{a1} and A.mm=#{a2} and A.mo_no in " +
            "(select mo_no from mf_mo where mo_dd<=#{a4})")
    Integer x110(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Insert("insert into A_B2 SELECT #{a1},#{a2},* FROM A_A2")
    void x111(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Insert("insert into A_B3 SELECT #{a1},#{a2},* FROM A_A3")
    void x112(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A2\n" +
            "SET\n" +
            "ZQTY=(ISNULL(ZQTY,0)+ISNULL(BQTY,0)),\n" +
            "MM_ZQTY=(ISNULL(MM_ZQTY,0)+ISNULL(MM_BQTY,0)) \n" +
            "FROM A_A2 WHERE MLID!='M2'")
    Integer x113(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Update("UPDATE A_A2\n" +
            "SET\n" +
            "MM_YTQTY=(ISNULL(MM_YTQTY,0)+ISNULL(MM_BQTY,0)) \n" +
            "FROM A_A2 \n" +
            "WHERE TZ_NO IN (SELECT TZ_NO FROM TF_ML WHERE ML_DD>=#{a3} AND ML_DD<=#{a4})\n" +
            "AND MLID!='M2'")
    Integer x114(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Update("UPDATE A_A2\n" +
            "SET \n" +
            "MM_BQTY=0,\n" +
            "BQTY=0,\n" +
            "BCST=0,\n" +
            "B_DWCB=0,\n" +
            "CY=0\n" +
            "FROM A_A2")
    Integer x115(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "ZMM_QTY=ISNULL(ZMM_QTY,0)+ ISNULL(BMM_QTY,0),\n" +
            "Z_QTY=ISNULL(Z_QTY,0)+ISNULL(B_QTY,0),\n" +
            "YMM_QTY=ISNULL(YMM_QTY,0)+ISNULL(BMM_QTY,0),\n" +
            "Y_QTY=ISNULL(Y_QTY,0)+ISNULL(B_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))>=(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x116(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "ZMM_QTY=ISNULL(ZMM_QTY,0)+ ISNULL(BMM_QTY,0),\n" +
            "Z_QTY=ISNULL(Z_QTY,0)+ISNULL(B_QTY,0),\n" +
            "YMM_QTY=ISNULL(YMM_QTY,0)+ISNULL(BMM_QTY,0),\n" +
            "Y_QTY=ISNULL(Y_QTY,0)+ISNULL(BMM_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})\n" +
            "AND (ISNULL(ZMM_QTY,0)+ISNULL(BMM_QTY,0)-ISNULL(YMM_QTY,0))<(ISNULL(Z_QTY,0)+ISNULL(B_QTY,0)-ISNULL(Y_QTY,0))")
    Integer x117(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "Z_AMT=ISNULL(Z_AMT,0)+ISNULL(B_AMT,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})")
    Integer x118(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_A3\n" +
            "SET\n" +
            "Y_AMT=ISNULL(Z_AMT,0)-ISNULL(B_DWCB,0)*ISNULL(BMM_QTY,0)\n" +
            "FROM A_A3 WHERE  mo_no in (select mo_no from mf_tb where tb_dd>=#{a3} and tb_dd<=#{a4})")
    Integer x119(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);



    @Update("UPDATE A_A3\n" +
            "SET \n" +
            "BMM_QTY=0,\n" +
            "B_QTY=0,\n" +
            "B_AMT=0,\n" +
            "B_DWCB=0\n" +
            "FROM A_A3")
    Integer x120(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);


    @Update("UPDATE A_CB2\n" +
            "SET \n" +
            "DWCB=(SELECT SUM(ISNULL(ZCB,0))/SUM(ISNULL(QTY,0)) FROM A_CB6 WHERE PRD_NO=A.PRD_NO GROUP BY PRD_NO)\n" +
            "FROM A_CB2 A WHERE A.YY=#{a1} AND A.MM=#{a2}")
    Integer x121(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4);





/**
 *a1 就是2016
 * a2就是 1
 * a3就是 2016-01-01
 * a4 就是 2016-01-31
 * */


/**
 *a1 就是2016
 * a2就是 2
 * a3就是 2016-02-01
 * a4 就是 2016-02-29
 * */


/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
}
