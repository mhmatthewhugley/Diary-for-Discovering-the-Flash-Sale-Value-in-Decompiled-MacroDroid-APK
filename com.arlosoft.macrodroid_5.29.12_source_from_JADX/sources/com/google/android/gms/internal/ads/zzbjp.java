package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjp {

    /* renamed from: a */
    private final Map f27341a = new HashMap();

    /* renamed from: b */
    private final zzbjr f27342b;

    public zzbjp(zzbjr zzbjr) {
        this.f27342b = zzbjr;
    }

    /* renamed from: a */
    public final zzbjr mo42682a() {
        return this.f27342b;
    }

    /* renamed from: b */
    public final void mo42683b(String str, @Nullable zzbjo zzbjo) {
        this.f27341a.put(str, zzbjo);
    }

    /* renamed from: c */
    public final void mo42684c(String str, String str2, long j) {
        zzbjr zzbjr = this.f27342b;
        zzbjo zzbjo = (zzbjo) this.f27341a.get(str2);
        String[] strArr = {str};
        if (zzbjo != null) {
            zzbjr.mo42691e(zzbjo, j, strArr);
        }
        this.f27341a.put(str, new zzbjo(j, (String) null, (zzbjo) null));
    }
}
