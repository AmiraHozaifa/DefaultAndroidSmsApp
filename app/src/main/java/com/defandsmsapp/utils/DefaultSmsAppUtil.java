package com.defandsmsapp.utils;

import android.content.Context;
import android.provider.Telephony;

/**
 * Created by wgwj4809 on 02/08/17.
 */

public class DefaultSmsAppUtil {

    private static final String pckgName = "com.defandsmsapp";

    public static boolean isDefaultSmsApp (Context context){
        String defaultSmsApp = Telephony.Sms.getDefaultSmsPackage(context);
        return defaultSmsApp.equals(pckgName);
    }
}
