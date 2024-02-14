package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class CrashUtils {

    /* renamed from: a */
    private static final String[] f3930a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4870a(@NonNull Context context, @NonNull Throwable th) {
        try {
            Preconditions.m4488k(context);
            Preconditions.m4488k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
