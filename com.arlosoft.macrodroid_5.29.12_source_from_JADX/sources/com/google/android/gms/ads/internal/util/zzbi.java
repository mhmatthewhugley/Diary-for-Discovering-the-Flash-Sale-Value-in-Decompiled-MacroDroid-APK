package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzcgo;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbi extends zzali {

    /* renamed from: F */
    final /* synthetic */ byte[] f2217F;

    /* renamed from: G */
    final /* synthetic */ Map f2218G;

    /* renamed from: H */
    final /* synthetic */ zzcgo f2219H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbi(zzbo zzbo, int i, String str, zzaki zzaki, zzakh zzakh, byte[] bArr, Map map, zzcgo zzcgo) {
        super(i, str, zzaki, zzakh);
        this.f2217F = bArr;
        this.f2218G = map;
        this.f2219H = zzcgo;
    }

    /* renamed from: E */
    public final byte[] mo20325E() throws zzajl {
        byte[] bArr = this.f2217F;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo20326G(String str) {
        this.f2219H.mo43560g(str);
        super.mo20328r(str);
    }

    /* renamed from: n */
    public final Map mo20327n() throws zzajl {
        Map map = this.f2218G;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo20328r(Object obj) {
        mo20328r((String) obj);
    }
}
