package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzu extends zzai {

    /* renamed from: d */
    private final Callable f41923d;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.f41923d = callable;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        try {
            return zzi.m60292b(this.f41923d.call());
        } catch (Exception unused) {
            return zzap.f41197i;
        }
    }
}
