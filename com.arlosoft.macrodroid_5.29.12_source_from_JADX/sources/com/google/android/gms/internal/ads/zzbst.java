package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbst implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ zzbpu f27712a;

    public /* synthetic */ zzbst(zzbpu zzbpu) {
        this.f27712a = zzbpu;
    }

    public final boolean apply(Object obj) {
        zzbpu zzbpu = (zzbpu) obj;
        return (zzbpu instanceof zzbsy) && zzbsy.m44067b((zzbsy) zzbpu).equals(this.f27712a);
    }
}
