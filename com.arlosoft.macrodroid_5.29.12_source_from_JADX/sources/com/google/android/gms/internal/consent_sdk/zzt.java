package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener f39441a;

    /* renamed from: c */
    public final /* synthetic */ zzj f39442c;

    public /* synthetic */ zzt(ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener, zzj zzj) {
        this.f39441a = onConsentInfoUpdateFailureListener;
        this.f39442c = zzj;
    }

    public final void run() {
        this.f39441a.mo60046a(this.f39442c.mo48720a());
    }
}
