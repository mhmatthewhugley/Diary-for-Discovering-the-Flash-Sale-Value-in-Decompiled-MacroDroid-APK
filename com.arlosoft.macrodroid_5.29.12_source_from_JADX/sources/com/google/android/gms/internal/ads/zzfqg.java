package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqg extends zzfqr {

    /* renamed from: a */
    private final String f36258a;

    /* renamed from: b */
    private final String f36259b;

    /* synthetic */ zzfqg(String str, String str2, zzfqf zzfqf) {
        this.f36258a = str;
        this.f36259b = str2;
    }

    @Nullable
    /* renamed from: a */
    public final String mo46085a() {
        return this.f36259b;
    }

    @Nullable
    /* renamed from: b */
    public final String mo46086b() {
        return this.f36258a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqr) {
            zzfqr zzfqr = (zzfqr) obj;
            String str = this.f36258a;
            if (str != null ? str.equals(zzfqr.mo46086b()) : zzfqr.mo46086b() == null) {
                String str2 = this.f36259b;
                if (str2 != null ? str2.equals(zzfqr.mo46085a()) : zzfqr.mo46085a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f36258a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f36259b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f36258a;
        String str2 = this.f36259b;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
