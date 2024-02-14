package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.Wearable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class MessageClient extends GoogleApi<Wearable.WearableOptions> {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface FilterType {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface OnMessageReceivedListener extends MessageApi.MessageListener {
    }

    @ShowFirstParty
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface RpcService {
        @Nullable
        /* renamed from: b */
        Task<byte[]> mo56213b(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr);
    }
}
