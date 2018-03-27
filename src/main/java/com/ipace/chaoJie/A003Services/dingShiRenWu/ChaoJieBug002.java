package com.ipace.chaoJie.A003Services.dingShiRenWu;

import com.alibaba.fastjson.JSON;
import com.ipace.chaoJie.A004Dto.*;
import com.ipace.chaoJie.hanhan.p;
import com.ipace.chaoJie.hanhan.stra;
import com.ipace.chaoJie.utils.MakeColumnNull0False;
import com.ipace.chaoJie.utils.NotEmpty;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("chaoJieBug002")
@Transactional
public class ChaoJieBug002 {
    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    private final String 调拨单入货库位 = "A0003";//wh2
    private String 调拨单出货库位 = "";//wh1
    public final static long time1 = 2 * 60 * 1000;
//    public final static String time2="0 0 13 * * ?";//每天13点开始运行

    @Autowired
    private C c;

/*
    @Scheduled(fixedDelay = 2 * 60 * 1000)
    @Transactional
    public void f() {
        Date date1 = new Date();
        long time1 = date1.getTime();
        System.out.println("~~~~~~~~~~~~" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1) + "~~~~~~~~~~~~超杰借出单转调拨单开始~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            this.bln2Ic_借出单转调拨单();
        } catch (Exception e) {
            e.printStackTrace();
            l.error(e.getMessage(),e);
            p.throwE(e);
        }
        Date date2 = new Date();
        long time2 = date2.getTime();
        System.out.println("~~~~~~~~~~~~" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2) + "~~~~~~~~~~~~超杰借出单转调拨单结束~~~~~~~耗时" + (time2 - time1) / 1000 + "~秒~~~~~~相当于" + (time2 - time1) / 1000 / 60 + "~分钟~~~~~~~~~");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void bln2Ic_借出单转调拨单() {
        List<MfBln> ruKouDeFuHeTiaoJianDeMfBlnList01 =
                this.getRuKouDeFuHeTiaoJianDeMfBlnList01();


        List<TfBlnListObjOfSameBlNo> fuHeTiaoJianFenLeiHouDeDeTfBlnList02 =
                this.get符合条件并根据BlNo分类过的TfBlnList02(ruKouDeFuHeTiaoJianDeMfBlnList01);


        this.chaRuMfIcAndTfIc(fuHeTiaoJianFenLeiHouDeDeTfBlnList02);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    public List<MfBln> getRuKouDeFuHeTiaoJianDeMfBlnList01() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~入口, 得到所有的符合条件的MfBln~~~开始~~~~~~~~~~~~~~~~~~~~~");
        List<MfBln> mfBln001 = c.a002ChaoJieBug002Mapper.getMfBln001();
        if (mfBln001 == null) mfBln001 = new ArrayList<>();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~入口, 得到所有的符合条件的MfBln~~~结束~~~~~~~~~~~~~~~~~~~~~");
        return mfBln001;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////

    *//**
     * 注意  得到了根据bl_no一样   分类后的list集合
     *//*
    @Transactional
    public List<TfBlnListObjOfSameBlNo> get符合条件并根据BlNo分类过的TfBlnList02(List<MfBln> mfBlnList) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~把入口得到的MfBln拿来得到一堆tfBln,并且按Blno相同分类好~~~开始~~~~~~~~~~~~~~~~~~~~~");
        List<TfBlnListObjOfSameBlNo> genJuTfBlnNoFenWanLeiDeList = new ArrayList<>();
        mfBlnList.forEach(mfBln -> {
            System.out.println(mfBln.getBlNo() + "！！！！！！！！！！！！！！！！！！！！！！！！");

            TfBlnExample tfBlnExample = new TfBlnExample();
            tfBlnExample.createCriteria().andBlNoEqualTo(mfBln.getBlNo()).andBlIdEqualTo("LN");
            List<TfBln> tfBlnList = c.tfBlnMapper.selectByExample(tfBlnExample);
            p.p("----------JSON.toJSONString(tfBlnList)---------------------------------------------");
            p.p(JSON.toJSONString(tfBlnList));
            p.p("-------------------------------------------------------");
            TfBlnListObjOfSameBlNo tfBlnListObjOfSameBlNo = new TfBlnListObjOfSameBlNo();
            tfBlnListObjOfSameBlNo.setSameTfBlnNoList(tfBlnList);
            genJuTfBlnNoFenWanLeiDeList.add(tfBlnListObjOfSameBlNo);
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~把入口得到的MfBln拿来得到一堆tfBln,并且按Blno相同分类好~~~结束~~~~~~~~~~~~~~~~~~~~~");
        p.p("-------------------------------------------------------");
        p.p("-----genJuTfBlnNoFenWanLeiDeList数量是" + genJuTfBlnNoFenWanLeiDeList.size() + "---------------");
        p.p("-------------------------------------------------------");

        return genJuTfBlnNoFenWanLeiDeList;
    }*/

