package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.triggers.services.OutgoingCallCheckerService;

public class OutgoingCallTriggerReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static long f14366a;

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f14366a > WorkRequest.MIN_BACKOFF_MILLIS) {
            f14366a = currentTimeMillis;
            Intent intent2 = new Intent(context, OutgoingCallCheckerService.class);
            intent2.putExtra("PhoneNumber", stringExtra);
            WakefulBroadcastReceiver.startWakefulService(context, intent2);
        }
    }
}
