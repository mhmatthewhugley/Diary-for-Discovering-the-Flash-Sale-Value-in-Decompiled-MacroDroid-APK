package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @NonNull
    /* renamed from: a */
    public final Exception mo21303a(@NonNull Status status) {
        if (status.mo21294n2() == 8) {
            return new FirebaseException(status.zza());
        }
        return new FirebaseApiNotAvailableException(status.zza());
    }
}
