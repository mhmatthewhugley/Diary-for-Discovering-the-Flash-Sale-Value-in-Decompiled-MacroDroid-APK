package com.google.android.gms.internal.mlkit_translate;

import java.util.Set;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbr extends zzbo {

    /* renamed from: a */
    private final zzci f43163a = new zzci();

    /* renamed from: d */
    public final zzbo mo52105d(String str) {
        return (zzbo) this.f43163a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof zzbr) && ((zzbr) obj).f43163a.equals(this.f43163a))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final zzbr mo52107f(String str) {
        return (zzbr) this.f43163a.get(str);
    }

    /* renamed from: h */
    public final zzbu mo52108h(String str) {
        return (zzbu) this.f43163a.get(str);
    }

    public final int hashCode() {
        return this.f43163a.hashCode();
    }

    /* renamed from: i */
    public final Set mo52110i() {
        return this.f43163a.entrySet();
    }

    /* renamed from: j */
    public final void mo52111j(String str, zzbo zzbo) {
        this.f43163a.put(str, zzbo);
    }

    /* renamed from: k */
    public final boolean mo52112k(String str) {
        return this.f43163a.containsKey(str);
    }
}
