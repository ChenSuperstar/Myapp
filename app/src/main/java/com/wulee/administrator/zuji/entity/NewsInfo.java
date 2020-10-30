package com.wulee.administrator.zuji.entity;

import java.util.List;


public class NewsInfo {




    private int code;
    private String msg;
    private List<NewsEntity> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewsEntity> getNewsEntityList() {
        return newslist;
    }

    public void setNewsEntityList(List<NewsEntity> newslist) {
        this.newslist = newslist;
    }

    public static class NewsEntity {
        /**
         * ctime : 2017-09-06 12:33
         * title : 金砖合作扬帆再出发
         * description : 搜狐国内
         * picUrl : http://photocdn.sohu.com/20170906/Img509881807_ss.jpeg
         * url : http://news.sohu.com/20170906/n509881956.shtml
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
