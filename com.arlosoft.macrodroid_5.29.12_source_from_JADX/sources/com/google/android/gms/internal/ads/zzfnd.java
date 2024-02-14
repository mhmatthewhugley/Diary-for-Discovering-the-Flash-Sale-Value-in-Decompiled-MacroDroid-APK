package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfnd extends zzfmz {

    /* renamed from: a */
    private final String f36144a;

    /* renamed from: b */
    private final boolean f36145b;

    /* renamed from: c */
    private final boolean f36146c;

    /* synthetic */ zzfnd(String str, boolean z, boolean z2, zzfnc zzfnc) {
        this.f36144a = str;
        this.f36145b = z;
        this.f36146c = z2;
    }

    /* renamed from: b */
    public final String mo45990b() {
        return this.f36144a;
    }

    /* renamed from: c */
    public final boolean mo45991c() {
        return this.f36146c;
    }

    /* renamed from: d */
    public final boolean mo45992d() {
        return this.f36145b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfmz) {
            zzfmz zzfmz = (zzfmz) obj;
            return this.f36144a.equals(zzfmz.mo45990b()) && this.f36145b == zzfmz.mo45992d() && this.f36146c == zzfmz.mo45991c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f36144a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f36145b ? 1237 : 1231)) * 1000003;
        if (true == this.f36146c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f36144a;
        boolean z = this.f36145b;
        boolean z2 = this.f36146c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}
