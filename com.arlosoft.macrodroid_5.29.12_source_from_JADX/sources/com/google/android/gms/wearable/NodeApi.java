package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface NodeApi {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetConnectedNodesResult extends Result {
        @NonNull
        /* renamed from: s */
        List<Node> mo56224s();
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface GetLocalNodeResult extends Result {
        @NonNull
        /* renamed from: D0 */
        Node mo56225D0();
    }

    @NonNull
    /* renamed from: a */
    PendingResult<GetConnectedNodesResult> mo56223a(@NonNull GoogleApiClient googleApiClient);
}
