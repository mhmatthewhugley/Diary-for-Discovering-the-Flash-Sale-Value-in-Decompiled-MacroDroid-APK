package com.google.android.gms.ads.query;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcge;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class QueryInfo {

    /* renamed from: a */
    private final zzeg f2589a;

    public QueryInfo(zzeg zzeg) {
        this.f2589a = zzeg;
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m3084a(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdr zzdr;
        zzbjc.m43542c(context);
        if (((Boolean) zzbkq.f27450k.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zza(context, adFormat, adRequest, queryInfoGenerationCallback));
                return;
            }
        }
        if (adRequest == null) {
            zzdr = null;
        } else {
            zzdr = adRequest.mo19668a();
        }
        new zzbzt(context, adFormat, zzdr).mo43236b(queryInfoGenerationCallback);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public String mo20703b() {
        return this.f2589a.mo20089a();
    }

    @NonNull
    /* renamed from: c */
    public final zzeg mo20704c() {
        return this.f2589a;
    }
}
