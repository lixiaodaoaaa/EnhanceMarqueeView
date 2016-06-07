package com.sunfusheng.bean;

import android.view.View;

/**
 * Created by lixd on 2016/6/6.
 */
public class MarqueeItem {
    private String notice;
    private View.OnClickListener  clickListener;

    public MarqueeItem(String notice, View.OnClickListener clickListener) {
        this.notice = notice;
        this.clickListener = clickListener;
    }

    public View.OnClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "MarqueeItem{" +
                "notice='" + notice + '\'' +
                ", clickListener=" + clickListener +
                '}';
    }
}
