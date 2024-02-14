package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzs implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener f39439a;

    /* renamed from: c */
    public final /* synthetic */ zzj f39440c;

    public /* synthetic */ zzs(ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener, zzj zzj) {
        this.f39439a = onConsentInfoUpdateFailureListener;
        this.f39440c = zzj;
    }

    public final void run() {
        this.f39439a.mo60046a(this.f39440c.mo48720a());
    }
}
