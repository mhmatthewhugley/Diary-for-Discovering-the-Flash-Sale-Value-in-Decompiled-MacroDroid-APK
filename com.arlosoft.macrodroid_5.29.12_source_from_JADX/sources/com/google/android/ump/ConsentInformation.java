package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public @interface ConsentStatus {
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentInfoUpdateFailureListener {
        /* renamed from: a */
        void mo60046a(@RecentlyNonNull FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        /* renamed from: a */
        void mo60047a();
    }
}
