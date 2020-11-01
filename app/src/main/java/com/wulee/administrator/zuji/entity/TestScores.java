package com.wulee.administrator.zuji.entity;

import com.wulee.administrator.zuji.database.bean.PersonInfo;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

public class TestScores extends BmobObject {

    private String name;
    private String personName;
    private BmobDate time;
    private PersonInfo personInfo;
    private Scores scores;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setTime(BmobDate time) {
        this.time = time;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BmobDate getTime() {
        return time;
    }


    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
