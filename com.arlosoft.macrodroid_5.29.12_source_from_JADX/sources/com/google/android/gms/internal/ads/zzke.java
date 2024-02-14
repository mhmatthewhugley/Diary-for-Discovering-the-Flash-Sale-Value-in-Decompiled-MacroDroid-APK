package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzke {

    /* renamed from: a */
    private final zzhk f37740a;

    @Deprecated
    public zzke(Context context, zzcly zzcly, byte[] bArr) {
        this.f37740a = new zzhk(context, zzcly, (byte[]) null);
    }

    @Deprecated
    /* renamed from: a */
    public final zzke mo47780a(zzjh zzjh) {
        zzhk zzhk = this.f37740a;
        zzdd.m47212f(!zzhk.f37461q);
        Objects.requireNonNull(zzjh);
        zzhk.f37450f = new zzhc(zzjh);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public final zzke mo47781b(zzvz zzvz) {
        zzhk zzhk = this.f37740a;
        zzdd.m47212f(!zzhk.f37461q);
        Objects.requireNonNull(zzvz);
        zzhk.f37449e = new zzhd(zzvz);
        return this;
    }

    @Deprecated
    /* renamed from: c */
    public final zzkf mo47782c() {
        zzhk zzhk = this.f37740a;
        zzdd.m47212f(!zzhk.f37461q);
        zzhk.f37461q = true;
        return new zzkf(zzhk);
    }
}
