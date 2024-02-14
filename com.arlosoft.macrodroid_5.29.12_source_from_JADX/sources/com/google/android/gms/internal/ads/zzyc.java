package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyc {
    @Nullable

    /* renamed from: a */
    private final Handler f38956a;
    @Nullable

    /* renamed from: b */
    private final zzyd f38957b;

    public zzyc(@Nullable Handler handler, @Nullable zzyd zzyd) {
        this.f38956a = zzyd == null ? null : handler;
        this.f38957b = zzyd;
    }

    /* renamed from: a */
    public final void mo48423a(String str, long j, long j2) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxy(this, str, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo48424b(String str) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzyb(this, str));
        }
    }

    /* renamed from: c */
    public final void mo48425c(zzgs zzgs) {
        zzgs.mo47387a();
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxx(this, zzgs));
        }
    }

    /* renamed from: d */
    public final void mo48426d(int i, long j) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxs(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo48427e(zzgs zzgs) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxw(this, zzgs));
        }
    }

    /* renamed from: f */
    public final void mo48428f(zzaf zzaf, @Nullable zzgt zzgt) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxz(this, zzaf, zzgt));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo48429g(String str, long j, long j2) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47638o(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo48430h(String str) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47622a0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo48431i(zzgs zzgs) {
        zzgs.mo47387a();
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47633j(zzgs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo48432j(int i, long j) {
        zzyd zzyd = this.f38957b;
        int i2 = zzen.f34500a;
        zzyd.mo47628g(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo48433k(zzgs zzgs) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47634k(zzgs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo48434l(zzaf zzaf, zzgt zzgt) {
        int i = zzen.f34500a;
        this.f38957b.mo47629h(zzaf, zzgt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo48435m(Object obj, long j) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47643p(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo48436n(long j, int i) {
        zzyd zzyd = this.f38957b;
        int i2 = zzen.f34500a;
        zzyd.mo47631i(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo48437o(Exception exc) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47637n(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo48438p(zzda zzda) {
        zzyd zzyd = this.f38957b;
        int i = zzen.f34500a;
        zzyd.mo47644s0(zzda);
    }

    /* renamed from: q */
    public final void mo48439q(Object obj) {
        if (this.f38956a != null) {
            this.f38956a.post(new zzxt(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: r */
    public final void mo48440r(long j, int i) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxv(this, j, i));
        }
    }

    /* renamed from: s */
    public final void mo48441s(Exception exc) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzxu(this, exc));
        }
    }

    /* renamed from: t */
    public final void mo48442t(zzda zzda) {
        Handler handler = this.f38956a;
        if (handler != null) {
            handler.post(new zzya(this, zzda));
        }
    }
}
