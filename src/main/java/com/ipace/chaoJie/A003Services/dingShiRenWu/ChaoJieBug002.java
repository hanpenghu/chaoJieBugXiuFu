package com.ipace.chaoJie.A003Services.dingShiRenWu;
import com.ipace.chaoJie.A002Dao.*;
import com.ipace.chaoJie.A004Dto.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("chaoJieBug002")
@Transactional
public class ChaoJieBug002 {
    public final static long time1 = 2*60*1000;
    public final static String time2="0 0 13 * * ?";//每天13点开始运行

    @Autowired
    private MfIcMapper mfIcMapper;
    @Autowired
    private A002ChaoJieBug002Mapper a002ChaoJieBug002Mapper;
    @Autowired
    private TfBlnMapper tfBlnMapper;
    @Autowired
    private MfBlnMapper mfBlnMapper;

    @Autowired
    private TfIcMapper tfIcMapper;

    @Autowired
    private BatRec1DayMapper batRec1DayMapper;

    @Autowired
    private BatRec1Mapper batRec1Mapper;


     @Scheduled(fixedDelay=time1)
//    @Scheduled(cron = time2)
    public void f(){
         Date date1 = new Date();
         long time1 = date1.getTime();
         System.out.println("~~~~~~~~~~~~"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1)+"~~~~~~~~~~~~超杰借出单转调拨单开始~~~~~~~~~~~~~~~~~~~~~~~~");
         this.bln2Ic_jieChuDan2DiaoBoDan();
         Date date2 = new Date();
         long time2 = date2.getTime();
         System.out.println("~~~~~~~~~~~~"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2)+"~~~~~~~~~~~~超杰借出单转调拨单结束~~~~~~~耗时"+(time2-time1)/1000+"~秒~~~~~~相当于"+(time2-time1)/1000/60+"~分钟~~~~~~~~~");
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    public void bln2Ic_jieChuDan2DiaoBoDan(){
        List<MfBln> ruKouDeFuHeTiaoJianDeMfBlnList01 =
                this.getRuKouDeFuHeTiaoJianDeMfBlnList01();
        List<TfBlnListObjOfSameBlNo> fuHeTiaoJianFenLeiHouDeDeTfBlnList02 =
                this.getFuHeTiaoJianDeBingGenJuBlNoFenLeiGuoDeTfBlnList02(ruKouDeFuHeTiaoJianDeMfBlnList01);
        this.chaRuMfIcAndTfIc(fuHeTiaoJianFenLeiHouDeDeTfBlnList02);
    }


