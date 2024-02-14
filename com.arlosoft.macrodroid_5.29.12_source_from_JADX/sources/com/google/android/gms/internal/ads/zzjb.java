package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzjb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f37573a;

    /* renamed from: b */
    public zzju f37574b;

    /* renamed from: c */
    public int f37575c;

    /* renamed from: d */
    public boolean f37576d;

    /* renamed from: e */
    public int f37577e;

    /* renamed from: f */
    public boolean f37578f;

    /* renamed from: g */
    public int f37579g;

    public zzjb(zzju zzju) {
        this.f37574b = zzju;
    }

    /* renamed from: a */
    public final void mo47671a(int i) {
        boolean z = true;
        if (true != (this.f37573a | i)) {
            z = false;
        }
        this.f37573a = z;
        this.f37575c += i;
    }

    /* renamed from: b */
    public final void mo47672b(int i) {
        this.f37573a = true;
        this.f37578f = true;
        this.f37579g = i;
    }

    /* renamed from: c */
    public final void mo47673c(zzju zzju) {
        this.f37573a |= this.f37574b != zzju;
        this.f37574b = zzju;
    }

    /* renamed from: d */
    public final void mo47674d(int i) {
        boolean z = true;
        if (!this.f37576d || this.f37577e == 5) {
            this.f37573a = true;
            this.f37576d = true;
            this.f37577e = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        zzdd.m47210d(z);
    }
}
