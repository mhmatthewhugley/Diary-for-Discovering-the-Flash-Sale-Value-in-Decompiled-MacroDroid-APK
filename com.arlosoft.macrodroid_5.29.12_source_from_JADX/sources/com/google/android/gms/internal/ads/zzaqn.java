package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqn {

    /* renamed from: e */
    private static final String[] f25341e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f25342a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f25343b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f25344c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f25345d = false;

    zzaqn(@NonNull Context context, @NonNull Executor executor, @NonNull String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzaqm(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }

    /* renamed from: d */
    public static zzaqn m42148d(@NonNull Context context, @NonNull Executor executor) {
        return new zzaqn(context, executor, f25341e);
    }

    /* renamed from: b */
    public final long mo41840b() {
        long j = this.f25344c;
        this.f25344c = -1;
        return j;
    }

    /* renamed from: c */
    public final long mo41841c() {
        if (this.f25345d) {
            return this.f25343b - this.f25342a;
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo41842h() {
        if (this.f25345d) {
            this.f25343b = System.currentTimeMillis();
        }
    }
}
