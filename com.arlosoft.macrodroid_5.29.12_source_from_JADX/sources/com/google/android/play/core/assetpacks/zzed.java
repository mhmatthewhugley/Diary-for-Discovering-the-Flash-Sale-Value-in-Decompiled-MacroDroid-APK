package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzed {

    /* renamed from: c */
    private static final zzag f51550c = new zzag("PackageStateCache");

    /* renamed from: a */
    private final Context f51551a;

    /* renamed from: b */
    private int f51552b = -1;

    zzed(Context context) {
        this.f51551a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo59753a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f51552b     // Catch:{ all -> 0x0029 }
            r1 = -1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            android.content.Context r1 = r3.f51551a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r3.f51551a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r3.f51552b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            com.google.android.play.core.internal.zzag r1 = f51550c     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0029 }
            r1.mo59806b(r2, r0)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f51552b     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzed.mo59753a():int");
    }
}
