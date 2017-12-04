package com.ipace.chaoJie.utils;

public class IsEmailOrPhoneNum {
    public static boolean isEmailOrPhoneNum(String emailOrPhoneNoStr){
        if(IsEmail.isEmail1(emailOrPhoneNoStr)||IsPhoneNo.isPhoneNo(emailOrPhoneNoStr)){
            return true;
        }else{
            return false;
        }
    }
}