////////////////////////////////////////////////////////////////////////////////////////////////
    public List<MfBln> getRuKouDeFuHeTiaoJianDeMfBlnList01(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~入口, 得到所有的符合条件的MfBln~~~开始~~~~~~~~~~~~~~~~~~~~~");
        List<MfBln> mfBln001 = a002ChaoJieBug002Mapper.getMfBln001();
        if(mfBln001==null)mfBln001=new ArrayList<>();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~入口, 得到所有的符合条件的MfBln~~~结束~~~~~~~~~~~~~~~~~~~~~");
        return mfBln001;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *注意  得到了根据bl_no一样   分类后的list集合
     * */
    public List<TfBlnListObjOfSameBlNo> getFuHeTiaoJianDeBingGenJuBlNoFenLeiGuoDeTfBlnList02(List<MfBln> mfBlnList){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~把入口得到的MfBln拿来得到一堆tfBln,并且按Blno相同分类好~~~开始~~~~~~~~~~~~~~~~~~~~~");
        List<TfBlnListObjOfSameBlNo>genJuTfBlnNoFenWanLeiDeList=new ArrayList<>();
        mfBlnList.forEach(mfBln->{
            System.out.println(mfBln.getBlNo()+"！！！！！！！！！！！！！！！！！！！！！！！！");
            TfBlnExample tfBlnExample=new TfBlnExample();
            tfBlnExample.createCriteria().andBlNoEqualTo(mfBln.getBlNo()).andBlIdEqualTo("LN");
            List<TfBln> tfBlnList = tfBlnMapper.selectByExample(tfBlnExample);
            TfBlnListObjOfSameBlNo tfBlnListObjOfSameBlNo=new TfBlnListObjOfSameBlNo();
            tfBlnListObjOfSameBlNo.setSameTfBlnNoList(tfBlnList);
            genJuTfBlnNoFenWanLeiDeList.add(tfBlnListObjOfSameBlNo);
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~把入口得到的MfBln拿来得到一堆tfBln,并且按Blno相同分类好~~~结束~~~~~~~~~~~~~~~~~~~~~");
        return genJuTfBlnNoFenWanLeiDeList;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    public void chaRuMfIcAndTfIc(List<TfBlnListObjOfSameBlNo> genJuTfBlnNoFenWanLeiDeList){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~开始~~~~~~~~~~~~~~~~~~~~~");
        for(TfBlnListObjOfSameBlNo tfBlnListObjOfSameBlNo:genJuTfBlnNoFenWanLeiDeList){
            List<TfBln> sameTfBlnNoList = tfBlnListObjOfSameBlNo.getSameTfBlnNoList();
            if(sameTfBlnNoList.size()>0){
                String blNo = sameTfBlnNoList.get(0).getBlNo();//该数组里面存的都是blNo样的TfBlNo
                MfBln mfBln = this.getMfBlnListUseBlNo(blNo);
                this.mfBlnToMfIcInsert(mfBln);//插入一条数据到Mf_Ic
                for(TfBln tfBln: sameTfBlnNoList){//插入多条数据到tf_IC
                    this.tfBlnToTfIcInsert(tfBln);
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void tfBlnToTfIcInsert(TfBln tfBln) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化tfbln为tfic并插入数据库~~~开始~~~~~~~~~~~~~~~~~~~~~");
        TfIc tfIc=new TfIc();
        tfIc.setIcId("IC");
        tfIc.setRem("借出单转入");
//        tfIc.setFixCst1("2");
//        tfIc.setFixCst("2");
        tfIc.setQty(tfBln.getQty());
        tfIc.setBatNo(tfBln.getBatNo());
        tfIc.setBatNo2(tfBln.getBatNo());
        tfIc.setPrdNo(tfBln.getPrdNo());
        tfIc.setIcNo("IC"+(tfBln.getBlNo()==null?"":tfBln.getBlNo()));
        tfIc.setIcDd(tfBln.getBlDd());
        tfIc.setItm(tfBln.getItm());
        tfIc.setPreItm(tfBln.getPreItm());
        tfIc.setKeyItm(tfBln.getItm());
        tfIc.setPrdName(tfBln.getPrdName());
        tfIc.setPrdMark(tfBln.getPrdMark());
        tfIc.setUnit(tfBln.getUnit());
        tfIc.setWh1(tfBln.getWh());
        tfIc.setCstStd(tfBln.getCst());
        tfIc.setCstStd(tfBln.getCstStd());
        tfIc.setUp(tfBln.getUp());
        tfIc.setUpStd(tfBln.getUpStd());
        tfIc.setValidDd(tfBln.getValidDd());

        //入库日期要拆行
//        tfIc.setRkDd(tfBln.getRkDd());
        //匹配入库日期的时候拆行成多个了
        List<TfIc>tfIcList= this.chaiHangQtyDeDaoRKDDGenJuPiHaoHeHuoHao(tfIc);
        if(tfIcList!=null&&tfIcList.size()>0){
            tfIcList.forEach(tfIc1-> {
                List<TfIc>tfIcList002= a002ChaoJieBug002Mapper.getItmOfLastOfTfIcOfICLN(tfIc1);

                if(tfIcList002.size()>0){
                    tfIc1.setItm(tfIcList002.get(0).getItm()+1);
                }else{
                    tfIc1.setItm(1);
                }

                tfIcMapper.insert(tfIc1);
            });
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化tfbln为tfic并插入数据库~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }
////////////////////////////////////////////////////////////////////////////////////////////
    private List<TfIc> chaiHangQtyDeDaoRKDDGenJuPiHaoHeHuoHao(TfIc tfIc) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~对单独一个tfic拆行并找到对应的rk_dd,并拆分数量~~~~~开始~~~~~~~~~~~~~~~~~~~");
        int count=a002ChaoJieBug002Mapper.getSamePrdNoBatNoWh_bat_rec1_dayCount(tfIc);
        List<TfIc>listTfIc=new ArrayList<>();
        for(int i=0;i<count;i++){
            //得到批号 货号  仓库一样的//我用了top 1,所以,这个list里面其实最多只有一个
            List<BatRec1Day>batRec1DayList=a002ChaoJieBug002Mapper.getSamePrdNoBatNoWh_bat_rec1_day(tfIc);
            if(batRec1DayList!=null && batRec1DayList.size()>0){
                BatRec1Day batRec1Day = batRec1DayList.get(0);//得到唯一的一个
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验删掉了分开加as的浪费~~~~~~~~~~~~~~~~~~~~~~~~");
//                System.out.println(batRec1Day.getQtyIn());
//                System.out.println(batRec1Day.getQtyOut());
//                System.out.println(batRec1Day.getBatNo());
//                System.out.println(batRec1Day.getPrdNo());
//                System.out.println(batRec1Day.getRkDd());
//                System.out.println(batRec1Day.getWh());
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验删掉了分开加as的浪费~~~~~~~~~~~~~~~~~~~~~~~~");
                BigDecimal qtyInOut = batRec1Day.getQtyIn().subtract(batRec1Day.getQtyOut()) ;
                BigDecimal tfIcQty = tfIc.getQty();
                if(tfIcQty.compareTo(qtyInOut)==1){//tfIcQty>qtyInOut
                    tfIc.setQty(tfIcQty.subtract(qtyInOut));//拆分后还剩余这么多用于下次拆分
                    //注意:tfIc是一个全局拆分对象(拆分数量,取数量和入库时间),所以此时搜集的是一个copy的tfIC对象(他使用的是qtyInOut)
                    this.dangTfIcDeQtyDaYubat_rec1_dayDeQtyChaiHangShouJiDuoGeListTfIc
                            (listTfIc,tfIc,qtyInOut,batRec1Day.getRkDd());
                    //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
                    this.dangTfIcDeQtyDaYubat_rec1_dayDeQty_huiXie_bat_rec1_dayAndbat_rec1(batRec1Day,qtyInOut);
                    //不要return,继续拆行
                }else if(tfIcQty.compareTo(qtyInOut)==-1){//tfIcQty<qtyInOut
                    //此时tfIc.setQty不用再设置了,因为这次就结束循环从而结束拆分了
                    //此时用tfIcQty自己的数量
                    this.tficQtyXiaoDeShiHouSouJiTfIc(listTfIc,tfIc,batRec1Day.getRkDd());
                    this.dangTfIcDeQtyXiaoYubat_rec1_dayDeQty_huiXie_bat_rec1_dayAndbat_rec1(batRec1Day,tfIc);
                    return listTfIc;//return掉,不在拆行
                }else{//tfIcQty.compareTo(qtyInOut)==0此时tfIcQty==qtyInOut
                    //此时也不要再拆行了,
                    //此时用tfIcQty自己的数量
                    this.tficQtyXiaoDeShiHouSouJiTfIc(listTfIc,tfIc,batRec1Day.getRkDd());//这个小于的可以用于等于
                    //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
                    this.dangTfIcDeQtyDaYubat_rec1_dayDeQty_huiXie_bat_rec1_dayAndbat_rec1(batRec1Day,qtyInOut);//这个大于的可以用于等于
                    return listTfIc;
                }


            }else{
                List<TfIc>listTfIc1=new ArrayList<>();
                tfIc.setRem("借出单转入但没有在bat_rec1_day匹配到RK_DD");
                listTfIc1.add(tfIc);
                return listTfIc1;
            }
        }
        List<TfIc>listTfIc2=new ArrayList<>();
        tfIc.setRem("借出单转入但没有在bat_rec1_day匹配到RK_DD");
        listTfIc2.add(tfIc);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~对单独一个tfic拆行并找到对应的rk_dd,并拆分数量~~~~~结束~~~~~~~~~~~~~~~~~~~");
        return listTfIc2;

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void dangTfIcDeQtyXiaoYubat_rec1_dayDeQty_huiXie_bat_rec1_dayAndbat_rec1(BatRec1Day batRec1Day,TfIc tfIc) {
        //不更新的字段全部设置为null
        batRec1Day.setRem(null);batRec1Day.setQtyOutUnsh(null);batRec1Day.setProduDd(null);batRec1Day.setLstOtd(null);
        batRec1Day.setLockId(null);batRec1Day.setValidDd(null);batRec1Day.setQty1Out(null);batRec1Day.setQty1OutUnsh(null);
        batRec1Day.setQty1In(null);
        batRec1Day.setQtyIn(null);//这个必须设置为0,否则,将来也会被更新
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout=qtyout+tfIC.qty~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
        BatRec1DayExample batRec1DayExample=new BatRec1DayExample();
        batRec1DayExample.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh())
                .andRkDdEqualTo(batRec1Day.getRkDd())
                .andPrdMarkEqualTo(batRec1Day.getPrdMark())
                .andDepEqualTo(batRec1Day.getDep());
        //Selective的意思是,如果是null的字段,不更新到数据库
        BatRec1Day batRec1Day001 =new BatRec1Day();
        BeanUtils.copyProperties(batRec1Day,batRec1Day001);//copy一个新的对象,不要动原来的对象
        //其实我们只要更新数量,所以其他的都还原成null,Selective会不更新null
        batRec1Day001.setBatNo(null);batRec1Day001.setPrdNo(null);//不更新的都要设置为null
        batRec1Day001.setRkDd(null);batRec1Day001.setQtyIn(null);
        batRec1Day001.setWh(null);//注意,我们就是为了更新qty_out,所以out不能是null
        batRec1Day001.setQtyOut(batRec1Day.getQtyOut().add(tfIc.getQty()));//让out等于in,将来方便拆下一行
        batRec1DayMapper.updateByExampleSelective(batRec1Day001,batRec1DayExample);
        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout=qtyout+tfIC.qty~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout=qtyout+tfIC.qty~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
        //更新不带日期的仓库表
        //更新不带日期的仓库表
        BatRec1Example batRec1Example=new BatRec1Example();
        batRec1Example.createCriteria()
                .andBatNoEqualTo(batRec1Day.getBatNo())
                .andPrdNoEqualTo(batRec1Day.getPrdNo())
                .andWhEqualTo(batRec1Day.getWh())
                .andPrdMarkEqualTo(batRec1Day.getPrdMark());
        BatRec1 batRec1001 =new BatRec1();
        BeanUtils.copyProperties(batRec1Day001,batRec1001);//会把相同的字段复制过去


        List<BatRec1> batRec1s = batRec1Mapper.selectByExample(batRec1Example);
        if(batRec1s.size()>0){
            BigDecimal qtyZeng = tfIc.getQty();
            BigDecimal qtyOut = batRec1s.get(0).getQtyOut();
            if(qtyOut==null){qtyOut=new BigDecimal(0);}
            if(qtyZeng==null){qtyZeng=new BigDecimal(0);}
            batRec1001.setQtyOut(qtyOut.add(qtyZeng));
            batRec1Mapper.updateByExampleSelective(batRec1001,batRec1Example);
        }


        System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout=qtyout+tfIC.qty~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");



    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void tficQtyXiaoDeShiHouSouJiTfIc(List<TfIc>listTfIc,TfIc tfIc,Date rk_DD) {
        System.out.println("~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的最后一个TfIc~~~~~~~~开始~~~~~~~~~~~~~~~·");
        //将得到的新的tfIc入集合
        TfIc tfIc001=new TfIc();
        BeanUtils.copyProperties(tfIc,tfIc001);//
        tfIc001.setRkDd(rk_DD);
//        tfIc001.setQty(qtyInOut);因为比qtyInOut大,所以用自己的
        listTfIc.add(tfIc001);//使用copy过来的新的对象,避免下次循环的时候该对象变了
        System.out.println("~~~~~TfIc的QTy小于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的最后一个TfIc~~~~~~~~结束~~~~~~~~~~~~~~~·");

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
public void dangTfIcDeQtyDaYubat_rec1_dayDeQty_huiXie_bat_rec1_dayAndbat_rec1(BatRec1Day batRec1Day,BigDecimal qtyInOut){
   //不更新的字段全部设置为null
    batRec1Day.setRem(null);batRec1Day.setQtyOutUnsh(null);batRec1Day.setProduDd(null);batRec1Day.setLstOtd(null);
    batRec1Day.setLockId(null);batRec1Day.setValidDd(null);batRec1Day.setQty1Out(null);batRec1Day.setQty1OutUnsh(null);
    batRec1Day.setQty1In(null);
    batRec1Day.setQtyIn(null);//这个必须设置为0,否则,将来也会被更新
    System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout==qtyin~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
    //数据库里面表bat_rec1_day 和表bat_rec1的qtyout回写成qtyin一样的
    BatRec1DayExample batRec1DayExample=new BatRec1DayExample();
    batRec1DayExample.createCriteria()
            .andBatNoEqualTo(batRec1Day.getBatNo())
            .andPrdNoEqualTo(batRec1Day.getPrdNo())
            .andWhEqualTo(batRec1Day.getWh())
            .andRkDdEqualTo(batRec1Day.getRkDd())
            .andPrdMarkEqualTo(batRec1Day.getPrdMark())
            .andDepEqualTo(batRec1Day.getDep());
    //Selective的意思是,如果是null的字段,不更新到数据库
    BatRec1Day batRec1Day001 =new BatRec1Day();
    BeanUtils.copyProperties(batRec1Day,batRec1Day001);//copy一个新的对象,不要动原来的对象
    //其实我们只要更新数量,所以其他的都还原成null,Selective会不更新null
    batRec1Day001.setBatNo(null);batRec1Day001.setPrdNo(null);//不更新的都要设置为null
    batRec1Day001.setRkDd(null);batRec1Day001.setQtyIn(null);
    batRec1Day001.setWh(null);//注意,我们就是为了更新qty_out,所以out不能是null
    batRec1Day001.setQtyOut(batRec1Day.getQtyIn());//让out等于in,将来方便拆下一行
    batRec1DayMapper.updateByExampleSelective(batRec1Day001,batRec1DayExample);
    System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),回写batRec1Day的qtyout==qtyin~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");

    System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout==qtyin~~~~~~~~~开始 ~~~~~~~~~~~~~~~~~~~~~~~");
    //更新不带日期的仓库表
    BatRec1Example batRec1Example=new BatRec1Example();
    batRec1Example.createCriteria()
            .andBatNoEqualTo(batRec1Day.getBatNo())
            .andPrdNoEqualTo(batRec1Day.getPrdNo())
            .andWhEqualTo(batRec1Day.getWh())
             .andPrdMarkEqualTo(batRec1Day.getPrdMark());

    BatRec1 batRec1001 =new BatRec1();
    BeanUtils.copyProperties(batRec1Day001,batRec1001);//会把相同的字段复制过去
    batRec1001.setQtyIn(null);//不更新这个,主要是更新qtyout,该qtyout属于累加型号
    batRec1001.setQtyOut(null);//清空值,给下面用


    List<BatRec1> batRec1s = batRec1Mapper.selectByExample(batRec1Example);
    if(batRec1s.size()>0){
        BigDecimal qtyOut = batRec1s.get(0).getQtyOut();
        if(qtyOut==null){qtyOut=new BigDecimal(0);}
        if(qtyInOut==null){qtyInOut=new BigDecimal(0);}
        batRec1001.setQtyOut(qtyOut.add(qtyInOut));
        batRec1Mapper.updateByExampleSelective(batRec1001,batRec1Example);
    }



    System.out.println("~~~~~~~~~~~~~~~~TfIc的QTy大于bat_rec1的(qtyin-qtyout),回写batRec1的qtyout==qtyin~~~~~~~~~结束 ~~~~~~~~~~~~~~~~~~~~~~~");

}
////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void dangTfIcDeQtyDaYubat_rec1_dayDeQtyChaiHangShouJiDuoGeListTfIc
            (List<TfIc>listTfIc,TfIc tfIc,BigDecimal qtyInOut,Date rkDd){
        System.out.println("~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的TfIc~~~~~~~~开始~~~~~~~~~~~~~~~·");
        //将得到的新的tfIc入集合
        TfIc tfIc001=new TfIc();
        BeanUtils.copyProperties(tfIc,tfIc001);//
        tfIc001.setRkDd(rkDd);
        tfIc001.setQty(qtyInOut);
        listTfIc.add(tfIc001);//使用copy过来的新的对象,避免下次循环的时候该对象变了
        System.out.println("~~~~~TfIc的QTy大于bat_rec1_day的(qtyin-qtyout),用集合搜集一个拆过行的TfIc~~~~~~~~结束~~~~~~~~~~~~~~~·");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void mfBlnToMfIcInsert(MfBln mfBln) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化mfbln为mfic并插入数据库~~~开始~~~~~~~~~~~~~~~~~~~~~");
        MfIcWithBLOBs mfIcWithBLOBs=new MfIcWithBLOBs();
        mfIcWithBLOBs.setRem("借出单转入");
        mfIcWithBLOBs.setPrtSw("N");
        mfIcWithBLOBs.setFixCst("2");
        mfIcWithBLOBs.setFixCst1("2");
        mfIcWithBLOBs.setIcId("IC");
        mfIcWithBLOBs.setIcNo("IC"+(mfBln.getBlNo()==null?"":mfBln.getBlNo()));
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
        mfIcMapper.insert(mfIcWithBLOBs);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~变化mfbln为mfic并插入数据库~~~结束~~~~~~~~~~~~~~~~~~~~~");
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////
    public  MfBln getMfBlnListUseBlNo(String blNo){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~通过一个blno(来自tfbln)得到一个mfbln~~~开始~~~~~~~~~~~~~~~~~~~~~");
        MfBlnExample mfBlnExample=new MfBlnExample();
        mfBlnExample.createCriteria().andBlNoEqualTo(blNo);
        //正常来说,mfblns只有一个元素
        List<MfBln> mfBlns = mfBlnMapper.selectByExample(mfBlnExample);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~通过一个blno(来自tfbln)得到一个mfbln~~~结束~~~~~~~~~~~~~~~~~~~~~");
        return  mfBlns.get(0);
    }


/////////////////////////////////////////////////

 ////////////////////////////////////////////////////////////////////////////////////////////////
    public class TfBlnListObjOfSameBlNo{
        List<TfBln> sameTfBlnNoList=new ArrayList<>();

         public List<TfBln> getSameTfBlnNoList() {
             return sameTfBlnNoList;
         }

         public TfBlnListObjOfSameBlNo setSameTfBlnNoList(List<TfBln> sameTfBlnNoList) {
             this.sameTfBlnNoList = sameTfBlnNoList;
             return this;
         }
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[]args){
       /* // BigDecimal是处理double精度问题的对象
        BigDecimal b1 = new BigDecimal("10");
        BigDecimal b2 = new BigDecimal("1");
        BigDecimal b3 = new BigDecimal("1");
        // 结果
        BigDecimal result = null;
        // 加
        result = b1.add(b2);
        System.out.println(result.doubleValue());
        // 减
        result = b1.subtract(b2);
        System.out.println(result.doubleValue());
        // 乘
        result = b1.multiply(b2);
        System.out.println(result.doubleValue());
        // 除
        result = b1.divide(b2);
        System.out.println(result.doubleValue());
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
        System.out.println(b2.compareTo(b2));
        int i = b2.compareTo(b2);*/
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
}
