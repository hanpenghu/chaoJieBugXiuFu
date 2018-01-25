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


    @RequestMapping(value="test",method = RequestMethod.GET)
    public @ResponseBody String test(){
        p.p("_____________________testSuccess_____________________");
        return "_____________________testSuccess_____________________";
    }


    @RequestMapping(value="q",method = RequestMethod.POST)
    public @ResponseBody Map qingChu(){
        p.p(p.gp().sad(p.dexhx).sad("清除开始").sad(p.dexhx).gad());
        cnst.chengBenJiSuan1.qingLiShuJu();
        p.p(p.gp().sad(p.dexhx).sad("清除完成").sad(p.dexhx).gad());
        return p.gp().smp("id","清除完成").gmp();
    }


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

}
