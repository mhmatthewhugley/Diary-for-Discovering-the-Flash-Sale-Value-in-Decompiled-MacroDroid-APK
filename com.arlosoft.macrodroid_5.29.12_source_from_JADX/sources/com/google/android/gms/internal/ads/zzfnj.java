package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfnj implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final zzfoe f36162a;

    /* renamed from: c */
    private final zzfny f36163c;

    /* renamed from: d */
    private final Object f36164d = new Object();

    /* renamed from: f */
    private boolean f36165f = false;

    /* renamed from: g */
    private boolean f36166g = false;

    zzfnj(@NonNull Context context, @NonNull Looper looper, @NonNull zzfny zzfny) {
        this.f36163c = zzfny;
        this.f36162a = new zzfoe(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m50623b() {
        synchronized (this.f36164d) {
            if (this.f36162a.mo21641c() || this.f36162a.mo21644f()) {
                this.f36162a.mo21640b();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46007a() {
        synchronized (this.f36164d) {
            if (!this.f36165f) {
                this.f36165f = true;
                this.f36162a.mo21655v();
            }
        }
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21660y(@androidx.annotation.Nullable android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f36164d
            monitor-enter(r4)
            boolean r0 = r3.f36166g     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f36166g = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.zzfoe r0 = r3.f36162a     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.zzfoj r0 = r0.mo46024o0()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.zzfoc r1 = new com.google.android.gms.internal.ads.zzfoc     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.zzfny r2 = r3.f36163c     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.mo47050p()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.mo46034sb(r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.m50623b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.m50623b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfnj.mo21660y(android.os.Bundle):void");
    }
}
