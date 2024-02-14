package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzpu {

    /* renamed from: a */
    private final TelemetryLoggingClient f44443a;

    /* renamed from: b */
    private final AtomicLong f44444b = new AtomicLong(-1);

    @VisibleForTesting
    zzpu(Context context, String str) {
        this.f44443a = TelemetryLogging.m4508b(context, TelemetryLoggingOptions.m4510a().mo21740b("mlkit:natural_language").mo21739a());
    }

    /* renamed from: a */
    public static zzpu m62170a(Context context) {
        return new zzpu(context, "mlkit:natural_language");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo52447b(long j, Exception exc) {
        this.f44444b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo52448c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f44444b.get() != -1) {
                if (elapsedRealtime - this.f44444b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f44443a.mo21735a(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(24605, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo23705f(new zzpt(this, elapsedRealtime));
        }
    }
}
