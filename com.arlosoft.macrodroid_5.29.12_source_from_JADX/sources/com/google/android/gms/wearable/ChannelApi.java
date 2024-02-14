package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public interface ChannelApi {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface ChannelListener {
        /* renamed from: c */
        void mo56181c(@NonNull Channel channel, int i, int i2);

        /* renamed from: d */
        void mo56182d(@NonNull Channel channel, int i, int i2);

        /* renamed from: f */
        void mo56183f(@NonNull Channel channel);

        /* renamed from: h */
        void mo56184h(@NonNull Channel channel, int i, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface CloseReason {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface OpenChannelResult extends Result {
        @Nullable
        Channel getChannel();
    }
}
