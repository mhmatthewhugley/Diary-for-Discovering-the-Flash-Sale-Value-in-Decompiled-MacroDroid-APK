package com.arlosoft.macrodroid.action.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SMSRetryReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        SMSOutputService2.m14460d(context2, intent.getStringExtra("message"), intent.getStringExtra("destination"), intent.getBooleanExtra("AddToMessageLogExtra", false), 1 + intent.getIntExtra("attempt_number", 1), intent.getIntExtra("SimId", 0));
    }
}
