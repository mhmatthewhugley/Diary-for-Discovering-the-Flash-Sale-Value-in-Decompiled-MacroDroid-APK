package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzb {

    /* renamed from: a */
    private final Application f39341a;

    @Nullable
    /* renamed from: a */
    public final zza mo48694a() {
        try {
            AdvertisingIdClient.Info a = AdvertisingIdClient.m1817a(this.f39341a);
            return new zza(a.mo19848a(), a.mo19849b());
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            return null;
        }
    }
}
