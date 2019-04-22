package com.example.tinpattiofflineaccountant;

import java.util.Date;

class MyObj {
    private int showExp;
    private String showDetail;
    private String date;

    public MyObj(int expend, String det,String date) {
        this.showExp=expend;
        this.showDetail=det;
        this.date= date;
    }

    public String getDate() {
        return date;
    }

    public int getShowExp() {
        return showExp;
    }

    public String getShowDetail() {
        return showDetail;
    }

}
