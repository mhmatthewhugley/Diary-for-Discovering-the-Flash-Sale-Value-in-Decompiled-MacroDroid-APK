package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.RemoteModel;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public interface RemoteModelManagerInterface<RemoteT extends RemoteModel> {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    Task<Set<RemoteT>> mo64515a();
}
