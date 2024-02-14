package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zztr implements zzwc {

    /* renamed from: a */
    public long f38562a;

    /* renamed from: b */
    public long f38563b;
    @Nullable

    /* renamed from: c */
    public zzwb f38564c;
    @Nullable

    /* renamed from: d */
    public zztr f38565d;

    public zztr(long j, int i) {
        mo48221e(j, 65536);
    }

    /* renamed from: a */
    public final zzwb mo48217a() {
        zzwb zzwb = this.f38564c;
        Objects.requireNonNull(zzwb);
        return zzwb;
    }

    /* renamed from: b */
    public final int mo48218b(long j) {
        long j2 = this.f38562a;
        int i = this.f38564c.f38767b;
        return (int) (j - j2);
    }

    /* renamed from: c */
    public final zztr mo48219c() {
        this.f38564c = null;
        zztr zztr = this.f38565d;
        this.f38565d = null;
        return zztr;
    }

    @Nullable
    /* renamed from: d */
    public final zzwc mo48220d() {
        zztr zztr = this.f38565d;
        if (zztr == null || zztr.f38564c == null) {
            return null;
        }
        return zztr;
    }

    /* renamed from: e */
    public final void mo48221e(long j, int i) {
        zzdd.m47212f(this.f38564c == null);
        this.f38562a = j;
        this.f38563b = j + 65536;
    }
}
