package com.google.android.gms.wearable;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wearable.Wearable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class ChannelClient extends GoogleApi<Wearable.WearableOptions> {

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public interface Channel extends Parcelable {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public static abstract class ChannelCallback {
        /* renamed from: a */
        public void mo56186a(@NonNull Channel channel, int i, int i2) {
        }

        /* renamed from: b */
        public void mo56187b(@NonNull Channel channel) {
        }

        /* renamed from: c */
        public void mo56188c(@NonNull Channel channel, int i, int i2) {
        }

        /* renamed from: d */
        public void mo56189d(@NonNull Channel channel, int i, int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
    public @interface CloseReason {
    }
}
