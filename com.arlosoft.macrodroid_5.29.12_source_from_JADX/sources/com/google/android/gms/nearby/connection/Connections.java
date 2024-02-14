package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public interface Connections {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static abstract class ConnectionRequestListener {
        /* renamed from: a */
        public void mo55660a(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        }
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public interface ConnectionResponseCallback {
        /* renamed from: a */
        void mo55661a(@NonNull String str, @NonNull Status status, @NonNull byte[] bArr);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static abstract class EndpointDiscoveryListener {
        /* renamed from: a */
        public void mo55662a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        }

        /* renamed from: b */
        public abstract void mo55663b(@NonNull String str);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public interface MessageListener {
        @Deprecated
        /* renamed from: a */
        void mo55664a(@NonNull String str, @NonNull byte[] bArr, boolean z);

        @Deprecated
        /* renamed from: b */
        void mo55665b(@NonNull String str);
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public interface StartAdvertisingResult extends Result {
    }
}
