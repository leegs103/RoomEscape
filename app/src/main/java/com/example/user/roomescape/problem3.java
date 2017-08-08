package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class problem3 extends Dialog {
    protected ImageButton mSw1, mSw2, mSw3, mSw4, mSw5;
    protected Button okbtn, clbtn;
    String tag1, tag2, tag3, tag4, tag5, ok;


    public problem3(Context context){
        super(context);
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.problem_3);


        mSw1 = (ImageButton)findViewById(R.id.sw1);
        mSw2 = (ImageButton)findViewById(R.id.sw2);
        mSw3 = (ImageButton)findViewById(R.id.sw3);
        mSw4 = (ImageButton)findViewById(R.id.sw4);
        mSw5 = (ImageButton)findViewById(R.id.sw5);
        okbtn = (Button)findViewById(R.id.cfbtn);
        clbtn = (Button)findViewById(R.id.clbtn);
        okbtn.setSoundEffectsEnabled(false);
        clbtn.setSoundEffectsEnabled(false);

        mSw1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mSw1.getTag() != "1"){
                    mSw1.setImageResource(R.drawable.switch_on1);
                    mSw1.setTag("1");
                }
                else{
                    mSw1.setImageResource(R.drawable.switch_off1);
                    mSw1.setTag("2");
                }
            }
        });

        mSw2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mSw2.getTag() != "1"){
                    mSw2.setImageResource(R.drawable.switch_on1);
                    mSw2.setTag("1");
                }
                else{
                    mSw2.setImageResource(R.drawable.switch_off1);
                    mSw2.setTag("2");
                }
            }
        });

        mSw3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mSw3.getTag() != "1"){
                    mSw3.setImageResource(R.drawable.switch_on1);
                    mSw3.setTag("1");
                }
                else{
                    mSw3.setImageResource(R.drawable.switch_off1);
                    mSw3.setTag("2");
                }
            }
        });

        mSw4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mSw4.getTag() != "1"){
                    mSw4.setImageResource(R.drawable.switch_on1);
                    mSw4.setTag("1");
                }
                else{
                    mSw4.setImageResource(R.drawable.switch_off1);
                    mSw4.setTag("2");
                }
            }
        });

        mSw5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mSw5.getTag() != "1"){
                    mSw5.setImageResource(R.drawable.switch_on1);
                    mSw5.setTag("1");
                }
                else{
                    mSw5.setImageResource(R.drawable.switch_off1);
                    mSw5.setTag("2");
                }
            }
        });

        okbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tag1 = mSw1.getTag().toString();
                tag2 = mSw2.getTag().toString();
                tag3 = mSw3.getTag().toString();
                tag4 = mSw4.getTag().toString();
                tag5 = mSw5.getTag().toString();
                ok = tag1 + tag2 + tag3 + tag4 + tag5;
                dismiss();
            }
        });
        clbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ok = "";
                dismiss();
            }
        });
    }

    public void onBackPressed() {
    }

    public String getOk(){
        return ok;
    }
}