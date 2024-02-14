package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzgu {

    /* renamed from: a */
    final Context f46912a;
    @Nullable

    /* renamed from: b */
    String f46913b;
    @Nullable

    /* renamed from: c */
    String f46914c;
    @Nullable

    /* renamed from: d */
    String f46915d;
    @Nullable

    /* renamed from: e */
    Boolean f46916e;

    /* renamed from: f */
    long f46917f;
    @Nullable

    /* renamed from: g */
    zzcl f46918g;

    /* renamed from: h */
    boolean f46919h = true;
    @Nullable

    /* renamed from: i */
    final Long f46920i;
    @Nullable

    /* renamed from: j */
    String f46921j;

    @VisibleForTesting
    public zzgu(Context context, @Nullable zzcl zzcl, @Nullable Long l) {
        Preconditions.m4488k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m4488k(applicationContext);
        this.f46912a = applicationContext;
        this.f46920i = l;
        if (zzcl != null) {
            this.f46918g = zzcl;
            this.f46913b = zzcl.f41311o;
            this.f46914c = zzcl.f41310g;
            this.f46915d = zzcl.f41309f;
            this.f46919h = zzcl.f41308d;
            this.f46917f = zzcl.f41307c;
            this.f46921j = zzcl.f41313s;
            Bundle bundle = zzcl.f41312p;
            if (bundle != null) {
                this.f46916e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
