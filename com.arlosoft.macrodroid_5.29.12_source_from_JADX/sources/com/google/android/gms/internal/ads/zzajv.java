package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzajv {

    /* renamed from: a */
    private final String f24859a;

    /* renamed from: b */
    private final String f24860b;

    public zzajv(String str, String str2) {
        this.f24859a = str;
        this.f24860b = str2;
    }

    /* renamed from: a */
    public final String mo41569a() {
        return this.f24859a;
    }

    /* renamed from: b */
    public final String mo41570b() {
        return this.f24860b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajv.class == obj.getClass()) {
            zzajv zzajv = (zzajv) obj;
            return TextUtils.equals(this.f24859a, zzajv.f24859a) && TextUtils.equals(this.f24860b, zzajv.f24860b);
        }
    }

    public final int hashCode() {
        return (this.f24859a.hashCode() * 31) + this.f24860b.hashCode();
    }

    public final String toString() {
        String str = this.f24859a;
        String str2 = this.f24860b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}
