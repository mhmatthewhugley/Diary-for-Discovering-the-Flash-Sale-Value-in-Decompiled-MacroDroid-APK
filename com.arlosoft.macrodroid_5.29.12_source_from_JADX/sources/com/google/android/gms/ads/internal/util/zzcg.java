package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcg {

    /* renamed from: a */
    private final BroadcastReceiver f2246a = new zzcf(this);

    /* renamed from: b */
    private final Map f2247b = new WeakHashMap();

    /* renamed from: c */
    private boolean f2248c = false;

    /* renamed from: d */
    private boolean f2249d;

    /* renamed from: e */
    private Context f2250e;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m2630e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2247b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    /* renamed from: b */
    public final synchronized void mo20344b(Context context) {
        if (!this.f2248c) {
            Context applicationContext = context.getApplicationContext();
            this.f2250e = applicationContext;
            if (applicationContext == null) {
                this.f2250e = context;
            }
            zzbjc.m43542c(this.f2250e);
            this.f2249d = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27028W2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f2250e.registerReceiver(this.f2246a, intentFilter);
            } else {
                this.f2250e.registerReceiver(this.f2246a, intentFilter, 4);
            }
            this.f2248c = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo20345c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f2249d) {
            this.f2247b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbjc.m43542c(context);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* renamed from: d */
    public final synchronized void mo20346d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f2249d) {
            this.f2247b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
