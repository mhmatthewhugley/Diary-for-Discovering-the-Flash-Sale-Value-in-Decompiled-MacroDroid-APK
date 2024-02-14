package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfpz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzf extends zzfpz {
    public zzf(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20352a(Message message) {
        try {
            super.mo20352a(message);
        } catch (Throwable th) {
            zzt.m2905r();
            zzs.m2758i(zzt.m2904q().mo43490c(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzt.m2904q().mo43503t(e, "AdMobHandler.handleMessage");
        }
    }
}
