package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;


public class AlertReceiver extends BroadcastReceiver {

    MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context,
                Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.start();
    }

}
