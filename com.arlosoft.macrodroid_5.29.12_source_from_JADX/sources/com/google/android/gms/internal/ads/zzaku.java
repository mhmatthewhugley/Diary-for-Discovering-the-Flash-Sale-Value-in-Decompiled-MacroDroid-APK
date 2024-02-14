package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaku {

    /* renamed from: d */
    protected static final Comparator f24918d = new zzakt();

    /* renamed from: a */
    private final List f24919a = new ArrayList();

    /* renamed from: b */
    private final List f24920b = new ArrayList(64);

    /* renamed from: c */
    private int f24921c = 0;

    public zzaku(int i) {
    }

    /* renamed from: c */
    private final synchronized void m41669c() {
        while (this.f24921c > 4096) {
            byte[] bArr = (byte[]) this.f24919a.remove(0);
            this.f24920b.remove(bArr);
            this.f24921c -= bArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41613a(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002d
            int r0 = r4.length     // Catch:{ all -> 0x002a }
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L_0x0009
            goto L_0x002d
        L_0x0009:
            java.util.List r1 = r3.f24919a     // Catch:{ all -> 0x002a }
            r1.add(r4)     // Catch:{ all -> 0x002a }
            java.util.List r1 = r3.f24920b     // Catch:{ all -> 0x002a }
            java.util.Comparator r2 = f24918d     // Catch:{ all -> 0x002a }
            int r1 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch:{ all -> 0x002a }
            if (r1 >= 0) goto L_0x001b
            int r1 = -r1
            int r1 = r1 + -1
        L_0x001b:
            java.util.List r2 = r3.f24920b     // Catch:{ all -> 0x002a }
            r2.add(r1, r4)     // Catch:{ all -> 0x002a }
            int r4 = r3.f24921c     // Catch:{ all -> 0x002a }
            int r4 = r4 + r0
            r3.f24921c = r4     // Catch:{ all -> 0x002a }
            r3.m41669c()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002d:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaku.mo41613a(byte[]):void");
    }

    /* renamed from: b */
    public final synchronized byte[] mo41614b(int i) {
        for (int i2 = 0; i2 < this.f24920b.size(); i2++) {
            byte[] bArr = (byte[]) this.f24920b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f24921c -= length;
                this.f24920b.remove(i2);
                this.f24919a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