    //////////////////////////////是开始产生调拨单//////////////////////////////////////////////////////////////////
   /* @Transactional
    public void chaRuMfIcAndTfIc(List<TfBlnListObjOfSameBlNo> genJuTfBlnNoFenWanLeiDeList) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~开始~~~~~~~~~~~~~~~~~~~~~");
        for (TfBlnListObjOfSameBlNo tfBlnListObjOfSameBlNo : genJuTfBlnNoFenWanLeiDeList) {
            List<TfBln> sameTfBlnNoList = tfBlnListObjOfSameBlNo.getSameTfBlnNoList();
            if (sameTfBlnNoList.size() > 0) {
                String blNo = sameTfBlnNoList.get(0).getBlNo();//该数组里面存的都是blNo一样的TfBlNo
                MfBln mfBln = this.getMfBlnListUseBlNo(blNo);
                try {
                    //这里用try是因为避免下次再插入的时候产生问题,因为表头mf只能插入一次
                    this.mfBlnToMfIcInsert(mfBln);//插入一条数据到Mf_Ic
                } catch (Exception e) {
//                    e.printStackTrace();
                    p.p("-------------------------------------------------------");
                    p.p("有可能是mfIc不能插入相同的单号了");
                    p.p("-------------------------------------------------------");

                }
                for (TfBln tfBln : sameTfBlnNoList) {//插入多条数据到tf_IC
                    this.tfBlnToTfIcInsert(tfBln);
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }*/

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void tfBlnToTfIcInsert(TfBln tfBln) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化tfbln为tfic并插入数据库~~~开始~~~~~~~~~~~~~~~~~~~~~");
        TfIc tfIc = new TfIc();
        tfIc.setIcId("IC");
        tfIc.setRem("借出单转入");
//        tfIc.setFixCst1("2");
//        tfIc.setFixCst("2");
        tfIc.setQty(tfBln.getQty());
        tfIc.setBatNo(tfBln.getBatNo());
        tfIc.setBatNo2(tfBln.getBatNo());
        tfIc.setPrdNo(tfBln.getPrdNo());
        tfIc.setIcNo("IC" + (tfBln.getBlNo() == null ? "" : tfBln.getBlNo()));
        tfIc.setIcDd(tfBln.getBlDd());
        tfIc.setItm(tfBln.getItm());
        tfIc.setPreItm(tfBln.getPreItm());
        tfIc.setKeyItm(tfBln.getItm());
        tfIc.setPrdName(tfBln.getPrdName());
        tfIc.setPrdMark(tfBln.getPrdMark());
        tfIc.setUnit(tfBln.getUnit());
        //wh1其实是出货库位
        tfIc.setWh1(tfBln.getWh());
        /**
         *产生的调拨单入货库位A0003是写死的
         * */
        //wh2是入货库位
        tfIc.setWh2(调拨单入货库位);
        tfIc.setCstStd(tfBln.getCst());
        tfIc.setCstStd(tfBln.getCstStd());
        tfIc.setUp(tfBln.getUp());
        tfIc.setUpStd(tfBln.getUpStd());
        tfIc.setValidDd(tfBln.getValidDd());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         *根据tfIc 的  wh1和货号和批号找到对应的多个bat_rec1_day
         * ,如果tfIc的qty大于多个bat_rec1_day的qty_out之和,
         * 那么就没有必要进行这个单子的转单了,因为拆行拆不完
         * 那么久接着另一个单子拆
         * */

        List<BatRec1Day> batRec1DayList =
                c.a002ChaoJieBug002Mapper
                        .getSamePrdNoBatNoWh_bat_rec1_day(tfIc);


        BigDecimal sumQtyOut=p.b(p.n0);
        for(BatRec1Day batRec1Day:batRec1DayList){
            sumQtyOut=sumQtyOut.add(p.bNull0(batRec1Day.getQtyOut()));
        }


