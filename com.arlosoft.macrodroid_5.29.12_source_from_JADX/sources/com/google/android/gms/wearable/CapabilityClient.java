package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.Wearable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class CapabilityClient extends GoogleApi<Wearable.WearableOptions> {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface CapabilityFilterType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface NodeFilterType {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface OnCapabilityChangedListener extends CapabilityApi.CapabilityListener {
        /* renamed from: a */
        void mo56174a(@NonNull CapabilityInfo capabilityInfo);
    }
}
