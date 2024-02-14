package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class zzhz implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzia f47046a;

    /* renamed from: c */
    public final /* synthetic */ int f47047c;

    /* renamed from: d */
    public final /* synthetic */ Exception f47048d;

    /* renamed from: f */
    public final /* synthetic */ byte[] f47049f;

    /* renamed from: g */
    public final /* synthetic */ Map f47050g;

    public /* synthetic */ zzhz(zzia zzia, int i, Exception exc, byte[] bArr, Map map) {
        this.f47046a = zzia;
        this.f47047c = i;
        this.f47048d = exc;
        this.f47049f = bArr;
        this.f47050g = map;
    }

    public final void run() {
        this.f47046a.mo55397a(this.f47047c, this.f47048d, this.f47049f, this.f47050g);
    }
}
