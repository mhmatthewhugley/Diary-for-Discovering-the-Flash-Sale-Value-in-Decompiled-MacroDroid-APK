package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentFormLoadFailureListener {
        /* renamed from: a */
        void mo48687a(@RecentlyNonNull FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        /* renamed from: b */
        void mo48688b(@RecentlyNonNull ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }
}
