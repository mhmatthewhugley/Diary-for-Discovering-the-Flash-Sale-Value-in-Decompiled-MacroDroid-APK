package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.Wearable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class DataClient extends GoogleApi<Wearable.WearableOptions> {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface FilterType {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public static abstract class GetFdForAssetResponse implements Releasable {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface OnDataChangedListener extends DataApi.DataListener {
    }
}
