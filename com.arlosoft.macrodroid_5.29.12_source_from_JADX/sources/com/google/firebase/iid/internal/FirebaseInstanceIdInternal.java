package com.google.firebase.iid.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
public interface FirebaseInstanceIdInternal {

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    public interface NewTokenListener {
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    String mo63218a();

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    Task<String> mo63219b();

    @KeepForSdk
    /* renamed from: c */
    void mo63220c(NewTokenListener newTokenListener);
}
