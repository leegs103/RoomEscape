package com.example.user.roomescape;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class hint3 extends Dialog implements View.OnClickListener{
    ImageView img3;
    public hint3(Context context){
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        this.setCanceledOnTouchOutside(false);
        setContentView(R.layout.hint_3);
        img3 = (ImageView)findViewById(R.id.img3);
        img3.setOnClickListener(this);
    }
    public void onClick(View v){
        dismiss();
    }
}
