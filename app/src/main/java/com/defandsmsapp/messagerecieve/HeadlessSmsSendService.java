package com.defandsmsapp.messagerecieve;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/**
 * Created by wgwj4809 on 02/08/17.
 */

public class HeadlessSmsSendService extends IntentService {

    public HeadlessSmsSendService(){
        super("");
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            if (TelephonyManager.ACTION_RESPOND_VIA_MESSAGE.equals(intent.getAction())) {
//                String num = intent.getDataString();
//                num = num.replace("smsto:", "").replace("sms:", "");
//                String msg = intent.getStringExtra(Intent.EXTRA_TEXT);
//                // send the data to via intent
//                Intent intentService = new Intent(this, SomeClass.class);
//                startService(intentService);
            }
        }
    }

}
