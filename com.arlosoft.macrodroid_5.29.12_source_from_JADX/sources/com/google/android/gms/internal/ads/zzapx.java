package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapx extends BroadcastReceiver {

    /* renamed from: a */
    private boolean f25275a = true;

    zzapx(@NonNull Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41795a() {
        return this.f25275a;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f25275a = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f25275a = false;
        }
    }
}
