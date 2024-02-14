package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbbk {

    /* renamed from: a */
    private final Handler f26511a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzbbl f26512b;

    public zzbbk(Handler handler, zzbbl zzbbl) {
        Objects.requireNonNull(handler);
        this.f26511a = handler;
        this.f26512b = zzbbl;
    }

    /* renamed from: b */
    public final void mo42378b(String str, long j, long j2) {
        this.f26511a.post(new zzbbe(this, str, j, j2));
    }

    /* renamed from: c */
    public final void mo42379c(zzauq zzauq) {
        this.f26511a.post(new zzbbj(this, zzauq));
    }

    /* renamed from: d */
    public final void mo42380d(int i, long j) {
        this.f26511a.post(new zzbbg(this, i, j));
    }

    /* renamed from: e */
    public final void mo42381e(zzauq zzauq) {
        this.f26511a.post(new zzbbd(this, zzauq));
    }

    /* renamed from: f */
    public final void mo42382f(zzasw zzasw) {
        this.f26511a.post(new zzbbf(this, zzasw));
    }

    /* renamed from: g */
    public final void mo42383g(Surface surface) {
        this.f26511a.post(new zzbbi(this, surface));
    }

    /* renamed from: h */
    public final void mo42384h(int i, int i2, int i3, float f) {
        this.f26511a.post(new zzbbh(this, i, i2, i3, f));
    }
}
