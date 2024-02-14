package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbji {
    /* renamed from: a */
    public static final void m43559a(zzbjh zzbjh, @Nullable zzbjf zzbjf) {
        if (zzbjf.mo42668a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzbjf.mo42669b())) {
            zzbjh.mo42675d(zzbjf.mo42668a(), zzbjf.mo42669b(), zzbjf.mo42670c(), zzbjf.mo42671d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
