package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class hint2 extends Dialog implements View.OnClickListener{
    ImageView img2;
    public hint2(Context context){
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.hint_2);
        img2 = (ImageView)findViewById(R.id.img2);
        img2.setOnClickListener(this);
    }
    public void onClick(View v){
        dismiss();
    }
}