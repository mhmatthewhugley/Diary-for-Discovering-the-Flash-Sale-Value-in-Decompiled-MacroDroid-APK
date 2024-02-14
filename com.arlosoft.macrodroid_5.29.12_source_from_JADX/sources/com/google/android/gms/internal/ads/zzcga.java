package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcga {

    /* renamed from: a */
    private BigInteger f28406a = BigInteger.ONE;

    /* renamed from: b */
    private String f28407b = "0";

    /* renamed from: a */
    public final synchronized String mo43531a() {
        String bigInteger;
        bigInteger = this.f28406a.toString();
        this.f28406a = this.f28406a.add(BigInteger.ONE);
        this.f28407b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo43532b() {
        return this.f28407b;
    }
}
