package com.wulee.administrator.zuji.entity;

import cn.bmob.v3.BmobObject;


public class SplashPic extends BmobObject {

    private String url;
    private String desc;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
