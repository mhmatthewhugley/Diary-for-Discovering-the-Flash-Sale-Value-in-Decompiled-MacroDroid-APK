package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfl {
    /* access modifiers changed from: private */
    @DoNotInline
    /* renamed from: b */
    public static boolean m50450b(@Nullable Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
