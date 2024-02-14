package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqp extends zzfrh {

    /* renamed from: a */
    private final String f36280a;

    /* renamed from: b */
    private final String f36281b;

    /* synthetic */ zzfqp(String str, String str2, zzfqo zzfqo) {
        this.f36280a = str;
        this.f36281b = str2;
    }

    @Nullable
    /* renamed from: a */
    public final String mo46122a() {
        return this.f36281b;
    }

    @Nullable
    /* renamed from: b */
    public final String mo46123b() {
        return this.f36280a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrh) {
            zzfrh zzfrh = (zzfrh) obj;
            String str = this.f36280a;
            if (str != null ? str.equals(zzfrh.mo46123b()) : zzfrh.mo46123b() == null) {
                String str2 = this.f36281b;
                if (str2 != null ? str2.equals(zzfrh.mo46122a()) : zzfrh.mo46122a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f36280a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f36281b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f36280a;
        String str2 = this.f36281b;
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
