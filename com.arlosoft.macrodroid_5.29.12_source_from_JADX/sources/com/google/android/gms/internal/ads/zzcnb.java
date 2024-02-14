package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcnb {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcmp, java.lang.Object] */
    /* renamed from: a */
    public static final zzcmp m45940a(Context context, zzcoe zzcoe, String str, boolean z, boolean z2, @Nullable zzape zzape, @Nullable zzbkb zzbkb, zzcgv zzcgv, @Nullable zzbjr zzbjr, @Nullable zzl zzl, @Nullable zza zza, zzbep zzbep, @Nullable zzfdk zzfdk, @Nullable zzfdn zzfdn) throws zzcna {
        StrictMode.ThreadPolicy threadPolicy;
        zzbjc.m43542c(context);
        try {
            zzcmx zzcmx = new zzcmx(context, zzcoe, str, z, z2, zzape, zzbkb, zzcgv, (zzbjr) null, zzl, zza, zzbep, zzfdk, zzfdn);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = zzcmx.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new zzcna("Webview initialization failed.", th);
        }
    }
}
