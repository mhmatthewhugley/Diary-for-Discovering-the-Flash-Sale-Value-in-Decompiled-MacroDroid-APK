package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.service.zao;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static TelemetryLoggingClient m4507a(@NonNull Context context) {
        return m4508b(context, TelemetryLoggingOptions.f3683c);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static TelemetryLoggingClient m4508b(@NonNull Context context, @NonNull TelemetryLoggingOptions telemetryLoggingOptions) {
        return new zao(context, telemetryLoggingOptions);
    }
}
