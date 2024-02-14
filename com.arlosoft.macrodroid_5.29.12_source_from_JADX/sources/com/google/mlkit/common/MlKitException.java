package com.google.mlkit.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public class MlKitException extends Exception {
    @ErrorCode
    private final int zza;

    @Retention(RetentionPolicy.CLASS)
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public @interface ErrorCode {
    }

    @KeepForSdk
    public MlKitException(@NonNull String str, @ErrorCode int i) {
        super(Preconditions.m4485h(str, "Provided message must not be empty."));
        this.zza = i;
    }

    @KeepForSdk
    public MlKitException(@NonNull String str, @ErrorCode int i, @Nullable Throwable th) {
        super(Preconditions.m4485h(str, "Provided message must not be empty."), th);
        this.zza = i;
    }
}
