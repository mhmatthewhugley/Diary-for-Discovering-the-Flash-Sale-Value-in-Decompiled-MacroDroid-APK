package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    /* renamed from: b */
    public int mo21177b() {
        return this.zza;
    }
}
