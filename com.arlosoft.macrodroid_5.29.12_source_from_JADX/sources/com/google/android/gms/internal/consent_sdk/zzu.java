package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener f39443a;

    public /* synthetic */ zzu(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        this.f39443a = onConsentInfoUpdateSuccessListener;
    }

    public final void run() {
        this.f39443a.mo60047a();
    }
}
