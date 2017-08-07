package com.defandsmsapp.messagerecieve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import com.defandsmsapp.contentprovider.MessagesContentProviderHandler;
import com.defandsmsapp.utils.DefaultSmsAppUtil;
import com.defandsmsapp.utils.NotificationUtil;

/**
 * Created by wgwj4809 on 01/08/17.
 */

public class SmsBroadcastReceiver extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";

    public void onReceive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();

        if (intentExtras != null) {
            Object[] sms = (Object[]) intentExtras.get(SMS_BUNDLE);
//            String smsMessageStr = "";
            for (int i = 0; i < sms.length; ++i) {
                String format = intentExtras.getString("format");
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[i], format);
                if (DefaultSmsAppUtil.isDefaultSmsApp(context)) {
                    MessagesContentProviderHandler.addReceivedMessageToContentProvider(context, smsMessage.getMessageBody(),smsMessage.getDisplayOriginatingAddress());
//                    Toast.makeText(context , "Message received : " + smsMessage.getMessageBody() , Toast.LENGTH_LONG).show();
                    NotificationUtil.showNotification(context , smsMessage.getMessageBody());

                }
            }

        }
    }
}
