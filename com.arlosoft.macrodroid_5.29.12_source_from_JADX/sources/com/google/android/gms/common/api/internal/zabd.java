package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabd extends zabw {

    /* renamed from: a */
    private final WeakReference f3321a;

    zabd(zabe zabe) {
        this.f3321a = new WeakReference(zabe);
    }

    /* renamed from: a */
    public final void mo21450a() {
        zabe zabe = (zabe) this.f3321a.get();
        if (zabe != null) {
            zabe.m4015A(zabe);
        }
    }
}
