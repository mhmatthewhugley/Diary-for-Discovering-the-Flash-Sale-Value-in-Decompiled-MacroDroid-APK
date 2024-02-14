package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdxq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzdxv f33332a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f33333b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f33334c;

    public zzdxq(zzdxv zzdxv, Executor executor) {
        this.f33332a = zzdxv;
        this.f33334c = zzdxv.mo45051f();
        this.f33333b = executor;
    }

    /* renamed from: a */
    public final zzdxp mo45050a() {
        zzdxp zzdxp = new zzdxp(this);
        zzdxp unused = zzdxp.f33330a.putAll(zzdxp.f33331b.f33334c);
        return zzdxp;
    }
}
