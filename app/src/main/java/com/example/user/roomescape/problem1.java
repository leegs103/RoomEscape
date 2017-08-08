package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class problem1 extends Dialog {

    protected ImageView img;
    protected EditText editnum1;
    protected EditText editnum2;
    protected EditText editnum3;
    protected EditText editnum4;
    protected EditText editnum5;
    protected EditText editnum6;
    protected EditText editnum7;
    protected  Button okbtn;
    protected  Button clbtn;

    private String addStr;

    public problem1(Context context){
        super(context);
    }

    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.problem_1);

        img = (ImageView) findViewById(R.id.img1);
        editnum1 = (EditText) findViewById(R.id.editnum1);
        editnum2 = (EditText) findViewById(R.id.editnum2);
        editnum3 = (EditText) findViewById(R.id.editnum3);
        editnum4 = (EditText) findViewById(R.id.editnum4);
        editnum5 = (EditText) findViewById(R.id.editnum5);
        editnum6 = (EditText) findViewById(R.id.editnum6);
        editnum7 = (EditText) findViewById(R.id.editnum7);
        okbtn = (Button)findViewById(R.id.cfbtn);
        clbtn = (Button)findViewById(R.id.clbtn);
        okbtn.setSoundEffectsEnabled(false);
        clbtn.setSoundEffectsEnabled(false);

        okbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addStr = editnum1.getText().toString() + editnum2.getText().toString() + editnum3.getText().toString()
                        + editnum4.getText().toString() + editnum5.getText().toString() + editnum6.getText().toString()
                        + editnum7.getText().toString();
                dismiss();
            }
        });
        clbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addStr = "1";
                dismiss();
            }
        });
    }

    public void onBackPressed() {
    }

    public String getAddStr(){
        return addStr;
    }
}