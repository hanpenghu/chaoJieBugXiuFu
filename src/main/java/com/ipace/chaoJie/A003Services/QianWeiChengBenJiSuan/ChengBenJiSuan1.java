package com.ipace.chaoJie.A003Services.QianWeiChengBenJiSuan;
import com.ipace.chaoJie.A000Component.Cnst;
import com.ipace.chaoJie.utils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChengBenJiSuan1 {
    @Autowired
    private Cnst cnst;

    /**
     *钱伟清除数据
     * */
    public void qingLiShuJu(){

            p.p(p.gp().sad(p.dexhx).sad("清除数据开始").sad(p.dexhx).gad());

        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju1();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju1 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju2();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju2 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju3();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju3 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju4();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju4 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju5();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju5 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju6();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju6 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju7();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju7 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju8();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju8 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju9();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju9 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju10();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju10 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju11();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju11 error");
        }
        try {
            cnst.a001TongYongMapper.qinWei_QingChuShuju12();
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qinWei_QingChuShuju12 error");
        }

            p.p(p.gp().sad(p.dexhx).sad("清除数据结束").sad(p.dexhx).gad());
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    public void qianWeiQ20180119(String a1,String a2,String a3,String a4)  {

            p.p(p.gp().sad(p.dexhx).sad("Q20180119开始").sad(p.dexhx).gad());
        try {
            Integer  i= cnst.a001TongYongMapper.x1(a1,a2);
        } catch (Exception e) {
            e.printStackTrace();
             e.printStackTrace();
            p.p("qianWeiQ20180119 x1 error");
        }

        
        try {
            cnst.a001TongYongMapper.x2();
        } catch (Exception e) {
            e.printStackTrace();
             e.printStackTrace();
            p.p("qianWeiQ20180119 x2 error");
        }

        
        try {
           cnst.a001TongYongMapper.x3(a3);
        } catch (Exception e) {
            e.printStackTrace();
             e.printStackTrace();
            p.p("qianWeiQ20180119 x3 error");
        }
        
        try {
           cnst.a001TongYongMapper.x4(a3,a4);
        } catch (Exception e) {
            e.printStackTrace();
             e.printStackTrace();
            p.p("qianWeiQ20180119 x4 error");
        }
        
        try {
            cnst.a001TongYongMapper.x5();
        } catch (Exception e) {
            e.printStackTrace();
             e.printStackTrace();
            p.p("qianWeiQ20180119 x5 error");
        }
        
        try {
           cnst.a001TongYongMapper.x6(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x6 error");
        }

        

        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            Integer iiiii=cnst.a001TongYongMapper.x7(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x7 error");
        }

        
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            Integer iiiiii=cnst.a001TongYongMapper.x8(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x8 error");
        }
        

        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            Integer iiiiii=cnst.a001TongYongMapper.x9(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x9 error");
        }

        

        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            Integer iiiiii=cnst.a001TongYongMapper.x10(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x10 error");
        }
        
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            Integer iiiiii=cnst.a001TongYongMapper.x11(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x11 error");
        }
        

        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            //新建表
            cnst.a001TongYongMapper.x12(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x12 error");
        }

        


        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {

            cnst.a001TongYongMapper.x13(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x13 error");
        }

        
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {

            Integer ik= cnst.a001TongYongMapper.x14(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x14 error");
        }


        
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {

            Integer ik= cnst.a001TongYongMapper.x15(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x15 error");
        }
        
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {
            //新建表
            cnst.a001TongYongMapper.x16(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x16 error");
        }
        

        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */
        try {

           cnst.a001TongYongMapper.x17(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x17 error");
        }

        
        try {

            Integer ik1=cnst.a001TongYongMapper.x18(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x18 error");
        }

        
        try {

            Integer ik1=cnst.a001TongYongMapper.x19(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x19 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x20(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x20 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x21(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x21 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x22(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x22 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x23(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x23 error");
        }
        
        try {
            //新建表
            cnst.a001TongYongMapper.x24(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x24 error");
        }
        
        try {

            cnst.a001TongYongMapper.x25(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x25 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x26(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x26 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x27(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x27 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x28(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x28 error");
        }
        
        try {

            cnst.a001TongYongMapper.x29(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x29 error");
        }
        
        try {

            cnst.a001TongYongMapper.x30(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x30 error");
        }
        
        try {

            cnst.a001TongYongMapper.x31(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x31 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x32(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x32 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x33(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x33 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x34(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x34 error");
        }
        

        try {

            Integer ik1=cnst.a001TongYongMapper.x35(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x35 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x36(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x36 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x37(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x37 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x38(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x38 error");
        }
        
        try {

            cnst.a001TongYongMapper.x39(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x39 error  create tab");
        }
        
        try {

            cnst.a001TongYongMapper.x40(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x40 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x41(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x41 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x42(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x42 error");
        }

        
        try {

            Integer ik1=cnst.a001TongYongMapper.x43(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x43 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x44(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x44 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x45(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x45 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x46(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x46 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x47(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x47 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x48(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x48 error");
        }

        try {

            cnst.a001TongYongMapper.x49(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x49 error create tab");
        }
        try {

            cnst.a001TongYongMapper.x50(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x50 error");
        }
        try {

            cnst.a001TongYongMapper.x51(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x51 error create tab");
        }

        try {

            cnst.a001TongYongMapper.x52(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x52 error ");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x53(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x53 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x54(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x54 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x55(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x55 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x56(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x56 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x57(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x57 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x58(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x58 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x59(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x59 error");
        }
        
        try {

            Integer ik1=cnst.a001TongYongMapper.x60(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x60 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x61(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x61 error");
        }
        

            p.p(p.gp().sad(p.dexhx).sad("Q20180119结束").sad(p.dexhx).gad());
        /**
         *a1 就是2016
         * a2就是 1
         * a3就是 2016-01-01
         * a4 就是 2016-01-31
         * */

    }





    /**
     *a1 就是2016
     * a2就是 2
     * a3就是 2016-02-01
     * a4 就是 2016-02-29
     * */
    public void qianWeiQ20180123(String a1,String a2,String a3,String a4)  {

            p.p(p.gp().sad(p.dexhx).sad("Q20180123开始").sad(p.dexhx).gad());
        try {

           cnst.a001TongYongMapper.x62(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x62 error");
        }
        
        try {

            cnst.a001TongYongMapper.x63(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x63 error");
        }
        
        try {

            cnst.a001TongYongMapper.x64(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x64 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x65(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x65 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x66(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x66 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x67(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x67 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x68(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x68 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x69(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x69 error");
        }

        try {

            cnst.a001TongYongMapper.x70(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x70 error");
        }


        try {

            Integer ik1=cnst.a001TongYongMapper.x71(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x71 error");
        }


        try {

            Integer ik1=cnst.a001TongYongMapper.x72(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x72 error");
        }

        try {

           cnst.a001TongYongMapper.x73(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x73 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x74(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x74 error");
        }


        try {

            Integer ik1=cnst.a001TongYongMapper.x75(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x75 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x76(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x76 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x77(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x77 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x78(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x78 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x79(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x79 error");
        }

        try {

            cnst.a001TongYongMapper.x80(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x80 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x81(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x81 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x82(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x82 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x83(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x83 error");
        }

        try {

            cnst.a001TongYongMapper.x84(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x84 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x85(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x85 error");
        }

        try {

            cnst.a001TongYongMapper.x86(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x86 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x87(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x87 error");
        }

        try {

            cnst.a001TongYongMapper.x88(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x88 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x89(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x89 error");
        }
        try {

           cnst.a001TongYongMapper.x90(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x90 error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x91(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x91 error");
        }

        try {

            cnst.a001TongYongMapper.x92(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 2 error table create");
        }

        try {

            cnst.a001TongYongMapper.x93(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x93  create table error");
        }

        try {

            Integer ik1=cnst.a001TongYongMapper.x94(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x94  error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x95(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x95 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x96(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x96 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x97(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x97 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x98(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x98 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x99(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x99 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x100(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x100 error");
        }
        try {

            cnst.a001TongYongMapper.x101(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x101 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x102(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x102 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x103(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x103 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x104(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x104 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x105(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x105 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x106(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x106 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x107(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x107 error");
        }
        try {

            Integer ik1=cnst.a001TongYongMapper.x108(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x108 error");
        }

        try {
            Integer ik1=cnst.a001TongYongMapper.x109(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x109 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x110(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x110 error");
        }
        try {
            cnst.a001TongYongMapper.x111(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x111 error");
        }
        try {
            cnst.a001TongYongMapper.x112(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x112 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x113(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x113 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x114(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x114 error");
        }

        try {
            Integer ik1=cnst.a001TongYongMapper.x115(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x115 error");
        }

        try {
            Integer ik1=cnst.a001TongYongMapper.x116(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x116 error");
        }

        try {
            Integer ik1=cnst.a001TongYongMapper.x117(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x117 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x118(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x118 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x119(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x119 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x120(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x120 error");
        }
        try {
            Integer ik1=cnst.a001TongYongMapper.x121(a1,a2,a3,a4);
        } catch (Exception e) {
             e.printStackTrace();
            p.p("qianWeiQ20180119 x121 error");
        }

            p.p(p.gp().sad(p.dexhx).sad("Q20180123结束").sad(p.dexhx).gad());

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
