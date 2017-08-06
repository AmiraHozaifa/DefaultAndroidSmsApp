package com.defandsmsapp.contentprovider;

import android.content.ContentValues;
import android.content.Context;
import android.provider.Telephony;
import android.telephony.SmsMessage;

/**
 * Created by wgwj4809 on 01/08/17.
 */

public class MessagesContentProviderHandler {

    public static void addReceivedMessageToContentProvider(Context context, SmsMessage smsMessage) {

        ContentValues values = new ContentValues();
        values.put(Telephony.Sms.ADDRESS, smsMessage.getDisplayOriginatingAddress());
        values.put(Telephony.Sms.BODY, smsMessage.getMessageBody());
        context.getApplicationContext().getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, values);
    }

    public static void addSentMessageToContentProvider(Context context, SmsMessage smsMessage) {
        ContentValues values = new ContentValues();
        values.put(Telephony.Sms.ADDRESS, smsMessage.getDisplayOriginatingAddress());
        values.put(Telephony.Sms.BODY, smsMessage.getMessageBody());
        context.getApplicationContext().getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, values);
    }
}
