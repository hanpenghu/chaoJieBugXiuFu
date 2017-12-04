package com.ipace.chaoJie.utils;

public class StringIsNullOrUndefinedToSpace {
        public static String stringIsNullOrUndefinedToSpace(String str){
            str=(str==null?"":str);
            str=("undefined".equals(str)?"":str);
            return str;
        }
    public static String stringNumberIsNullOrUndefinedToStringZero(String str){
        str=(str==null?"0":str);
        str=("undefined".equals(str)?"0":str);
        return str;
    }
}
