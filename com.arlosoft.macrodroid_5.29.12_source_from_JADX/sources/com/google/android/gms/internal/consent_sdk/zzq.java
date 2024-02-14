package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzv f39432a;

    /* renamed from: c */
    public final /* synthetic */ Activity f39433c;

    /* renamed from: d */
    public final /* synthetic */ ConsentRequestParameters f39434d;

    /* renamed from: f */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener f39435f;

    /* renamed from: g */
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener f39436g;

    public final void run() {
        this.f39432a.mo48728b(this.f39433c, this.f39434d, this.f39435f, this.f39436g);
    }
}
