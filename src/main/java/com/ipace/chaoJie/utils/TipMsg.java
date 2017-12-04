package com.ipace.chaoJie.utils;

import com.alibaba.fastjson.JSON;
import com.ipace.chaoJie.A004Dto.Msg;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TipMsg {
    public static void falseOfNoLogin(HttpServletResponse response)  {
        PrintWriter writer =null;
        try {
            response.setCharacterEncoding("UTF-8");
            List<Msg> msgs = new MessageGenerate().generateMessage("fail", "您没有登录", "", "4");
            String msgss = JSON.toJSONString(msgs);
            writer = response.getWriter();
            if(writer!=null){
                writer.append(msgss);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                writer.close();
            }
        }
    }
}
