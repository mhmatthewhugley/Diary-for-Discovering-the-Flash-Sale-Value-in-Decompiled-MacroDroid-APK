package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

final class AutoValue_ClientInfo extends ClientInfo {

    /* renamed from: a */
    private final ClientInfo.ClientType f1198a;

    /* renamed from: b */
    private final AndroidClientInfo f1199b;

    static final class Builder extends ClientInfo.Builder {

        /* renamed from: a */
        private ClientInfo.ClientType f1200a;

        /* renamed from: b */
        private AndroidClientInfo f1201b;

        Builder() {
        }

        /* renamed from: a */
        public ClientInfo mo19333a() {
            return new AutoValue_ClientInfo(this.f1200a, this.f1201b);
        }

        /* renamed from: b */
        public ClientInfo.Builder mo19334b(@Nullable AndroidClientInfo androidClientInfo) {
            this.f1201b = androidClientInfo;
            return this;
        }

        /* renamed from: c */
        public ClientInfo.Builder mo19335c(@Nullable ClientInfo.ClientType clientType) {
            this.f1200a = clientType;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public AndroidClientInfo mo19328b() {
        return this.f1199b;
    }

    @Nullable
    /* renamed from: c */
    public ClientInfo.ClientType mo19329c() {
        return this.f1198a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f1198a;
        if (clientType != null ? clientType.equals(clientInfo.mo19329c()) : clientInfo.mo19329c() == null) {
            AndroidClientInfo androidClientInfo = this.f1199b;
            if (androidClientInfo == null) {
                if (clientInfo.mo19328b() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.mo19328b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f1198a;
        int i = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f1199b;
        if (androidClientInfo != null) {
            i = androidClientInfo.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f1198a + ", androidClientInfo=" + this.f1199b + "}";
    }

    private AutoValue_ClientInfo(@Nullable ClientInfo.ClientType clientType, @Nullable AndroidClientInfo androidClientInfo) {
        this.f1198a = clientType;
        this.f1199b = androidClientInfo;
    }
}
