package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class RtbSignalData {

    /* renamed from: a */
    private final Context f2432a;

    /* renamed from: b */
    private final List f2433b;

    /* renamed from: c */
    private final Bundle f2434c;
    @Nullable

    /* renamed from: d */
    private final AdSize f2435d;

    public RtbSignalData(@NonNull Context context, @NonNull List<MediationConfiguration> list, @NonNull Bundle bundle, @Nullable AdSize adSize) {
        this.f2432a = context;
        this.f2433b = list;
        this.f2434c = bundle;
        this.f2435d = adSize;
    }
}
