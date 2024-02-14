package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ApiExceptionMapper implements StatusExceptionMapper {
    @NonNull
    /* renamed from: a */
    public final Exception mo21303a(@NonNull Status status) {
        return ApiExceptionUtil.m4340a(status);
    }
}
