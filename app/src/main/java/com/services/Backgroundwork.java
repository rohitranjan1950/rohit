package com.services;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Admin on 22-07-2018.
 */

public class Backgroundwork extends Service {

    MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        player=MediaPlayer.create(this,R.raw.guiter);

        player.start();

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();



    }
}
