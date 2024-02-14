package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.triggers.services.IncomingSMSCheckerService;

public class IncomingSMSTriggerReceiver extends WakefulBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(context, IncomingSMSCheckerService.class);
        if (intent != null && intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
            WakefulBroadcastReceiver.startWakefulService(context, intent2);
        }
    }
}
