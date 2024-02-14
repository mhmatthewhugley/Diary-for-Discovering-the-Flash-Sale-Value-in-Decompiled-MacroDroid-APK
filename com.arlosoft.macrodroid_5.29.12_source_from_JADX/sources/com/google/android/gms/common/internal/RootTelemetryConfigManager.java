package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class RootTelemetryConfigManager {
    @Nullable

    /* renamed from: b */
    private static RootTelemetryConfigManager f3671b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f3672c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @Nullable

    /* renamed from: a */
    private RootTelemetryConfiguration f3673a;

    private RootTelemetryConfigManager() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static synchronized RootTelemetryConfigManager m4496b() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            if (f3671b == null) {
                f3671b = new RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = f3671b;
        }
        return rootTelemetryConfigManager;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public RootTelemetryConfiguration mo21722a() {
        return this.f3673a;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final synchronized void mo21723c(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f3673a = f3672c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f3673a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
            this.f3673a = rootTelemetryConfiguration;
        }
    }
}
