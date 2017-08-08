package com.example.user.roomescape;

import android.app.Application;

public class MyApplication extends Application {
    private String correct1 = "0", correct2 = "0", correct3 = "0";
    private int cnt = 1;

    public String getCorrect1String()
    {
        return correct1;
    }

    public void setCorrect1String(String correct1String)
    {
        this.correct1 = correct1String;
    }

    public String getCorrect2String()
    {
        return correct2;
    }

    public void setCorrect2String(String correct2String)
    {
        this.correct2 = correct2String;
    }

    public String getCorrect3String()
    {
        return correct3;
    }

    public void setCorrect3String(String correct3String)
    {
        this.correct3 = correct3String;
    }

    public int getCnt(){
        return cnt;
    }

    public void setCnt(int cnt){
        this.cnt = cnt;
    }
}
