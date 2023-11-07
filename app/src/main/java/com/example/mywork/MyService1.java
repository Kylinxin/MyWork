package com.example.mywork;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import java.util.List;

public class MyService1 extends Service {
    MediaPlayer player;
    int[] musics={
            R.raw.music1,
            R.raw.music2
    };
    public MyService1() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("fb","MyService1:onCreate...");
        player = MediaPlayer.create(this, musics[0]);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("fb","MyService1:onStartCommand...");
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        player.stop();
        player.release();
        super.onDestroy();
        Log.d("fb","MyService1:onDestroy...");
    }
}