package com.ipace.chaoJie.A001Controller;
import com.ipace.chaoJie.A000Component.Cnst;
import com.ipace.chaoJie.utils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@CrossOrigin
public class QianWeiChengBen {

    @Autowired
    private Cnst cnst;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="test",method = RequestMethod.GET)
    public @ResponseBody String test(){
        p.p("_____________________testSuccess_____________________");
        return "_____________________testSuccess_____________________";
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="q",method = RequestMethod.POST)
    public @ResponseBody Map qingChu(){
        p.p(p.gp().sad(p.dexhx).sad("清除开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qingLiShuJu();
        p.p(p.gp().sad(p.dexhx).sad("清除完成").sad(p.dexhx).gad());
        return p.gp().smp("id","清除完成").gmp();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="Q1",method = RequestMethod.POST)
    public @ResponseBody Map Q20180119(@RequestBody Map m){
        p.p(p.gp().sad(p.dexhx).sad("Q20180119计算开始").sad(p.dexhx).gad());
        p.p(m.get("a1"));
        p.p(m.get("a2"));
        p.p(m.get("a3"));
        p.p(m.get("a4"));
        try {
            cnst.chengBenJiSuan1.qianWeiQ20180119(
                    m.get("a1").toString(),
                    m.get("a2").toString(),
                    m.get("a3").toString(),
                    m.get("a4").toString());
        } catch (Exception e) {

        }
        p.p(p.gp().sad(p.dexhx).sad("Q20180119计算结束").sad(p.dexhx).gad());
        return p.gp().smp("id","Q20180119计算结束").gmp();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value="Q2",method = RequestMethod.POST)
    public @ResponseBody Map Q20180123(@RequestBody Map m){
        p.p(p.gp().sad(p.dexhx).sad("Q20180123计算开始").sad(p.dexhx).gad());
        p.p(m.get("a1"));
        p.p(m.get("a2"));
        p.p(m.get("a3"));
        p.p(m.get("a4"));
        try {
            cnst.chengBenJiSuan1.qianWeiQ20180123(
                    m.get("a1").toString(),
                    m.get("a2").toString(),
                    m.get("a3").toString(),
                    m.get("a4").toString());
        } catch (Exception e) {

        }
        p.p(p.gp().sad(p.dexhx).sad("Q20180123计算结束").sad(p.dexhx).gad());
        return p.gp().smp("id","Q20180123计算结束").gmp();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *a1 就是2016
     * a2就是 1
     * a3就是 2016-01-01
     * a4 就是 2016-01-31
     * */
    /**
     *从2016-02-01到2017-07-31日成本核算
     * */
    @RequestMapping(value="Q3",method = RequestMethod.POST)
    public @ResponseBody Map Q3(){
        p.p(p.gp().sad(p.dexhx).sad("Q20180123计算开始").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-02-01到2016-02-28成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "2", "2016-02-01", "2016-02-28");
        p.p(p.gp().sad(p.dexhx).sad("2016-02-01到2016-02-28成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-03-01到2016-03-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "3", "2016-03-01", "2016-03-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-03-01到2016-03-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-04-01到2016-04-30成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "4", "2016-04-01", "2016-04-30");
        p.p(p.gp().sad(p.dexhx).sad("2016-04-01到2016-04-30成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-05-01到2016-05-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "5", "2016-05-01", "2016-05-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-05-01到2016-05-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-06-01到2016-06-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "6", "2016-06-01", "2016-06-30");
        p.p(p.gp().sad(p.dexhx).sad("2016-06-01到2016-06-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-07-01到2016-07-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "7", "2016-07-01", "2016-07-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-07-01到2016-07-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-08-01到2016-08-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "8", "2016-08-01", "2016-08-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-08-01到2016-08-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-09-01到2016-09-30成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "9", "2016-09-01", "2016-09-30");
        p.p(p.gp().sad(p.dexhx).sad("2016-09-01到2016-09-30成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-10-01到2016-10-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "10", "2016-10-01", "2016-10-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-10-01到2016-10-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-11-01到2016-11-30成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "11", "2016-11-01", "2016-11-30");
        p.p(p.gp().sad(p.dexhx).sad("2016-11-01到2016-11-30成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2016-12-01到2016-12-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2016", "12", "2016-12-01", "2016-12-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-12-01到2016-12-31成本计算结束").sad(p.dexhx).gad());
//////////////////////////2017年的////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        p.p(p.gp().sad(p.dexhx).sad("2017-01-01到2017-01-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "1", "2017-01-01", "2017-01-31");
        p.p(p.gp().sad(p.dexhx).sad("2016-01-01到2017-01-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-02-01到2017-02-28成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "2", "2017-02-01", "2017-02-28");
        p.p(p.gp().sad(p.dexhx).sad("2017-02-01到2017-02-28成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-03-01到2017-03-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "3", "2017-03-01", "2017-03-31");
        p.p(p.gp().sad(p.dexhx).sad("2017-03-01到2017-03-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-04-01到2017-04-30成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "4", "2017-04-01", "2017-04-30");
        p.p(p.gp().sad(p.dexhx).sad("2017-04-01到2017-04-30成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-05-01到2017-05-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "5", "2017-05-01", "2017-05-31");
        p.p(p.gp().sad(p.dexhx).sad("2017-05-01到2017-05-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-06-01到2017-06-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "6", "2017-06-01", "2017-06-30");
        p.p(p.gp().sad(p.dexhx).sad("2017-06-01到2017-06-31成本计算结束").sad(p.dexhx).gad());

        p.p(p.gp().sad(p.dexhx).sad("2017-07-01到2017-07-31成本计算开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qianWeiQ20180123("2017", "7", "2017-07-01", "2017-07-31");
        p.p(p.gp().sad(p.dexhx).sad("2017-07-01到2017-07-31成本计算结束").sad(p.dexhx).gad());




        p.p(p.gp().sad(p.dexhx).sad("Q20180123计算结束").sad(p.dexhx).gad());
        return p.gp().smp("id","Q20180123计算结束").gmp();
    }

































































    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
