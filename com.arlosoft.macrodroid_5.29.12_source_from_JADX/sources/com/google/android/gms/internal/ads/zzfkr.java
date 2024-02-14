package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfkr {
    /* renamed from: a */
    public static zzfkr m50423a(zzfks zzfks, zzfkt zzfkt) {
        if (zzfkp.m50420b()) {
            return new zzfkv(zzfks, zzfkt);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo45866b(View view, zzfkx zzfkx, @Nullable String str);

    /* renamed from: c */
    public abstract void mo45867c();

    /* renamed from: d */
    public abstract void mo45868d(View view);

    /* renamed from: e */
    public abstract void mo45869e();
}
