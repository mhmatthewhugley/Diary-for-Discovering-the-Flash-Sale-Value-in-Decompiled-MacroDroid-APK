package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.triggers.services.LocalePluginCheckerService;
import p337nc.C15785a;

public class LocalePluginTriggerReceiver extends WakefulBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.twofortyfouram.locale.intent.extra.ACTIVITY");
        if (stringExtra != null) {
            Intent intent2 = new Intent(context, LocalePluginCheckerService.class);
            intent2.putExtra("com.twofortyfouram.locale.intent.extra.ACTIVITY", stringExtra);
            Bundle c = C15785a.C15786a.m95314c(intent);
            if (c != null) {
                C15785a.C15786a.m95312a(intent2, c);
            }
            WakefulBroadcastReceiver.startWakefulService(context, intent2);
        }
    }
}
