package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.legacy.content.WakefulBroadcastReceiver;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.triggers.services.CallEndedCheckerService;

public class CallEndedTriggerReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static long f14354a;

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("state");
        if (stringExtra != null && stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f14354a > WorkRequest.MIN_BACKOFF_MILLIS) {
                f14354a = currentTimeMillis;
                Intent intent2 = new Intent(context, CallEndedCheckerService.class);
                intent2.putExtra("state", intent.getStringExtra("state"));
                WakefulBroadcastReceiver.startWakefulService(context, intent2);
            }
        }
    }
}
