package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CameraButtonTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        abortBroadcast();
    }
}
