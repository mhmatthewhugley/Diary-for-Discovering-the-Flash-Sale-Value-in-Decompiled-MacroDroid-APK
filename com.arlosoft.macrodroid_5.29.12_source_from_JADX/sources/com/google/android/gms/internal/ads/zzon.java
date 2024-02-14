package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzon {
    @Nullable

    /* renamed from: a */
    private Exception f38056a;

    /* renamed from: b */
    private long f38057b;

    public zzon(long j) {
    }

    /* renamed from: a */
    public final void mo47975a() {
        this.f38056a = null;
    }

    /* renamed from: b */
    public final void mo47976b(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f38056a == null) {
            this.f38056a = exc;
            this.f38057b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f38057b) {
            Exception exc2 = this.f38056a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(exc2, new Object[]{exc});
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f38056a;
            this.f38056a = null;
            throw exc3;
        }
    }
}
