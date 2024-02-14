package com.google.android.gms.safetynet;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.Task;

public class SafetyNetClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    SafetyNetClient(@NonNull Context context) {
        super(context, SafetyNet.f47912c, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* renamed from: G */
    public Task<SafetyNetApi.AttestationResponse> mo56073G(@NonNull byte[] bArr, @NonNull String str) {
        return PendingResultUtil.m4474a(zzk.m63990a(mo21225k(), bArr, str), new SafetyNetApi.AttestationResponse());
    }
}
