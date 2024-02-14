package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class zaag extends GoogleApiClient {

    /* renamed from: b */
    private final String f3268b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public zaag(String str) {
    }

    /* renamed from: d */
    public final ConnectionResult mo21248d(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: e */
    public final void mo21249e() {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: f */
    public final void mo21250f() {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: g */
    public final void mo21251g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: l */
    public final boolean mo21255l() {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: m */
    public final boolean mo21256m() {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: p */
    public final void mo21259p(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.f3268b);
    }

    /* renamed from: r */
    public final void mo21261r(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.f3268b);
    }
}
