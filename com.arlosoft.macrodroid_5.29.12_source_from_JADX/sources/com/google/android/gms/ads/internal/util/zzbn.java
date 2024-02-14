package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzala;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzchh;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbn extends zzakd {

    /* renamed from: D */
    private final zzchh f2221D;

    /* renamed from: E */
    private final zzcgo f2222E;

    public zzbn(String str, Map map, zzchh zzchh) {
        super(0, str, new zzbm(zzchh));
        this.f2221D = zzchh;
        zzcgo zzcgo = new zzcgo((String) null);
        this.f2222E = zzcgo;
        zzcgo.mo43557d(str, "GET", (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final zzakj mo20330j(zzajz zzajz) {
        return zzakj.m41656b(zzajz, zzala.m41691b(zzajz));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo20328r(Object obj) {
        zzajz zzajz = (zzajz) obj;
        this.f2222E.mo43559f(zzajz.f24868c, zzajz.f24866a);
        zzcgo zzcgo = this.f2222E;
        byte[] bArr = zzajz.f24867b;
        if (zzcgo.m45209l() && bArr != null) {
            zzcgo.mo43561h(bArr);
        }
        this.f2221D.mo43574c(zzajz);
    }
}
