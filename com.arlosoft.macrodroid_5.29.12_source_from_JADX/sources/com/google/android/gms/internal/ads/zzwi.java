package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzwi {

    /* renamed from: a */
    private int f38776a;

    /* renamed from: b */
    private int f38777b;

    /* renamed from: c */
    private int f38778c = 0;

    /* renamed from: d */
    private zzwb[] f38779d = new zzwb[100];

    public zzwi(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo48338a() {
        return this.f38777b * 65536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzwb mo48339b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f38777b     // Catch:{ all -> 0x0038 }
            int r0 = r0 + 1
            r4.f38777b = r0     // Catch:{ all -> 0x0038 }
            int r0 = r4.f38778c     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzwb[] r1 = r4.f38779d     // Catch:{ all -> 0x0038 }
            int r0 = r0 + -1
            r4.f38778c = r0     // Catch:{ all -> 0x0038 }
            r2 = r1[r0]     // Catch:{ all -> 0x0038 }
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            r1[r0] = r3     // Catch:{ all -> 0x0038 }
            goto L_0x002b
        L_0x001a:
            com.google.android.gms.internal.ads.zzwb r2 = new com.google.android.gms.internal.ads.zzwb     // Catch:{ all -> 0x0038 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            int r0 = r4.f38777b     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzwb[] r1 = r4.f38779d     // Catch:{ all -> 0x0038 }
            int r3 = r1.length     // Catch:{ all -> 0x0038 }
            if (r0 > r3) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzwb[] r0 = (com.google.android.gms.internal.ads.zzwb[]) r0     // Catch:{ all -> 0x0038 }
            r4.f38779d = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwi.mo48339b():com.google.android.gms.internal.ads.zzwb");
    }

    /* renamed from: c */
    public final synchronized void mo48340c(zzwb zzwb) {
        zzwb[] zzwbArr = this.f38779d;
        int i = this.f38778c;
        this.f38778c = i + 1;
        zzwbArr[i] = zzwb;
        this.f38777b--;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void mo48341d(@Nullable zzwc zzwc) {
        while (zzwc != null) {
            zzwb[] zzwbArr = this.f38779d;
            int i = this.f38778c;
            this.f38778c = i + 1;
            zzwbArr[i] = zzwc.mo48217a();
            this.f38777b--;
            zzwc = zzwc.mo48220d();
        }
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo48342e() {
        mo48343f(0);
    }

    /* renamed from: f */
    public final synchronized void mo48343f(int i) {
        int i2 = this.f38776a;
        this.f38776a = i;
        if (i < i2) {
            mo48344g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo48344g() {
        int max = Math.max(0, zzen.m49140O(this.f38776a, 65536) - this.f38777b);
        int i = this.f38778c;
        if (max < i) {
            Arrays.fill(this.f38779d, max, i, (Object) null);
            this.f38778c = max;
        }
    }
}
