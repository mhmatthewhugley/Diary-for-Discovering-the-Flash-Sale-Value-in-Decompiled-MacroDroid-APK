package com.google.firebase.appcheck.interop;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

public interface InternalAppCheckTokenProvider {
    @NonNull
    /* renamed from: a */
    Task<AppCheckTokenResult> mo62005a(boolean z);

    /* renamed from: b */
    void mo62006b(@NonNull AppCheckTokenListener appCheckTokenListener);
}
