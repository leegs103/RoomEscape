package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class problem2 extends Dialog {
    protected ImageButton ubtn, dbtn, lbtn, rbtn;
    protected Button okbtn;
    protected Button clbtn;

    String addarrow, num1, num2, num3, num4;
    String num5, num6, num7, num8;

    public problem2(Context context){
        super(context);
    }

    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.problem_2);

        ubtn = (ImageButton)findViewById(R.id.up);
        dbtn = (ImageButton)findViewById(R.id.down);
        lbtn = (ImageButton)findViewById(R.id.left);
        rbtn = (ImageButton)findViewById(R.id.right);
        okbtn = (Button)findViewById(R.id.cfbtn);
        clbtn = (Button)findViewById(R.id.clbtn);
        okbtn.setSoundEffectsEnabled(false);
        clbtn.setSoundEffectsEnabled(false);

        ubtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = ubtn.getTag().toString();
            }
        });
        dbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(dbtn.getTag().toString() == "2"){
                    num2 = dbtn.getTag().toString();
                    dbtn.setTag("5");
                }
                num5 = dbtn.getTag().toString();
                dbtn.setTag("2");
            }
        });
        lbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(lbtn.getTag().toString() == "3"){
                    num3 = lbtn.getTag().toString();
                    lbtn.setTag("6");
                }
                if(lbtn.getTag().toString() == "6") {
                    num6 = lbtn.getTag().toString();
                    lbtn.setTag("7");
                }
                num7 = lbtn.getTag().toString();
                lbtn.setTag("3");
            }
        });
        rbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num4 = rbtn.getTag().toString();
            }
        });
        okbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                addarrow = num2 + num3 + num6 + num4 + num7 + num5;
                dismiss();
            }
        });
        clbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addarrow = "1";
                dismiss();
            }
        });
    }

    public void onBackPressed() {
    }

    public String getAddarrow(){
        return addarrow;
    }
}
