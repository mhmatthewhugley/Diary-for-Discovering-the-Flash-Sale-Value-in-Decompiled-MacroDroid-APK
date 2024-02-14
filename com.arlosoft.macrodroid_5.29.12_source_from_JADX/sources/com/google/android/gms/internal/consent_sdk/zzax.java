package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzax implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: a */
    private final UserMessagingPlatform.OnConsentFormLoadSuccessListener f39331a;

    /* renamed from: b */
    private final UserMessagingPlatform.OnConsentFormLoadFailureListener f39332b;

    /* renamed from: a */
    public final void mo48687a(FormError formError) {
        this.f39332b.mo48687a(formError);
    }

    /* renamed from: b */
    public final void mo48688b(ConsentForm consentForm) {
        this.f39331a.mo48688b(consentForm);
    }
}
