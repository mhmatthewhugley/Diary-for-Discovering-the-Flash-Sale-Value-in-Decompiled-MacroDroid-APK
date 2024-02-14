package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

public interface FirebaseInstallationsApi {
    @NonNull
    /* renamed from: a */
    Task<InstallationTokenResult> mo63232a(boolean z);

    @NonNull
    Task<String> getId();
}
