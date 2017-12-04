package com.ipace.chaoJie.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubString2GetDate {
    /**
     *按日期在最后面
     * */
    public static Date f(String str){
        if(str.length()>=10){
            str= str.substring(str.length()-10,str.length());
        }else{
            str="";
        }

//       System.out.println(str);
       Date date=null;
        try {
            date= new SimpleDateFormat("yyyy/MM/dd").parse(str);
        } catch (ParseException e) {
//            e.printStackTrace();
        }
        return date;
    }


    public static void main(String[]args){
         System.out.println(f("dsalfj2017/12/23"));
    }

}
