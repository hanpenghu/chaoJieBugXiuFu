package com.ipace.chaoJie.A003Services.dingShiRenWu;


import com.alibaba.fastjson.JSON;
import com.ipace.chaoJie.A004Dto.MfBln;
import com.ipace.chaoJie.A004Dto.TfBln;
import com.ipace.chaoJie.A004Dto.TfBlnExample;
import com.ipace.chaoJie.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *借出单转调拨单
 * */
@Component
public class chaoJieBug002_0 {

private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

    @Autowired
    private C c;


    @Scheduled(fixedDelay = 2 * 60 * 1000)
//    @Transactional
    public void f() {
        Date date1 = new Date();
        long time1 = date1.getTime();
        System.out.println("~~~~~~~~~~~~" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1) + "~~~~~~~~~~~~超杰借出单转调拨单开始~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            this.bln2Ic_借出单转调拨单();
        } catch (Exception e) {
            e.printStackTrace();
            l.error(e.getMessage(),e);
//            p.throwE(e);
        }
        Date date2 = new Date();
        long time2 = date2.getTime();
        System.out.println("~~~~~~~~~~~~" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2) + "~~~~~~~~~~~~超杰借出单转调拨单结束~~~~~~~耗时" + (time2 - time1) / 1000 + "~秒~~~~~~相当于" + (time2 - time1) / 1000 / 60 + "~分钟~~~~~~~~~");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
//    @Transactional
    public void bln2Ic_借出单转调拨单() {
        List<MfBln> 入口的符合条件的MfBlnList01 =
                this.getRuKouDeFuHeTiaoJianDeMfBlnList01();


        List<TfBlnListObjOfSameBlNo> 符合条件分类后的TfBlnList02 =
                this.get符合条件并根据BlNo分类过的TfBlnList02(入口的符合条件的MfBlnList01);


        this.chaRuMfIcAndTfIc(符合条件分类后的TfBlnList02);
    }



//    @Transactional
    public void chaRuMfIcAndTfIc(List<TfBlnListObjOfSameBlNo> genJuTfBlnNoFenWanLeiDeList) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~开始~~~~~~~~~~~~~~~~~~~~~");
        for (TfBlnListObjOfSameBlNo tfBlnListObjOfSameBlNo : genJuTfBlnNoFenWanLeiDeList) {
            try {
                //注意,这里try一下,是为了一个单据不行的时候,下一个单据还可以继续,就是有的单据能搞成功,有的可能不能转单
                //比如有的拆了几次还没拆完的,我就手动抛出异常回滚仓库库存, 这时候继续  下一个单子转单
                List<TfBln> sameTfBlnNoList = tfBlnListObjOfSameBlNo.getSameTfBlnNoList();
                if (sameTfBlnNoList.size() > 0) {
                    String blNo = sameTfBlnNoList.get(0).getBlNo();//该数组里面存的都是blNo一样的TfBlNo
                    MfBln mfBln = c.chaoJieBug002.getMfBlnListUseBlNo(blNo);
                    try {
                        //这个try会导致可能只有表头没有表身,因为表身回滚了,表头没有回滚
                        //这里用try是因为避免下次再插入的时候产生问题,因为表头mf只能插入一次
                        c.chaoJieBug002.mfBlnToMfIcInsert(mfBln);//插入一条数据到Mf_Ic
                    } catch (Exception e) {
    //                    e.printStackTrace();
                        p.p("-------------------------------------------------------");
                        p.p("有可能是mfIc不能插入相同的单号了,但是表头确实只插入一次就行了");
                        p.p("-------------------------------------------------------");

                    }
                    for (TfBln tfBln : sameTfBlnNoList) {//插入多条数据到tf_IC
                        c.chaoJieBug002.tfBlnToTfIcInsert(tfBln);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                l.error(e.getMessage(),e);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~循环得到的一堆的mfblen和tfbln(分类好的)并变化插入到mfIC和tfIC~~~结束~~~~~~~~~~~~~~~~~~~~~");
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

    /**
     * 注意  得到了根据bl_no一样   分类后的list集合
     */
//    @Transactional
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
    }







}
