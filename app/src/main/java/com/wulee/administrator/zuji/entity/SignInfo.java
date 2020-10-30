package com.wulee.administrator.zuji.entity;

import com.wulee.administrator.zuji.database.bean.PersonInfo;

import cn.bmob.v3.BmobObject;



public class SignInfo extends BmobObject {

    public String date;
    public boolean hasSign;
    public PersonInfo personInfo;
}
