package com.ipace.chaoJie.A003Services.dingShiRenWu;
import com.ipace.chaoJie.A002Dao.A001TongYongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("chaoJieBug001")
public class ChaoJieBug001 {
    public final static long time1 = 3*60*1000;
    public final static String time2="0 0 13 * * ?";//每天13点开始运行
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
//    @Scheduled(fixedDelay=time1)
    @Scheduled(cron = time2)
    public void f(){
        this.f1();
    }

    public void f1(){
        System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println("~~~~~~~~~~~~~~chaojiebug001开始~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~001_1~~~~"+a001TongYongMapper.chaoJieBug001_1()+"~~条~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~001_2~~~~~"+a001TongYongMapper.chaoJieBug001_2()+"~~~~条~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~001_3~~~~~~"+a001TongYongMapper.chaoJieBug001_3()+"~~~~条~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~001_4~~~~~~~~"+a001TongYongMapper.chaoJieBug001_4()+"~条~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~001_5~~~~~~~~~~~~~~~~~"+a001TongYongMapper.chaoJieBug001_5()+"~~~条~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~001_6~~~~~~~~~~~~~~~~~"+a001TongYongMapper.chaoJieBug001_6()+"~~~条~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~001_7~~~~~~~~~~~~~~~~~"+a001TongYongMapper.chaoJieBug001_7()+"~~~条~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~chaojiebug001    结     束~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();System.out.println();System.out.println();System.out.println();
    }
}
