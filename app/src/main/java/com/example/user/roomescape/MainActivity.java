package com.example.user.roomescape;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SoundPool pool;
    int sound1;
    private static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.re_bgm1);
        mp.setLooping(true);
        mp.start();
        mp.setVolume(0.5F, 0.5F);

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound1 = pool.load(this, R.raw.re_footwalk, 1);

        Button btnstart = (Button)findViewById(R.id.btn1);
        Button btnexit = (Button)findViewById(R.id.btn2);
        Button btninfo = (Button)findViewById(R.id.btn3);

        btninfo.setOnClickListener(this);
        btnexit.setOnClickListener(this);
        btnstart.setOnClickListener(this);

        btninfo.setSoundEffectsEnabled(false);
        btnstart.setSoundEffectsEnabled(false);
        btnexit.setSoundEffectsEnabled(false);

    }

    protected void onUserLeaveHint() {
        mp.pause();
        super.onUserLeaveHint();
    }

    public void onResume() {
        mp.start();
        super.onResume();
    }

    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }

    public void onBackPressed() {
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(this, first.class);
                pool.play(sound1, 1.0F, 1.0F, 0, 0, 1.0F);
                startActivity(intent);
                break;

            case R.id.btn2:
                moveTaskToBack(true);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
                break;

            case R.id.btn3:
                Intent i = new Intent(this, main_story.class);
                startActivity(i);
                break;
        }
    }
}
