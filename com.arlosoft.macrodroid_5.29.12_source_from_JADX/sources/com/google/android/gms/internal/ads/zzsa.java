package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzsa implements zzsg, zzsf {

    /* renamed from: a */
    public final zzsi f38399a;

    /* renamed from: c */
    private final long f38400c;

    /* renamed from: d */
    private zzsk f38401d;

    /* renamed from: f */
    private zzsg f38402f;
    @Nullable

    /* renamed from: g */
    private zzsf f38403g;

    /* renamed from: o */
    private long f38404o = -9223372036854775807L;

    /* renamed from: p */
    private final zzwi f38405p;

    public zzsa(zzsi zzsi, zzwi zzwi, long j, byte[] bArr) {
        this.f38399a = zzsi;
        this.f38405p = zzwi;
        this.f38400c = j;
    }

    /* renamed from: t */
    private final long m54831t(long j) {
        long j2 = this.f38404o;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        zzsg.mo48128F(j);
    }

    /* renamed from: a */
    public final long mo48129a() {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48129a();
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        zzsg zzsg = this.f38402f;
        return zzsg != null && zzsg.mo48130b(j);
    }

    /* renamed from: c */
    public final long mo48131c(zzvt[] zzvtArr, boolean[] zArr, zztz[] zztzArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f38404o;
        if (j3 == -9223372036854775807L || j != this.f38400c) {
            j2 = j;
        } else {
            this.f38404o = -9223372036854775807L;
            j2 = j3;
        }
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48131c(zzvtArr, zArr, zztzArr, zArr2, j2);
    }

    /* renamed from: d */
    public final long mo48132d() {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48132d();
    }

    /* renamed from: e */
    public final zzuh mo48133e() {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48133e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo47685f(zzub zzub) {
        zzsg zzsg = (zzsg) zzub;
        zzsf zzsf = this.f38403g;
        int i = zzen.f34500a;
        zzsf.mo47685f(this);
    }

    /* renamed from: g */
    public final void mo47686g(zzsg zzsg) {
        zzsf zzsf = this.f38403g;
        int i = zzen.f34500a;
        zzsf.mo47686g(this);
    }

    /* renamed from: h */
    public final long mo48149h() {
        return this.f38404o;
    }

    /* renamed from: i */
    public final void mo48135i() throws IOException {
        try {
            zzsg zzsg = this.f38402f;
            if (zzsg != null) {
                zzsg.mo48135i();
                return;
            }
            zzsk zzsk = this.f38401d;
            if (zzsk != null) {
                zzsk.mo48143K();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public final long mo48150j() {
        return this.f38400c;
    }

    /* renamed from: k */
    public final void mo48151k(zzsi zzsi) {
        long t = m54831t(this.f38400c);
        zzsk zzsk = this.f38401d;
        Objects.requireNonNull(zzsk);
        zzsg g = zzsk.mo48160g(zzsi, this.f38405p, t);
        this.f38402f = g;
        if (this.f38403g != null) {
            g.mo48141q(this, t);
        }
    }

    /* renamed from: l */
    public final long mo48137l(long j, zzkd zzkd) {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48137l(j, zzkd);
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        zzsg zzsg = this.f38402f;
        return zzsg != null && zzsg.mo48138m();
    }

    /* renamed from: n */
    public final long mo48139n(long j) {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.mo48139n(j);
    }

    /* renamed from: o */
    public final void mo48140o(long j, boolean z) {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        zzsg.mo48140o(j, false);
    }

    /* renamed from: p */
    public final void mo48152p(long j) {
        this.f38404o = j;
    }

    /* renamed from: q */
    public final void mo48141q(zzsf zzsf, long j) {
        this.f38403g = zzsf;
        zzsg zzsg = this.f38402f;
        if (zzsg != null) {
            zzsg.mo48141q(this, m54831t(this.f38400c));
        }
    }

    /* renamed from: r */
    public final void mo48153r() {
        zzsg zzsg = this.f38402f;
        if (zzsg != null) {
            zzsk zzsk = this.f38401d;
            Objects.requireNonNull(zzsk);
            zzsk.mo48159c(zzsg);
        }
    }

    /* renamed from: s */
    public final void mo48154s(zzsk zzsk) {
        zzdd.m47212f(this.f38401d == null);
        this.f38401d = zzsk;
    }

    public final long zzb() {
        zzsg zzsg = this.f38402f;
        int i = zzen.f34500a;
        return zzsg.zzb();
    }
}
