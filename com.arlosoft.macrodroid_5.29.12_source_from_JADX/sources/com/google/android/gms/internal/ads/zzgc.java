package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgc {

    /* renamed from: a */
    private int f36677a;

    /* renamed from: a */
    public final void mo46719a(int i) {
        this.f36677a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo46720b() {
        this.f36677a = 0;
    }

    /* renamed from: c */
    public final void mo46721c(int i) {
        this.f36677a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo46722d(int i) {
        return (this.f36677a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo46723e() {
        return mo46722d(268435456);
    }

    /* renamed from: f */
    public final boolean mo46724f() {
        return mo46722d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean mo46725g() {
        return mo46722d(4);
    }

    /* renamed from: h */
    public final boolean mo46726h() {
        return mo46722d(1);
    }
}
