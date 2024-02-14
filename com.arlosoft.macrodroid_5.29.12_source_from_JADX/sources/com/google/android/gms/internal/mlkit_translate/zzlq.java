package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzlq {

    /* renamed from: a */
    private final String f44235a;

    /* renamed from: b */
    private final String f44236b = null;

    /* renamed from: c */
    private final zzlo f44237c;

    /* renamed from: d */
    private final String f44238d;

    /* renamed from: e */
    private final String f44239e;

    /* renamed from: f */
    private final zzln f44240f;

    /* renamed from: g */
    private final Long f44241g;

    /* renamed from: h */
    private final Boolean f44242h;

    /* renamed from: i */
    private final Boolean f44243i;

    /* synthetic */ zzlq(zzlm zzlm, zzlp zzlp) {
        this.f44235a = zzlm.f44214a;
        this.f44237c = zzlm.f44215b;
        this.f44238d = null;
        this.f44239e = zzlm.f44216c;
        this.f44240f = zzlm.f44217d;
        this.f44241g = null;
        this.f44242h = null;
        this.f44243i = null;
    }

    @Nullable
    @zzbg(zza = 6)
    /* renamed from: a */
    public final zzln mo52280a() {
        return this.f44240f;
    }

    @Nullable
    @zzbg(zza = 3)
    /* renamed from: b */
    public final zzlo mo52281b() {
        return this.f44237c;
    }

    @Nullable
    @zzbg(zza = 5)
    /* renamed from: c */
    public final String mo52282c() {
        return this.f44239e;
    }

    @Nullable
    @zzbg(zza = 1)
    /* renamed from: d */
    public final String mo52283d() {
        return this.f44235a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlq)) {
            return false;
        }
        zzlq zzlq = (zzlq) obj;
        return Objects.m4470a(this.f44235a, zzlq.f44235a) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a(this.f44237c, zzlq.f44237c) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a(this.f44239e, zzlq.f44239e) && Objects.m4470a(this.f44240f, zzlq.f44240f) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null) && Objects.m4470a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44235a, null, this.f44237c, null, this.f44239e, this.f44240f, null, null, null);
    }
}
