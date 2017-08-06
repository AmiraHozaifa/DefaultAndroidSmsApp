package com.defandsmsapp.messagerecieve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

import com.defandsmsapp.contentprovider.MessagesContentProviderHandler;
import com.defandsmsapp.utils.DefaultSmsAppUtil;

/**
 * Created by wgwj4809 on 01/08/17.
 */

public class MMSBroadcastReceiver extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";

    public void onReceive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();

    }
}
