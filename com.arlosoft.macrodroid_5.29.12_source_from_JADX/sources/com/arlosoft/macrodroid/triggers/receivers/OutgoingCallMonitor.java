package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.utils.C6398k0;

public class OutgoingCallMonitor extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C6398k0.f15004a = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
    }
}
