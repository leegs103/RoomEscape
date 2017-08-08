package com.example.user.roomescape;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class second extends AppCompatActivity {
    SoundPool pool;
    int sound1;
    int sound2;
    private static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound1 = pool.load(this, R.raw.re_footwalk, 1);
        sound2 = pool.load(this, R.raw.hint_1, 1);
        mp = MediaPlayer.create(this, R.raw.re_bgm2);
        mp.setLooping(true);
        mp.setVolume(0.5F, 0.5F);
        mp.start();

    }

    protected void onUserLeaveHint(){
        mp.pause();
        super.onUserLeaveHint();
    }

    public void onResume(){
        mp.start();
        super.onResume();
    }

    public void onDestroy(){
        mp.stop();
        super.onDestroy();
    }

    public void onBackPressed() {
    }

    public void backHome(View v){
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void moveFirst(View v) {
        pool.play(sound1, 1.0F, 1.0F, 1, 0, 1.0F);
        Intent i = new Intent(this, first.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void hint1Click(View v){
        pool.play(sound2, 1.0F, 1.0F, 0, 0, 1.0F);
        hint1 dialog = new hint1(this);
        dialog.show();
    }

    public void hint5Click(View v){
        pool.play(sound2, 1.0F, 1.0F, 0, 0, 1.0F);
        hint5 dialog = new hint5(this);
        dialog.show();
    }
}
