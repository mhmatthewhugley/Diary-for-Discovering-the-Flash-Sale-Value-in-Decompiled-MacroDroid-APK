package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.internal.InternalTokenProvider;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public interface InternalAuthProvider extends InternalTokenProvider {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    Task<GetTokenResult> mo22607a(boolean z);

    @KeepForSdk
    @DeferredApi
    /* renamed from: b */
    void mo22608b(@NonNull IdTokenListener idTokenListener);

    @Nullable
    String getUid();
}
