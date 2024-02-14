package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ApiExceptionUtil {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static ApiException m4340a(@NonNull Status status) {
        if (status.mo21296p2()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