        //此时拆行拆不完,不在进行下面步骤处理该单子,  继续处理下一个单子
        if(p.isFirstBigBigdecimal(tfIc.getQty(),sumQtyOut))return;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //入库日期要拆行
//        tfIc.setRkDd(tfBln.getRkDd());
        //匹配入库日期的时候拆行成多个了
        List<TfIc> tfIcList = this.根据批号和货号和库位的主拆行程序(tfIc);
        if (p.notEmpty(tfIcList)) {
            tfIcList.forEach(tfIc1 -> {
                List<TfIc> tfIcList002 = c.a002ChaoJieBug002Mapper.getItmOfLastOfTfIcOfICLN(tfIc1);

                if (tfIcList002.size() > 0) {
                    tfIc1.setItm(tfIcList002.get(0).getItm() + 1);
                } else {
                    tfIc1.setItm(1);
                }

                c.tfIcMapper.insert(tfIc1);
            });
        }else{
            //手动抛出异常
            //抛出异常,让程序回滚,因为前面可能已经将bat_rec1_day 或者bat_rec1动了库存了
            String sssss=stra.b()
                    .a("tfIc拆行,根据bat_rec1_day")
                    .a("里面的多个wh库存拆行一直无法拆完,")
                    .a("此时为了前面写到bat_rec1_day里面的数据能够回滚")
                    .a(",专门在这里抛出异常,让所有的数据都无法转单").g();
            l.error(sssss);
            p.throwE(sssss);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化tfbln为tfic并插入数据库~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }
////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 拆行,得到rk_dd
     */
    @Transactional
    public List<TfIc> 根据批号和货号和库位的主拆行程序(TfIc tfIc) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~对单独一个tfic拆行并找到对应的rk_dd,并拆分数量~~~~~开始~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        int count = c.a002ChaoJieBug002Mapper.getSamePrdNoBatNoWh_bat_rec1_dayCount(tfIc);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(count);
        List<TfIc> listTfIc = new ArrayList<>();
        //循环得到跟tfIC 的货号批号特征都一样的
        for (int i = 0; i < count; i++) {
            //得到批号 货号  仓库一样的//我用了top 1,所以,这个list里面其实最多只有一个
            //得到的条件是   BAT_REC1_DAY里面
//            ISNULL(QTY_IN,0)>0
//            AND ISNULL(QTY_IN,0)>ISNULL(QTY_OUT,0)
//            AND BAT_NO=#{batNo} AND PRD_NO=#{prdNo} AND WH=#{wh1}----wh2是入货库位,wh1是出货库位
            //有多个
            List<BatRec1Day> batRec1DayList =
                    c.a002ChaoJieBug002Mapper
                    .getSamePrdNoBatNoWh_bat_rec1_day(tfIc);

            if (p.notEmpty(batRec1DayList)) {
                //每次拿出入库日期最远的那个
                BatRec1Day batRec1Day = batRec1DayList.get(0);
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验删掉了分开加as的浪费~~~~~~~~~~~~~~~~~~~~~~~~");
//                System.out.println(batRec1Day.getQtyIn());
//                System.out.println(batRec1Day.getQtyOut());
//                System.out.println(batRec1Day.getBatNo());
//                System.out.println(batRec1Day.getPrdNo());
//                System.out.println(batRec1Day.getRkDd());
//                System.out.println(batRec1Day.getWh());
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验删掉了分开加as的浪费~~~~~~~~~~~~~~~~~~~~~~~~");

                //得到batRec1Day里面qtyin-qtyout
                BigDecimal qtyInOut =
                        (p.empty(batRec1Day.getQtyIn())?p.b(0):batRec1Day.getQtyIn())
                        .subtract(p.empty(batRec1Day.getQtyOut())? p.b(0): batRec1Day.getQtyOut());
                //得到调拨单表身的tfic的qty
                BigDecimal tfIcQty = p.empty(tfIc.getQty())?p.b(0):tfIc.getQty();
                //如果调拨单表身的qty大于batRec1Day里面的qtyinout的话
                if (tfIcQty.compareTo(qtyInOut) == 1) {//tfIcQty>qtyInOut
                    tfIc.setQty(tfIcQty.subtract(qtyInOut));//拆分后还剩余这么多用于下次拆分
                    //注意:tfIc是一个全局拆分对象(拆分数量,取数量和入库时间),所以此时搜集的是一个copy的tfIC对象(他使用的是qtyInOut)
                    this.当TfIc的Qty大于bat_rec1_day的Qty拆行收集多个ListTfIc
                            (listTfIc, tfIc, qtyInOut, batRec1Day.getRkDd());

                    //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
                    this.当TfIc的Qty大于bat_rec1_day的Qty_回写_bat_rec1_day和bat_rec1
                            (batRec1Day, qtyInOut);

                    //不要return,继续拆行


                    /**
                     *如果走到最后都是这种情况,那就回滚到原来,不再拆行,因为bat_rec1_day最终都不够拆
                     * */

                } else if (tfIcQty.compareTo(qtyInOut) == -1) {//tfIcQty<qtyInOut
                    //此时tfIc.setQty不用再设置了,因为这次就结束循环从而结束拆分了
                    //此时用tfIcQty自己的数量
                    this.tficQty小的时候搜集TfIc(listTfIc, tfIc, batRec1Day.getRkDd());

                    this.当TfIc的Qty小于bat_rec1_day的qty_回写_bat_rec1_day和bat_rec1(batRec1Day, tfIc);

                    return listTfIc;//return掉,不在拆行
                } else {//tfIcQty.compareTo(qtyInOut)==0此时tfIcQty==qtyInOut
                    //此时也不要再拆行了,
                    //此时用tfIcQty自己的数量
                    this.tficQty小的时候搜集TfIc(listTfIc, tfIc, batRec1Day.getRkDd());//这个小于的可以用于等于
                    //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
                    this.当TfIc的Qty大于bat_rec1_day的Qty_回写_bat_rec1_day和bat_rec1
                            (batRec1Day, qtyInOut);//这个大于的可以用于等于
                    return listTfIc;
                }


            } else {

                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("单号为:" + tfIc.getIcNo() +
                        "！批号为:" + tfIc.getBatNo() + "！货号为:" + tfIc.getPrdNo() + "特征为:" + tfIc.getPrdMark() +
                        "！itm为" + tfIc.getItm() + "的这条记录因为没有在表   bat_rec1_day  中匹配到相应的结果,而没有插入" +
                        "！原因极有可能是匹配到了,但是匹配的是qty_out=qty_in的结果(此时in的已经out完了)");
                System.out.println();
                System.out.println();
                System.out.println();
//                List<TfIc>listTfIc1=new ArrayList<>();
//                tfIc.setRem("借出单转入但没有在bat_rec1_day匹配到RK_DD");
//                listTfIc1.add(tfIc);
//                return listTfIc1;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
//        List<TfIc>listTfIc2=new ArrayList<>();
//        tfIc.setRem("借出单转入但没有在bat_rec1_day匹配到RK_DD");
//        listTfIc2.add(tfIc);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~对单独一个tfic拆行并找到对应的rk_dd,并拆分数量~~~~~结束~~~~~~~~~~~~~~~~~~~");
//        return listTfIc2;
        System.out.println("单号为:" + tfIc.getIcNo() +
                "！批号为:" + tfIc.getBatNo() + "！货号为:" + tfIc.getPrdNo() + "特征为:" + tfIc.getPrdMark() +
                "！itm为" + tfIc.getItm() + "的这条记录因为没有在表   bat_rec1_day  中匹配到相应的结果,而没有插入" +
                "！原因极有可能是匹配到了,但是匹配的是qty_out=qty_in的结果(此时in的已经out完了)");
        System.out.println();
        System.out.println();
        System.out.println();
        return null;

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void 当TfIc的Qty大于bat_rec1_day的Qty_回写_bat_rec1_day和bat_rec1
            (BatRec1Day batRec1Day, BigDecimal qtyInOut) {
        //不更新的字段全部设置为null
//        batRec1Day.setRem(null);
//        batRec1Day.setQtyOutUnsh(null);
//        batRec1Day.setProduDd(null);
//        batRec1Day.setLstOtd(null);
//        batRec1Day.setLockId(null);
//        batRec1Day.setValidDd(null);
//        batRec1Day.setQty1Out(null);
//        batRec1Day.setQty1OutUnsh(null);
//        batRec1Day.setQty1In(null);
//        batRec1Day.setQtyIn(null);//这个必须设置为0,否则,将来也会被更新
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout==qtyin~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
        BatRec1DayExample batRec1DayExample = new BatRec1DayExample();
        batRec1DayExample.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh())
                .andRkDdEqualTo(batRec1Day.getRkDd())
                .andPrdMarkEqualTo(batRec1Day.getPrdMark())
                .andDepEqualTo(batRec1Day.getDep());
        //Selective的意思是,如果是null的字段,不更新到数据库
//        BatRec1Day batRec1Day001 = new BatRec1Day();
//        BeanUtils.copyProperties(batRec1Day, batRec1Day001);//copy一个新的对象,不要动原来的对象
        //其实我们只要更新数量,所以其他的都还原成null,Selective会不更新null
//        batRec1Day001.setBatNo(null);
//        batRec1Day001.setPrdNo(null);//不更新的都要设置为null
//        batRec1Day001.setRkDd(null);
//        batRec1Day001.setQtyIn(null);
//        batRec1Day001.setWh(null);//注意,我们就是为了更新qty_out,所以out不能是null
        BigDecimal qtyOut11 = batRec1Day.getQtyOut();
        if (p.empty(qtyOut11)) qtyOut11 = p.b(0);

        BatRec1Day batRec1Day001 = new BatRec1Day();
        batRec1Day001.setQtyOut(qtyOut11.add(qtyInOut));//
        c.batRec1DayMapper.updateByExampleSelective(batRec1Day001, batRec1DayExample);
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout==qtyin~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");


        /**
         *给A0003 day库入库in,注意,找到符合的就更新,找不到就插入一条
         * */
        BatRec1DayExample batRec1DayExampleA003 = new BatRec1DayExample();
        batRec1DayExampleA003.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(调拨单入货库位)//A0003的那个库位
                .andRkDdEqualTo(batRec1Day.getRkDd());
//            .andPrdMarkEqualTo(batRec1Day.getPrdMark())
//            .andDepEqualTo(batRec1Day.getDep());

        List<BatRec1Day> A003库位对应的BatRec1DayList其实应该只有一个 =
                c.batRec1DayMapper.selectByExample(batRec1DayExampleA003);

        if (p.notEmpty(A003库位对应的BatRec1DayList其实应该只有一个)) {//非空就更新qty
            BatRec1Day batRec1DayA003 = A003库位对应的BatRec1DayList其实应该只有一个.get(0);
            BigDecimal qtyIn = batRec1DayA003.getQtyIn();
            if (p.empty(qtyIn)) qtyIn = p.b(0);


            BatRec1Day batRec1DayA004=new BatRec1Day();
            batRec1DayA004.setQtyIn(qtyIn.add(qtyInOut));//入货库位增加
            //其实我们只更新qtyIn字段,其他字段都要设置为null以免更新
//            batRec1DayA003 = this.Make没有用的字段为null(batRec1DayA003);
            c.batRec1DayMapper.updateByExampleSelective(batRec1DayA004, batRec1DayExampleA003);



        } else {//空的话就插入一条符合条件的记录
            BatRec1Day batRec1DayA00301 = new BatRec1Day();
            batRec1DayA00301.setBatNo(batRec1Day.getBatNo());
            batRec1DayA00301.setPrdNo(batRec1Day.getPrdNo());
            batRec1DayA00301.setWh(调拨单入货库位);
            batRec1DayA00301.setRkDd(batRec1Day.getRkDd());
            batRec1DayA00301.setQtyIn(qtyInOut);
            batRec1DayA00301.setDep(batRec1Day.getDep());
            batRec1DayA00301.setPrdMark(batRec1Day.getPrdMark());
            c.batRec1DayMapper.insert(batRec1DayA00301);
        }
/**
 *给带过来的出货库位的出库(无day库位)
 * */

        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout==qtyin~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //更新不带日期的仓库表
        BatRec1Example batRec1Example = new BatRec1Example();
        batRec1Example.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh());
//             .andPrdMarkEqualTo(batRec1Day.getPrdMark());


//        BeanUtils.copyProperties(batRec1Day001, batRec1001);//会把相同的字段复制过去
//        batRec1001.setQtyIn(null);//不更新这个,主要是更新qtyout,该qtyout属于累加型号
//        batRec1001.setQtyOut(null);//清空值,给下面用


        List<BatRec1> batRec1s = c.batRec1Mapper.selectByExample(batRec1Example);
        if (p.notEmpty(batRec1s)) {//当存在的时候更新qtyout
            BigDecimal qtyOut = batRec1s.get(0).getQtyOut();
            if (p.empty(qtyOut))qtyOut = p.b(0);

            if (p.empty(qtyInOut))qtyInOut = p.b(0);
//            BigDecimal qtyOut1 = batRec1Day.getQtyOut();
//            if (qtyOut1 == null) {
//                qtyOut1 = new BigDecimal(0);
//            }
//            batRec1001.setQtyOut(qtyOut1.add(qtyInOut));
            BatRec1 batRec1001 = new BatRec1();
            batRec1001.setQtyOut(qtyOut.add(qtyInOut));//只更新这一个字段

            c.batRec1Mapper.updateByExampleSelective(batRec1001, batRec1Example);
        }else{
            String ssss = stra.b()
                    .a("bat_rec1 里面qty_out数量加上qtyInOut的时候出现异常,有可能匹配不到对应bat_rec1,此时的")
                    .a("batRec1Day.getBatNo()=").a("《").a(batRec1Day.getBatNo()).a("》")
                    .a("batRec1Day.getPrdNo()=").a("《").a(batRec1Day.getPrdNo()).a("》")
                    .a("batRec1Day.getWh()=").a("《").a(batRec1Day.getWh()).a("》")
                    .g();
            l.error(ssss);
            p.throwE(ssss);

        }

/**
 *给无day 库位A0003进行in入库
 * */
        BatRec1Example batRec1Example01 = new BatRec1Example();
        batRec1Example01.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(调拨单入货库位);
        //正常情况下下面集合只有一个元素
        List<BatRec1> batRec1s1 = c.batRec1Mapper.selectByExample(batRec1Example01);
        if (NotEmpty.notEmpty(batRec1s1)) {//符合条件就更新其in
            BatRec1 batRec1 = batRec1s1.get(0);
            BigDecimal qtyIn = batRec1.getQtyIn();
            if (qtyIn == null) {
                qtyIn = new BigDecimal(0);
            }
//        batRec1= this.make非必要字段为null来避免更新(batRec1);
            batRec1 = new MakeColumnNull0False<BatRec1>().f(batRec1);
            batRec1.setBatNo(null);
            batRec1.setPrdNo(null);
            batRec1.setWh(null);
            batRec1.setPrdMark(null);
            batRec1.setQtyIn(qtyIn.add(qtyInOut));
            c.batRec1Mapper.updateByExampleSelective(batRec1, batRec1Example01);
        } else {//不存在就插入一条,
            BatRec1 batRec2 = new BatRec1();
            batRec2.setWh(调拨单入货库位);
            batRec2.setPrdNo(batRec1Day.getPrdNo());
            batRec2.setBatNo(batRec1Day.getBatNo());
            batRec2.setQtyIn(qtyInOut);
            c.batRec1Mapper.insertSelective(batRec2);
        }


        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout==qtyin~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public  void 当TfIc的Qty小于bat_rec1_day的qty_回写_bat_rec1_day和bat_rec1
            (BatRec1Day batRec1Day, TfIc tfIc) {
//        String batNo = batRec1Day.getBatNo();
//        String prdNo = batRec1Day.getPrdNo();
//        String wh = batRec1Day.getWh();
//        BigDecimal tfIcQty = tfIc.getQty()==null?new BigDecimal(0):tfIc.getQty();


        //不更新的字段全部设置为null
//        batRec1Day.setRem(null);
//        batRec1Day.setQtyOutUnsh(null);
//        batRec1Day.setProduDd(null);
//        batRec1Day.setLstOtd(null);
//        batRec1Day.setLockId(null);
//        batRec1Day.setValidDd(null);
//        batRec1Day.setQty1Out(null);
//        batRec1Day.setQty1OutUnsh(null);
//        batRec1Day.setQty1In(null);
//        batRec1Day.setQtyIn(null);//这个必须设置为0,否则,将来也会被更新
        /**
         *有day  明细出货  qtyout加
         * */
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout=qtyout+tfIC.qty~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
        BatRec1DayExample batRec1DayExample = new BatRec1DayExample();
        batRec1DayExample.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh())
                .andRkDdEqualTo(batRec1Day.getRkDd())
                .andPrdMarkEqualTo(batRec1Day.getPrdMark())
                .andDepEqualTo(batRec1Day.getDep());
        //Selective的意思是,如果是null的字段,不更新到数据库

//        BeanUtils.copyProperties(batRec1Day, batRec1Day001);//copy一个新的对象,不要动原来的对象
        //其实我们只要更新数量,所以其他的都还原成null,Selective会不更新null
//        batRec1Day001.setBatNo(null);
//        batRec1Day001.setPrdNo(null);//不更新的都要设置为null
//        batRec1Day001.setRkDd(null);
//        batRec1Day001.setQtyIn(null);
//        batRec1Day001.setWh(null);//注意,我们就是为了更新qty_out,所以out不能是null
        BatRec1Day batRec1Day001 = new BatRec1Day();
        BigDecimal qtyOut11 = batRec1Day.getQtyOut();
        if (p.empty(qtyOut11)) qtyOut11 = p.b(0);

        batRec1Day001.setQtyOut(qtyOut11.add(tfIc.getQty()));
        c.batRec1DayMapper.updateByExampleSelective(batRec1Day001, batRec1DayExample);

        /**
         *有day的A0003入货
         * */

        BatRec1DayExample batRec1DayExampleA003 = new BatRec1DayExample();
        batRec1DayExampleA003.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(调拨单入货库位)
                .andRkDdEqualTo(batRec1Day.getRkDd());
//                .andPrdMarkEqualTo(batRec1Day.getPrdMark())
//                .andDepEqualTo(batRec1Day.getDep());
        List<BatRec1Day> batRec1DayList = c.batRec1DayMapper.selectByExample(batRec1DayExampleA003);

        if (p.notEmpty(batRec1DayList)) {//此时更新qtyin
            BatRec1Day batRec1Day1 = batRec1DayList.get(0);
            BigDecimal qtyIn = batRec1Day1.getQtyIn();
            //将不更新的字段设置为null,其实我们只更新qtyin
//            batRec1Day1 = new MakeColumnNull0False<BatRec1Day>().f(batRec1Day1);
//            batRec1Day1.setBatNo(null);
//            batRec1Day1.setWh(null);
//            batRec1Day1.setDep(null);
//            batRec1Day1.setPrdNo(null);
//            batRec1Day1.setPrdMark(null);
//            batRec1Day1.setRkDd(null);
            BatRec1Day batRec1Day11=new BatRec1Day();
            batRec1Day11.setQtyIn(
                    (  p.empty(qtyIn)? p.b(0) : qtyIn  )
                            .add(   p.empty(tfIc.getQty())?p.b(0):tfIc.getQty()   )
            );
            c.batRec1DayMapper.updateByExampleSelective(batRec1Day11, batRec1DayExampleA003);
        } else {//此时插入整条记录
            BatRec1Day batRec1DayA00302 = new BatRec1Day();
            batRec1DayA00302.setBatNo(batRec1Day.getBatNo());
            batRec1DayA00302.setPrdNo(batRec1Day.getPrdNo());
            batRec1DayA00302.setWh(调拨单入货库位);
            batRec1DayA00302.setRkDd(batRec1Day.getRkDd());
            batRec1DayA00302.setQtyIn(tfIc.getQty());
            batRec1DayA00302.setDep(batRec1Day.getDep());
            c.batRec1DayMapper.insertSelective(batRec1DayA00302);
        }


        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout=qtyout+tfIC.qty~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");
/**
 *无day的 qty_out  减去tfIcQty
 * */
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout=qtyout+tfIC.qty~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //更新不带日期的仓库表
        //更新不带日期的仓库表
        BatRec1Example batRec1Example = new BatRec1Example();
        batRec1Example.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh());
//                .andPrdMarkEqualTo(batRec1Day.getPrdMark());

//        BeanUtils.copyProperties(batRec1Day001, batRec1001);//会把相同的字段复制过去

