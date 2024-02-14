package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public interface ConnectionsClient extends HasApiKey<ConnectionsOptions> {
    /* renamed from: b */
    void mo52759b();

    @NonNull
    /* renamed from: c */
    Task<Void> mo52760c(@NonNull String str, @NonNull String str2, @NonNull ConnectionLifecycleCallback connectionLifecycleCallback, @NonNull AdvertisingOptions advertisingOptions);

    @NonNull
    /* renamed from: d */
    Task<Void> mo52761d(@NonNull String str, @NonNull EndpointDiscoveryCallback endpointDiscoveryCallback, @NonNull DiscoveryOptions discoveryOptions);

    /* renamed from: e */
    void mo52762e(@NonNull String str);

    @NonNull
    /* renamed from: f */
    Task<Void> mo52763f(@NonNull String str, @NonNull PayloadCallback payloadCallback);

    @NonNull
    /* renamed from: g */
    Task<Void> mo52764g(@NonNull String str, @NonNull Payload payload);

    /* renamed from: i */
    void mo52765i();

    @NonNull
    /* renamed from: j */
    Task<Void> mo52766j(@NonNull String str, @NonNull String str2, @NonNull ConnectionLifecycleCallback connectionLifecycleCallback);
}
