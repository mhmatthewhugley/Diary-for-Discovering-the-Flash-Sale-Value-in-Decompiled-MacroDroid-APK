package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.internal.zzcd;
import com.google.android.play.core.internal.zzcr;
import com.google.android.play.core.internal.zzcs;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzs implements zzcs {

    /* renamed from: a */
    private final zzcs f51634a;

    /* renamed from: b */
    private final zzcs f51635b;

    public zzs(zzcs zzcs, zzcs zzcs2) {
        this.f51634a = zzcs;
        this.f51635b = zzcs2;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Object zza = this.f51634a.zza();
        Context a = ((zzu) this.f51635b).mo59787a();
        zzl zzl = (zzl) zza;
        zzcd.m70924a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        zzcd.m70924a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        zzcr.m70944a(zzl);
        return zzl;
    }
}
