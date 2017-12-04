package com.ipace.chaoJie.A003Services.dingShiRenWu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class 我好 {
    @Autowired
    private 你好 你好;

//    @Scheduled(fixedDelay = 2*1000)
    public void 日她(){
        你好.我曹();
    }
}
