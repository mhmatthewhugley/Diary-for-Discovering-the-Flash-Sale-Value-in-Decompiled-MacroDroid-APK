package com.google.firebase.crashlytics.internal.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.Logger;

class BatteryState {

    /* renamed from: a */
    private final Float f4876a;

    /* renamed from: b */
    private final boolean f4877b;

    private BatteryState(Float f, boolean z) {
        this.f4877b = z;
        this.f4876a = f;
    }

    /* renamed from: a */
    public static BatteryState m6561a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m6563e(registerReceiver);
                f = m6562d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            Logger.m6525f().mo22957e("An error occurred getting battery state.", e);
        }
        return new BatteryState(f, z);
    }

    /* renamed from: d */
    private static Float m6562d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m6563e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo22974b() {
        return this.f4876a;
    }

    /* renamed from: c */
    public int mo22975c() {
        Float f;
        if (!this.f4877b || (f = this.f4876a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
