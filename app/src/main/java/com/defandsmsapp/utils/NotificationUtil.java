package com.defandsmsapp.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;

import com.defandsmsapp.MainActivity;
import com.defandsmsapp.R;


/**
 * Created by wgwj4809 on 02/08/17.
 */

public class NotificationUtil {
    public static void showNotification (Context aoContext, String text){

        Intent aoIntent = new Intent(aoContext, MainActivity.class);
        PendingIntent _contentIntent = PendingIntent.getActivity(aoContext, 0, aoIntent, 0);
        NotificationManager _notificationManager = (NotificationManager) aoContext.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder _notifBuilder = new NotificationCompat.Builder(aoContext);

        _notifBuilder.setContentTitle("Message")
                .setContentText(text).setSmallIcon(R.mipmap.ic_launcher)
//                .setStyle(new NotificationCompat.BigTextStyle().bigText(aoPayload.getMessage()))
                .setAutoCancel(true)
                .setVisibility(Notification.VISIBILITY_PUBLIC);

        _notifBuilder.setContentIntent(_contentIntent);
//        NotificationManager _notificationManager = (NotificationManager) aoContext.getSystemService(Context.NOTIFICATION_SERVICE);
        _notificationManager.notify(0, _notifBuilder.build());


    }
}
