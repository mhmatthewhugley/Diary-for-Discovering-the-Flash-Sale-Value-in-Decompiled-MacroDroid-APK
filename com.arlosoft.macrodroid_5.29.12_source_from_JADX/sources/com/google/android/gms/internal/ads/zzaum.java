package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzaum {

    /* renamed from: a */
    private int f25690a;

    /* renamed from: a */
    public final void mo42064a(int i) {
        this.f25690a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo42065b() {
        this.f25690a = 0;
    }

    /* renamed from: c */
    public final void mo42066c(int i) {
        this.f25690a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo42067d(int i) {
        return (this.f25690a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo42068e() {
        return mo42067d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean mo42069f() {
        return mo42067d(4);
    }

    /* renamed from: g */
    public final boolean mo42070g() {
        return mo42067d(1);
    }
}
