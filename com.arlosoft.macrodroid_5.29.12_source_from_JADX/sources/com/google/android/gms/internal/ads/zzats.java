package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzats {

    /* renamed from: a */
    private final Handler f25562a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzatt f25563b;

    public zzats(Handler handler, zzatt zzatt) {
        Objects.requireNonNull(handler);
        this.f25562a = handler;
        this.f25563b = zzatt;
    }

    /* renamed from: b */
    public final void mo42012b(int i) {
        this.f25562a.post(new zzatr(this, i));
    }

    /* renamed from: c */
    public final void mo42013c(int i, long j, long j2) {
        this.f25562a.post(new zzatp(this, i, j, j2));
    }

    /* renamed from: d */
    public final void mo42014d(String str, long j, long j2) {
        this.f25562a.post(new zzatn(this, str, j, j2));
    }

    /* renamed from: e */
    public final void mo42015e(zzauq zzauq) {
        this.f25562a.post(new zzatq(this, zzauq));
    }

    /* renamed from: f */
    public final void mo42016f(zzauq zzauq) {
        this.f25562a.post(new zzatm(this, zzauq));
    }

    /* renamed from: g */
    public final void mo42017g(zzasw zzasw) {
        this.f25562a.post(new zzato(this, zzasw));
    }
}
