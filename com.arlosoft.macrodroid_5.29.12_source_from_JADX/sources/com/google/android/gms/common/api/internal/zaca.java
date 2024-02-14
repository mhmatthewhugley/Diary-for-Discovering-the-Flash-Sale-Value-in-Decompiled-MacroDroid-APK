package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface zaca {
    /* renamed from: a */
    void mo21412a();

    /* renamed from: b */
    void mo21413b();

    /* renamed from: c */
    void mo21414c();

    /* renamed from: d */
    void mo21415d();

    /* renamed from: e */
    boolean mo21416e(SignInConnectionListener signInConnectionListener);

    /* renamed from: f */
    void mo21417f(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);

    /* renamed from: g */
    boolean mo21418g();

    /* renamed from: h */
    ConnectionResult mo21419h(long j, TimeUnit timeUnit);

    /* renamed from: i */
    BaseImplementation.ApiMethodImpl mo21420i(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);

    /* renamed from: j */
    boolean mo21421j();

    /* renamed from: k */
    BaseImplementation.ApiMethodImpl mo21422k(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);
}
