package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public interface RangingSessionCallback {

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public @interface RangingSuspendedReason {
    }

    /* renamed from: a */
    void mo56043a(@NonNull UwbDevice uwbDevice, @RangingSuspendedReason int i);

    /* renamed from: b */
    void mo56044b(@NonNull UwbDevice uwbDevice, @NonNull RangingPosition rangingPosition);

    /* renamed from: c */
    void mo56045c(@NonNull UwbDevice uwbDevice);
}
