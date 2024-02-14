package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zznb {

    /* renamed from: b */
    public static final zznb f37936b = (zzen.f34500a < 31 ? new zznb() : new zznb(zzna.f37934b));
    @Nullable

    /* renamed from: a */
    private final zzna f37937a;

    public zznb() {
        this.f37937a = null;
        zzdd.m47212f(zzen.f34500a < 31);
    }

    private zznb(@Nullable zzna zzna) {
        this.f37937a = zzna;
    }

    @RequiresApi(31)
    /* renamed from: a */
    public final LogSessionId mo47866a() {
        zzna zzna = this.f37937a;
        Objects.requireNonNull(zzna);
        return zzna.f37935a;
    }

    @RequiresApi(31)
    public zznb(LogSessionId logSessionId) {
        this.f37937a = new zzna(logSessionId);
    }
}