        List<BatRec1> batRec1s = c.batRec1Mapper.selectByExample(batRec1Example);
        if (p.notEmpty(batRec1s)) {
            BigDecimal qtyZeng = tfIc.getQty();
            BigDecimal qtyOut = batRec1s.get(0).getQtyOut();
            if (p.empty(qtyOut)) qtyOut = p.b(0);

            if (p.empty(qtyZeng))qtyZeng = p.b(0);

            BatRec1 batRec1001 = new BatRec1();
            batRec1001.setQtyOut(qtyOut.add(qtyZeng));//该对象只更新一个字段

            c.batRec1Mapper.updateByExampleSelective(batRec1001,batRec1Example);
        }else{
            String ssss = stra.b()
                    .a("bat_rec1 里面qty_out数量加上qtyInOut的时候出现异常,有可能匹配不到对应bat_rec1,此时的")
                    .a("batRec1Day.getBatNo()=").a("《").a(batRec1Day.getBatNo()).a("》")
                    .a("batRec1Day.getPrdNo()=").a("《").a(batRec1Day.getPrdNo()).a("》")
                    .a("batRec1Day.getWh()=").a("《").a(batRec1Day.getWh()).a("》")
                    .g();
            p.throwE(ssss);
            l.error(ssss);
        }




/**
 *无day的A0003入货
 * */


