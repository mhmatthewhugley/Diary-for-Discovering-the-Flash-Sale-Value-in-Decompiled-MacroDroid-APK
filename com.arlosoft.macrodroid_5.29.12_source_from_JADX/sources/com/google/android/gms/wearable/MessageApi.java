package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface MessageApi {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface FilterType {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface MessageListener {
        /* renamed from: g */
        void mo24754g(@NonNull MessageEvent messageEvent);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface SendMessageResult extends Result {
        /* renamed from: f */
        int mo56212f();
    }

    @NonNull
    /* renamed from: a */
    PendingResult<SendMessageResult> mo56209a(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull String str2, @NonNull byte[] bArr);

    @NonNull
    /* renamed from: b */
    PendingResult<Status> mo56210b(@NonNull GoogleApiClient googleApiClient, @NonNull MessageListener messageListener);

    @NonNull
    /* renamed from: c */
    PendingResult<Status> mo56211c(@NonNull GoogleApiClient googleApiClient, @NonNull MessageListener messageListener);
}
