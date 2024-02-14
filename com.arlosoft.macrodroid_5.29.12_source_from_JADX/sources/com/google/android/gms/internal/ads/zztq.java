package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zztq extends zzrj implements zzth {

    /* renamed from: h */
    private final zzbg f38550h;

    /* renamed from: i */
    private final zzay f38551i;

    /* renamed from: j */
    private final zzew f38552j;

    /* renamed from: k */
    private final zzpq f38553k;

    /* renamed from: l */
    private final int f38554l;

    /* renamed from: m */
    private boolean f38555m = true;

    /* renamed from: n */
    private long f38556n = -9223372036854775807L;

    /* renamed from: o */
    private boolean f38557o;

    /* renamed from: p */
    private boolean f38558p;
    @Nullable

    /* renamed from: q */
    private zzfz f38559q;

    /* renamed from: r */
    private final zztn f38560r;

    /* renamed from: s */
    private final zzwm f38561s;

    /* synthetic */ zztq(zzbg zzbg, zzew zzew, zztn zztn, zzpq zzpq, zzwm zzwm, int i, zztp zztp, byte[] bArr) {
        zzay zzay = zzbg.f26759b;
        Objects.requireNonNull(zzay);
        this.f38551i = zzay;
        this.f38550h = zzbg;
        this.f38552j = zzew;
        this.f38560r = zztn;
        this.f38553k = zzpq;
        this.f38561s = zzwm;
        this.f38554l = i;
    }

    /* renamed from: x */
    private final void m55048x() {
        long j = this.f38556n;
        boolean z = this.f38557o;
        boolean z2 = this.f38558p;
        zzbg zzbg = this.f38550h;
        zzud zzud = r1;
        zzud zzud2 = new zzud(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzbg, z2 ? zzbg.f26761d : null);
        mo48113t(this.f38555m ? new zztm(this, zzud) : zzud);
    }

    /* renamed from: I */
    public final zzbg mo48158I() {
        return this.f38550h;
    }

    /* renamed from: K */
    public final void mo48143K() {
    }

    /* renamed from: b */
    public final void mo48197b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f38556n;
        }
        if (this.f38555m || this.f38556n != j || this.f38557o != z || this.f38558p != z2) {
            this.f38556n = j;
            this.f38557o = z;
            this.f38558p = z2;
            this.f38555m = false;
            m55048x();
        }
    }

    /* renamed from: c */
    public final void mo48159c(zzsg zzsg) {
        ((zztl) zzsg).mo48213y();
    }

    /* renamed from: g */
    public final zzsg mo48160g(zzsi zzsi, zzwi zzwi, long j) {
        zzex zza = this.f38552j.zza();
        zzfz zzfz = this.f38559q;
        if (zzfz != null) {
            zza.mo43952k(zzfz);
        }
        Uri uri = this.f38551i.f26234a;
        zztn zztn = this.f38560r;
        mo48105l();
        zzrl zzrl = new zzrl(zztn.f38544a);
        zzpq zzpq = this.f38553k;
        zzpk m = mo48106m(zzsi);
        zzwm zzwm = this.f38561s;
        zzsr o = mo48108o(zzsi);
        String str = this.f38551i.f26239f;
        return new zztl(uri, zza, zzrl, zzpq, m, zzwm, o, this, zzwi, (String) null, this.f38554l, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo48112s(@Nullable zzfz zzfz) {
        this.f38559q = zzfz;
        Objects.requireNonNull(Looper.myLooper());
        mo48105l();
        m55048x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo48115v() {
    }
}
