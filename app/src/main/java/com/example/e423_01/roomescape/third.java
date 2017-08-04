package kr.co.company.roomescape.roomescape;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.e423_01.roomescape.R;
import com.example.e423_01.roomescape.fourth;

public class third extends AppCompatActivity {
    SoundPool pool;
    int sound1;
    int sound2;
    private static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound1 = pool.load(this, R.raw.re_footwalk, 1);
        sound2 = pool.load(this, R.raw.hint_2, 1);

        mp = MediaPlayer.create(this, R.raw.re_bgm3);
        mp.setLooping(true);
        mp.setVolume(0.1F, 0.1F);
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

    @Override
    public void onBackPressed() {
    }

    public void backHome(View v){
        Intent i = new Intent(this, startescape.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void moveFirst(View v){
        pool.play(sound1, 1.0F, 1.0F, 0, 0, 1.0F);
        Intent i = new Intent(this, first.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void moveFourth(View v) {
        pool.play(sound1, 1.0F, 1.0F, 0, 0, 1.0F);
        Intent i = new Intent(this, fourth.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void hint2Click(View v){
        pool.play(sound2, 1.0F, 1.0F, 0, 0, 1.0F);
        hint2 dialog = new hint2(this);
        dialog.show();
    }

    public void hint6Click(View v){
        pool.play(sound2, 1.0F, 1.0F, 0, 0, 1.0F);
        hint6 dialog = new hint6(this);
        dialog.show();
    }
}