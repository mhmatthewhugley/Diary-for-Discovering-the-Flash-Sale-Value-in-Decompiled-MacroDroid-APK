package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgy implements zzji {

    /* renamed from: a */
    private final zzkg f37429a;

    /* renamed from: c */
    private final zzgx f37430c;
    @Nullable

    /* renamed from: d */
    private zzka f37431d;
    @Nullable

    /* renamed from: f */
    private zzji f37432f;

    /* renamed from: g */
    private boolean f37433g = true;

    /* renamed from: o */
    private boolean f37434o;

    public zzgy(zzgx zzgx, zzde zzde) {
        this.f37430c = zzgx;
        this.f37429a = new zzkg(zzde);
    }

    /* renamed from: a */
    public final zzby mo47609a() {
        zzji zzji = this.f37432f;
        return zzji != null ? zzji.mo47609a() : this.f37429a.mo47609a();
    }

    /* renamed from: b */
    public final long mo47610b(boolean z) {
        zzka zzka = this.f37431d;
        if (zzka == null || zzka.mo47772T() || (!this.f37431d.mo47771M() && (z || this.f37431d.mo47303J()))) {
            this.f37433g = true;
            if (this.f37434o) {
                this.f37429a.mo47798c();
            }
        } else {
            zzji zzji = this.f37432f;
            Objects.requireNonNull(zzji);
            long zza = zzji.zza();
            if (this.f37433g) {
                if (zza < this.f37429a.zza()) {
                    this.f37429a.mo47799d();
                } else {
                    this.f37433g = false;
                    if (this.f37434o) {
                        this.f37429a.mo47798c();
                    }
                }
            }
            this.f37429a.mo47797b(zza);
            zzby a = zzji.mo47609a();
            if (!a.equals(this.f37429a.mo47609a())) {
                this.f37429a.mo47614f(a);
                this.f37430c.mo47591a(a);
            }
        }
        if (this.f37433g) {
            return this.f37429a.zza();
        }
        zzji zzji2 = this.f37432f;
        Objects.requireNonNull(zzji2);
        return zzji2.zza();
    }

    /* renamed from: c */
    public final void mo47611c(zzka zzka) {
        if (zzka == this.f37431d) {
            this.f37432f = null;
            this.f37431d = null;
            this.f37433g = true;
        }
    }

    /* renamed from: d */
    public final void mo47612d(zzka zzka) throws zzha {
        zzji zzji;
        zzji g = zzka.mo47315g();
        if (g != null && g != (zzji = this.f37432f)) {
            if (zzji == null) {
                this.f37432f = g;
                this.f37431d = zzka;
                g.mo47614f(this.f37429a.mo47609a());
                return;
            }
            throw zzha.m53677d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    /* renamed from: e */
    public final void mo47613e(long j) {
        this.f37429a.mo47797b(j);
    }

    /* renamed from: f */
    public final void mo47614f(zzby zzby) {
        zzji zzji = this.f37432f;
        if (zzji != null) {
            zzji.mo47614f(zzby);
            zzby = this.f37432f.mo47609a();
        }
        this.f37429a.mo47614f(zzby);
    }

    /* renamed from: g */
    public final void mo47615g() {
        this.f37434o = true;
        this.f37429a.mo47798c();
    }

    /* renamed from: h */
    public final void mo47616h() {
        this.f37434o = false;
        this.f37429a.mo47799d();
    }

    public final long zza() {
        throw null;
    }
}
