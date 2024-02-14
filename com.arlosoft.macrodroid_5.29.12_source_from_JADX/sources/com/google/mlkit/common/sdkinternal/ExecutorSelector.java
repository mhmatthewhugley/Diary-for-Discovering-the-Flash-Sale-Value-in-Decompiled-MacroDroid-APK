package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class ExecutorSelector {

    /* renamed from: a */
    private final Provider f56294a;

    public ExecutorSelector(@NonNull Provider provider) {
        this.f56294a = provider;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public Executor mo64547a(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.f56294a.get();
    }
}
