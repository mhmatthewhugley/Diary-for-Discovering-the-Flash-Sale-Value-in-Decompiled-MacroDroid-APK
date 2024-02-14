package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* renamed from: a */
    private final NetworkConnectionInfo.NetworkType f1231a;

    /* renamed from: b */
    private final NetworkConnectionInfo.MobileSubtype f1232b;

    static final class Builder extends NetworkConnectionInfo.Builder {

        /* renamed from: a */
        private NetworkConnectionInfo.NetworkType f1233a;

        /* renamed from: b */
        private NetworkConnectionInfo.MobileSubtype f1234b;

        Builder() {
        }

        /* renamed from: a */
        public NetworkConnectionInfo mo19381a() {
            return new AutoValue_NetworkConnectionInfo(this.f1233a, this.f1234b);
        }

        /* renamed from: b */
        public NetworkConnectionInfo.Builder mo19382b(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f1234b = mobileSubtype;
            return this;
        }

        /* renamed from: c */
        public NetworkConnectionInfo.Builder mo19383c(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f1233a = networkType;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo19376b() {
        return this.f1232b;
    }

    @Nullable
    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo19377c() {
        return this.f1231a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f1231a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo19377c()) : networkConnectionInfo.mo19377c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f1232b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo19376b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo19376b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f1231a;
        int i = 0;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f1232b;
        if (mobileSubtype != null) {
            i = mobileSubtype.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1231a + ", mobileSubtype=" + this.f1232b + "}";
    }

    private AutoValue_NetworkConnectionInfo(@Nullable NetworkConnectionInfo.NetworkType networkType, @Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f1231a = networkType;
        this.f1232b = mobileSubtype;
    }
}
