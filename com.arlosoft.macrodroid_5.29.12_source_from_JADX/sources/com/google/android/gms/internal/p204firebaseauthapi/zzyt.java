package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzyt extends BroadcastReceiver {

    /* renamed from: a */
    private final String f40658a;

    /* renamed from: b */
    final /* synthetic */ zzyv f40659b;

    public zzyt(zzyv zzyv, String str) {
        this.f40659b = zzyv;
        this.f40658a = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).mo21294n2() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzyu zzyu = (zzyu) this.f40659b.f40672c.get(this.f40658a);
                if (zzyu == null) {
                    zzyv.f40669d.mo21839c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String b = zzyv.m58495b(str);
                    zzyu.f40664e = b;
                    if (b == null) {
                        zzyv.f40669d.mo21839c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.m56870d(zzyu.f40663d)) {
                        zzyv.m58497e(this.f40659b, this.f40658a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
