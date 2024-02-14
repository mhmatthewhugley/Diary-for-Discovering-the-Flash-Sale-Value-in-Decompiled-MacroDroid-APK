package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqx {

    /* renamed from: a */
    public final String f38338a;

    /* renamed from: b */
    public final boolean f38339b;

    /* renamed from: c */
    public final boolean f38340c;

    public zzqx(String str, boolean z, boolean z2) {
        this.f38338a = str;
        this.f38339b = z;
        this.f38340c = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzqx.class) {
            zzqx zzqx = (zzqx) obj;
            return TextUtils.equals(this.f38338a, zzqx.f38338a) && this.f38339b == zzqx.f38339b && this.f38340c == zzqx.f38340c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f38338a.hashCode() + 31) * 31) + (true != this.f38339b ? 1237 : 1231)) * 31;
        if (true == this.f38340c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
