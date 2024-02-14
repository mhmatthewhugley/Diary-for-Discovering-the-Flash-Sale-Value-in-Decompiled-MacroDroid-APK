package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbp extends zzcbr {

    /* renamed from: a */
    private final String f28200a;

    /* renamed from: c */
    private final int f28201c;

    public zzcbp(String str, int i) {
        this.f28200a = str;
        this.f28201c = i;
    }

    /* renamed from: a */
    public final String mo43291a() {
        return this.f28200a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcbp)) {
            zzcbp zzcbp = (zzcbp) obj;
            if (!Objects.m4470a(this.f28200a, zzcbp.f28200a) || !Objects.m4470a(Integer.valueOf(this.f28201c), Integer.valueOf(zzcbp.f28201c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.f28201c;
    }
}
