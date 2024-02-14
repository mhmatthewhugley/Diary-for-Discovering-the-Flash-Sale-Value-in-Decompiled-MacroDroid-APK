package com.google.android.gms.common.api;

import android.app.PendingIntent;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@NonNull Status status) {
        super(status);
    }

    @NonNull
    /* renamed from: c */
    public PendingIntent mo21275c() {
        return mo21209a().mo21293m2();
    }
}
