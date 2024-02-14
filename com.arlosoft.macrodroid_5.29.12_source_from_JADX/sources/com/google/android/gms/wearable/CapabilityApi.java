package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface CapabilityApi {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface AddLocalCapabilityResult extends Result {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface CapabilityFilterType {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface CapabilityListener {
        /* renamed from: a */
        void mo56174a(@NonNull CapabilityInfo capabilityInfo);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetAllCapabilitiesResult extends Result {
        @NonNull
        /* renamed from: V1 */
        Map<String, CapabilityInfo> mo56175V1();
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetCapabilityResult extends Result {
        @NonNull
        /* renamed from: B0 */
        CapabilityInfo mo56176B0();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface NodeFilterType {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface RemoveLocalCapabilityResult extends Result {
    }
}
