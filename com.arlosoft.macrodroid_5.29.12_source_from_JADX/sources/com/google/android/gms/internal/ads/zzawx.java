package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawx {

    /* renamed from: a */
    public final String f26157a;

    /* renamed from: b */
    public final boolean f26158b;

    public zzawx(String str, boolean z) {
        this.f26157a = str;
        this.f26158b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzawx.class) {
            zzawx zzawx = (zzawx) obj;
            return TextUtils.equals(this.f26157a, zzawx.f26157a) && this.f26158b == zzawx.f26158b;
        }
    }

    public final int hashCode() {
        String str = this.f26157a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f26158b ? 1237 : 1231);
    }
}
