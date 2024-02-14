package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelInfo;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public interface ModelInfoRetrieverInterop {
    @KeepForSdk
    @Nullable
    /* renamed from: a */
    ModelInfo mo64599a(@NonNull RemoteModel remoteModel) throws MlKitException;
}
