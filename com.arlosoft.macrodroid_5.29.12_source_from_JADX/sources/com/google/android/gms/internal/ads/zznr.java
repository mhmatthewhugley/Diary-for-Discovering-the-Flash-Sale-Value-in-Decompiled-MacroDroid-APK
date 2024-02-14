package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zznr {
    @Nullable

    /* renamed from: a */
    private final Handler f37975a;
    @Nullable

    /* renamed from: b */
    private final zzns f37976b;

    public zznr(@Nullable Handler handler, @Nullable zzns zzns) {
        this.f37975a = zzns == null ? null : handler;
        this.f37976b = zzns;
    }

    /* renamed from: a */
    public final void mo47891a(Exception exc) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznh(this, exc));
        }
    }

    /* renamed from: b */
    public final void mo47892b(Exception exc) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznn(this, exc));
        }
    }

    /* renamed from: c */
    public final void mo47893c(String str, long j, long j2) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznm(this, str, j, j2));
        }
    }

    /* renamed from: d */
    public final void mo47894d(String str) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zzno(this, str));
        }
    }

    /* renamed from: e */
    public final void mo47895e(zzgs zzgs) {
        zzgs.mo47387a();
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zzni(this, zzgs));
        }
    }

    /* renamed from: f */
    public final void mo47896f(zzgs zzgs) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznj(this, zzgs));
        }
    }

    /* renamed from: g */
    public final void mo47897g(zzaf zzaf, @Nullable zzgt zzgt) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznp(this, zzaf, zzgt));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo47898h(Exception exc) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47627f(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo47899i(Exception exc) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47624c(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo47900j(String str, long j, long j2) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47635l(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo47901k(String str) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47630h0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo47902l(zzgs zzgs) {
        zzgs.mo47387a();
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47621a(zzgs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo47903m(zzgs zzgs) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47623b(zzgs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo47904n(zzaf zzaf, zzgt zzgt) {
        int i = zzen.f34500a;
        this.f37976b.mo47625d(zzaf, zzgt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo47905o(long j) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47626e(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo47906p(boolean z) {
        zzns zzns = this.f37976b;
        int i = zzen.f34500a;
        zzns.mo47632i1(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo47907q(int i, long j, long j2) {
        zzns zzns = this.f37976b;
        int i2 = zzen.f34500a;
        zzns.mo47636m(i, j, j2);
    }

    /* renamed from: r */
    public final void mo47908r(long j) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznk(this, j));
        }
    }

    /* renamed from: s */
    public final void mo47909s(boolean z) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznl(this, z));
        }
    }

    /* renamed from: t */
    public final void mo47910t(int i, long j, long j2) {
        Handler handler = this.f37975a;
        if (handler != null) {
            handler.post(new zznq(this, i, j, j2));
        }
    }
}
