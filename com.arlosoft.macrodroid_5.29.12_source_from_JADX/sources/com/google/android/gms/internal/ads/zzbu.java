package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzbu extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbu(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    /* renamed from: a */
    public static zzbu m44135a(@Nullable String str, @Nullable Throwable th) {
        return new zzbu(str, th, true, 1);
    }

    /* renamed from: b */
    public static zzbu m44136b(@Nullable String str, @Nullable Throwable th) {
        return new zzbu(str, th, true, 0);
    }

    /* renamed from: c */
    public static zzbu m44137c(@Nullable String str) {
        return new zzbu(str, (Throwable) null, false, 1);
    }
}