        BatRec1Example batRec1Example01 = new BatRec1Example();
        batRec1Example01.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(调拨单入货库位);
        //正常情况下下面集合只有一个元素
        List<BatRec1> batRec1s1 = c.batRec1Mapper.selectByExample(batRec1Example01);
        if (p.notEmpty(batRec1s1)) {//符合条件就更新其in
            BatRec1 batRec1 = batRec1s1.get(0);
            BigDecimal qtyIn = batRec1.getQtyIn();
            if (p.empty(qtyIn)) qtyIn = p.b(0);

//        batRec1= this.make非必要字段为null来避免更新(batRec1);
//            batRec1 = new MakeColumnNull0False<BatRec1>().f(batRec1);
//            batRec1.setBatNo(null);
//            batRec1.setPrdNo(null);
//            batRec1.setWh(null);
//            batRec1.setPrdMark(null);
            BatRec1 batRec11=new BatRec1();
            batRec11.setQtyIn(qtyIn.add  (   p.empty(tfIc.getQty())? p.b(0) : tfIc.getQty()  )   );
            c.batRec1Mapper.updateByExampleSelective(batRec11, batRec1Example01);
        } else {//不存在就插入一条,
            BatRec1 batRec2 = new BatRec1();
            batRec2.setWh(调拨单入货库位);
            batRec2.setPrdNo(batRec1Day.getPrdNo());
            batRec2.setBatNo(batRec1Day.getBatNo());
            batRec2.setQtyIn(tfIc.getQty());

            Integer i = c.a002ChaoJieBug002Mapper.insertBatRec1(
                    batRec1Day.getBatNo(),//bat_no
                    batRec1Day.getPrdNo(),//prd_no
                    调拨单入货库位,//wh
                    String.valueOf(tfIc.getQty())//qtyin
            );

//            batRec1Mapper.insert(batRec2);
        }


        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout=qtyout+tfIC.qty~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");


    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public void tficQty小的时候搜集TfIc(List<TfIc> listTfIc, TfIc tfIc, Date rk_DD) {
        System.out.println("~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的最后一个TfIc~~~~~~~~开始~~~~~~~~~~~~~~~·");
        //将得到的新的tfIc入集合
        TfIc tfIc001 = new TfIc();
        BeanUtils.copyProperties(tfIc, tfIc001);//
        tfIc001.setRkDd(rk_DD);
//        tfIc001.setQty(qtyInOut);因为比qtyInOut大,所以用自己的
        listTfIc.add(tfIc001);//使用copy过来的新的对象,避免下次循环的时候该对象变了
        System.out.println("~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的最后一个TfIc~~~~~~~~结束~~~~~~~~~~~~~~~·");

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Transactional
    public void 当TfIc的Qty大于bat_rec1_day的Qty拆行收集多个ListTfIc
    (List<TfIc> listTfIc, TfIc tfIc, BigDecimal qtyInOut, Date rkDd) {
        System.out.println("~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的TfIc~~~~~~~~开始~~~~~~~~~~~~~~~·");
        //将得到的新的tfIc入集合
        TfIc tfIc001 = new TfIc();
        BeanUtils.copyProperties(tfIc, tfIc001);//
        tfIc001.setRkDd(rkDd);
        tfIc001.setQty(qtyInOut);
        listTfIc.add(tfIc001);//使用copy过来的新的对象,避免下次循环的时候该对象变了
        System.out.println("~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的TfIc~~~~~~~~结束~~~~~~~~~~~~~~~·");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public  void mfBlnToMfIcInsert(MfBln mfBln) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化mfbln为mfic并插入数据库~~~开始~~~~~~~~~~~~~~~~~~~~~");
        MfIcWithBLOBs mfIcWithBLOBs = new MfIcWithBLOBs();
        mfIcWithBLOBs.setRem("借出单转入");
        mfIcWithBLOBs.setPrtSw("N");
        mfIcWithBLOBs.setFixCst("2");
        mfIcWithBLOBs.setFixCst1("2");
        mfIcWithBLOBs.setIcId("IC");
        mfIcWithBLOBs.setIcNo("IC" + (mfBln.getBlNo() == null ? "" : mfBln.getBlNo()));
        mfIcWithBLOBs.setUsr(mfBln.getUsr());
        mfIcWithBLOBs.setChkMan(mfBln.getChkMan());
        mfIcWithBLOBs.setClsDate(mfBln.getClsDate());
        mfIcWithBLOBs.setZyNo(mfBln.getBlNo());
        mfIcWithBLOBs.setGlNo(mfBln.getBlNo());
        mfIcWithBLOBs.setDep(mfBln.getDep());
        mfIcWithBLOBs.setSalNo(mfBln.getSalNo());
        mfIcWithBLOBs.setSysDate(new Date());//记录插入的时间
        mfIcWithBLOBs.setBatNo(mfBln.getBatNo());
        mfIcWithBLOBs.setIcDd(mfBln.getBlDd());
        mfIcWithBLOBs.setBilType(mfBln.getBilType());
        mfIcWithBLOBs.setCasNo(mfBln.getCasNo());
        mfIcWithBLOBs.setSendMth(mfBln.getSendMth());
        mfIcWithBLOBs.setClsId(mfBln.getClsId());
        c.mfIcMapper.insert(mfIcWithBLOBs);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化mfbln为mfic并插入数据库~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////
    @Transactional
    public MfBln getMfBlnListUseBlNo(String blNo) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~通过一个blno(来自tfbln)得到一个mfbln~~~开始~~~~~~~~~~~~~~~~~~~~~");
        MfBlnExample mfBlnExample = new MfBlnExample();
        mfBlnExample.createCriteria().andBlNoEqualTo(blNo);
        //正常来说,mfblns只有一个元素
        List<MfBln> mfBlns = c.mfBlnMapper.selectByExample(mfBlnExample);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~通过一个blno(来自tfbln)得到一个mfbln~~~结束~~~~~~~~~~~~~~~~~~~~~");
        return mfBlns.get(0);
    }


/////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////
  /*  @Transactional
    public class TfBlnListObjOfSameBlNo {
        List<TfBln> sameTfBlnNoList = new ArrayList<>();

        public List<TfBln> getSameTfBlnNoList() {
            return sameTfBlnNoList;
        }

        public TfBlnListObjOfSameBlNo setSameTfBlnNoList(List<TfBln> sameTfBlnNoList) {
            this.sameTfBlnNoList = sameTfBlnNoList;
            return this;
        }
    }
*/
    ////////////////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//       /* // BigDecimal是处理double精度问题的对象
//        BigDecimal b1 = new BigDecimal("10");
//        BigDecimal b2 = new BigDecimal("1");
//        BigDecimal b3 = new BigDecimal("1");
//        // 结果
//        BigDecimal result = null;
//        // 加
//        result = b1.add(b2);
//        System.out.println(result.doubleValue());
//        // 减
//        result = b1.subtract(b2);
//        System.out.println(result.doubleValue());
//        // 乘
//        result = b1.multiply(b2);
//        System.out.println(result.doubleValue());
//        // 除
//        result = b1.divide(b2);
//        System.out.println(result.doubleValue());
//        System.out.println(b1.compareTo(b2));
//        System.out.println(b2.compareTo(b1));
//        System.out.println(b2.compareTo(b2));
//        int i = b2.compareTo(b2);*/
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////////


    /*private BatRec1Day Make没有用的字段为null(BatRec1Day batRec1DayA003) {
//        private BigDecimal qtyIn;
//         batRec1DayA003.setQtyIn(null);
//         private BigDecimal qtyInUnsh;
        batRec1DayA003.setQtyInUnsh(null);
//         private BigDecimal qtyOut;
        batRec1DayA003.setQtyOut(null);
//         private BigDecimal qtyOutUnsh;
        batRec1DayA003.setQtyOutUnsh(null);
//         private BigDecimal qty1In;
        batRec1DayA003.setQty1In(null);
//         private BigDecimal qty1InUnsh;
        batRec1DayA003.setQty1InUnsh(null);
//         private BigDecimal qty1Out;
        batRec1DayA003.setQty1Out(null);
//         private BigDecimal qty1OutUnsh;
        batRec1DayA003.setQty1OutUnsh(null);
//         private Date validDd;
        batRec1DayA003.setValidDd(null);
//         private Date lstOtd;
        batRec1DayA003.setLstOtd(null);
//         private String lockId;
        batRec1DayA003.setLockId(null);
//         private Date produDd;
        batRec1DayA003.setProduDd(null);
//         private String rem;
        batRec1DayA003.setRem(null);
//         private String batNo;
        batRec1DayA003.setBatNo(null);
//         private String wh;
        batRec1DayA003.setWh(null);
//         private String dep;
        batRec1DayA003.setDep(null);
//         private String prdNo;
        batRec1DayA003.setPrdNo(null);
//         private String prdMark;
        batRec1DayA003.setPrdMark(null);
//         private Date rkDd;
        batRec1DayA003.setRkDd(null);
        return batRec1DayA003;
    }*/


//    private BatRec1 make非必要字段为null来避免更新(BatRec1 batRec1) {
//    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
