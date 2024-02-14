package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzv f39437a;

    /* renamed from: c */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener f39438c;

    public /* synthetic */ zzr(zzv zzv, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        this.f39437a = zzv;
        this.f39438c = onConsentInfoUpdateSuccessListener;
    }

    public final void run() {
        this.f39437a.mo48727a(this.f39438c);
    }
}
