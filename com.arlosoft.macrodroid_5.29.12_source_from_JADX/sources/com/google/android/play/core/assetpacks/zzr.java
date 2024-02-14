package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzcr;
import com.google.android.play.core.internal.zzcs;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzr implements zzcs {
    public final /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(zzn.f51630a);
        zzcr.m70944a(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
