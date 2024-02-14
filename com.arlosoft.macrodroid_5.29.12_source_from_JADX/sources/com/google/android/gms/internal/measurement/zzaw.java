package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class zzaw {

    /* renamed from: a */
    final List f41212a = new ArrayList();

    protected zzaw() {
    }

    /* renamed from: a */
    public abstract zzap mo50760a(String str, zzg zzg, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzap mo50761b(String str) {
        if (this.f41212a.contains(zzh.m60247e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
