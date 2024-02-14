package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface DataApi {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface DataItemResult extends Result {
        @NonNull
        /* renamed from: j0 */
        DataItem mo56195j0();
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface DataListener {
        /* renamed from: e */
        void mo56196e(@NonNull DataEventBuffer dataEventBuffer);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface DeleteDataItemsResult extends Result {
        /* renamed from: I0 */
        int mo56197I0();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface FilterType {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetFdForAssetResult extends Result, Releasable {
    }

    @NonNull
    /* renamed from: a */
    PendingResult<DataItemResult> mo56194a(@NonNull GoogleApiClient googleApiClient, @NonNull PutDataRequest putDataRequest);
}
