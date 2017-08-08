package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class hint1 extends Dialog implements View.OnClickListener{
    ImageView img1;
    public hint1(Context context){
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.hint_1);
        img1 = (ImageView)findViewById(R.id.img1);
        img1.setOnClickListener(this);
    }
    public void onClick(View v){
        dismiss();
    }
}
