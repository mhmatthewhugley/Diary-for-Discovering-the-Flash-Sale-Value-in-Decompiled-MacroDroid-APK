package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzv extends zzx {

    /* renamed from: f */
    private final Callable f4005f;

    /* synthetic */ zzv(Callable callable, zzu zzu) {
        super(false, 1, 5, (String) null, (Throwable) null, (zzw) null);
        this.f4005f = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo21990a() {
        try {
            return (String) this.f4005f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
