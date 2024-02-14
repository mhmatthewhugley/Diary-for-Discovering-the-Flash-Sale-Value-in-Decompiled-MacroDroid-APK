package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
public interface AnalyticsConnector {

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public interface AnalyticsConnectorHandle {
    }

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        /* renamed from: a */
        void mo22932a(int i, @Nullable Bundle bundle);
    }

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public static class ConditionalUserProperty {
        @NonNull
        @KeepForSdk

        /* renamed from: a */
        public String f53784a;
        @NonNull
        @KeepForSdk

        /* renamed from: b */
        public String f53785b;
        @KeepForSdk
        @Nullable

        /* renamed from: c */
        public Object f53786c;
        @KeepForSdk
        @Nullable

        /* renamed from: d */
        public String f53787d;
        @KeepForSdk

        /* renamed from: e */
        public long f53788e;
        @KeepForSdk
        @Nullable

        /* renamed from: f */
        public String f53789f;
        @KeepForSdk
        @Nullable

        /* renamed from: g */
        public Bundle f53790g;
        @KeepForSdk
        @Nullable

        /* renamed from: h */
        public String f53791h;
        @KeepForSdk
        @Nullable

        /* renamed from: i */
        public Bundle f53792i;
        @KeepForSdk

        /* renamed from: j */
        public long f53793j;
        @KeepForSdk
        @Nullable

        /* renamed from: k */
        public String f53794k;
        @KeepForSdk
        @Nullable

        /* renamed from: l */
        public Bundle f53795l;
        @KeepForSdk

        /* renamed from: m */
        public long f53796m;
        @KeepForSdk

        /* renamed from: n */
        public boolean f53797n;
        @KeepForSdk

        /* renamed from: o */
        public long f53798o;
    }

    @KeepForSdk
    /* renamed from: a */
    void mo61992a(@NonNull ConditionalUserProperty conditionalUserProperty);

    @KeepForSdk
    /* renamed from: b */
    void mo61993b(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @KeepForSdk
    /* renamed from: c */
    void mo61994c(@NonNull String str, @NonNull String str2, @NonNull Object obj);

    @KeepForSdk
    void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle);

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: d */
    Map<String, Object> mo61996d(boolean z);

    @WorkerThread
    @KeepForSdk
    /* renamed from: e */
    int mo61997e(@Size(min = 1) @NonNull String str);

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: f */
    List<ConditionalUserProperty> mo61998f(@NonNull String str, @Size(max = 23, min = 1) @Nullable String str2);

    @KeepForSdk
    @DeferredApi
    @Nullable
    /* renamed from: g */
    AnalyticsConnectorHandle mo61999g(@NonNull String str, @NonNull AnalyticsConnectorListener analyticsConnectorListener);
}
