package com.example.user.roomescape;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourth extends AppCompatActivity {
    SoundPool pool;
    int sound1;
    int sound2;
    int sound3;
    private static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound1 = pool.load(this, R.raw.re_footwalk, 1);
        sound2 = pool.load(this, R.raw.hint_3, 1);
        sound3 = pool.load(this, R.raw.problem_3, 1);

        mp = MediaPlayer.create(this, R.raw.re_bgm4);
        mp.setLooping(true);
        mp.setVolume(1.0F, 1.0F);
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
        finish();
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void moveThird(View v){
        pool.play(sound1, 1.0F, 1.0F, 0, 0, 1.0F);
        Intent i = new Intent(this, third.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void hint3Click(View v){
        pool.play(sound2, 1.0F, 1.0F, 0, 0, 1.0F);
        hint3 dialog = new hint3(this);
        dialog.show();
    }

    public void hint4Click(View v){
        pool.play(sound3, 1.0F, 1.0F, 0, 0, 1.0F);
        hint4 dialog = new hint4(this);
        dialog.show();
    }
}