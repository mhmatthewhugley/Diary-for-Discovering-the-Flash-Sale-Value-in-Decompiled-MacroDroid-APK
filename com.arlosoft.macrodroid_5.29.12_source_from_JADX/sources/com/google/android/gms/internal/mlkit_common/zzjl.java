package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzjl {

    /* renamed from: a */
    private final String f42968a;

    /* renamed from: b */
    private final String f42969b = null;

    /* renamed from: c */
    private final zzjj f42970c;

    /* renamed from: d */
    private final String f42971d;

    /* renamed from: e */
    private final String f42972e;

    /* renamed from: f */
    private final zzji f42973f;

    /* renamed from: g */
    private final Long f42974g;

    /* renamed from: h */
    private final Boolean f42975h;

    /* renamed from: i */
    private final Boolean f42976i;

    /* synthetic */ zzjl(zzjh zzjh, zzjk zzjk) {
        this.f42968a = zzjh.f42947a;
        this.f42970c = zzjh.f42948b;
        this.f42971d = null;
        this.f42972e = zzjh.f42949c;
        this.f42973f = zzjh.f42950d;
        this.f42974g = null;
        this.f42975h = null;
        this.f42976i = null;
    }

    @Nullable
    @zzbl(zza = 6)
    /* renamed from: a */
    public final zzji mo51915a() {
        return this.f42973f;
    }

    @Nullable
    @zzbl(zza = 3)
    /* renamed from: b */
    public final zzjj mo51916b() {
        return this.f42970c;
    }

    @Nullable
    @zzbl(zza = 5)
    /* renamed from: c */
    public final String mo51917c() {
        return this.f42972e;
    }

    @Nullable
    @zzbl(zza = 1)
    /* renamed from: d */
    public final String mo51918d() {
        return this.f42968a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjl = (zzjl) obj;
        return Objects.m4470a(this.f42968a, zzjl.f42968a) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a(this.f42970c, zzjl.f42970c) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a(this.f42972e, zzjl.f42972e) && Objects.m4470a(this.f42973f, zzjl.f42973f) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f42968a, null, this.f42970c, null, this.f42972e, this.f42973f, null, null, null);
    }
}
