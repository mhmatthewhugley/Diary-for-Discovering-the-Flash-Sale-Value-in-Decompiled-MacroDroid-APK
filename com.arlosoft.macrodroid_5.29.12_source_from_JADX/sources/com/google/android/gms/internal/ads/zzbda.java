package com.google.android.gms.internal.ads;

import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbda extends zzbcr {

    /* renamed from: c */
    private MessageDigest f26643c;

    /* renamed from: d */
    private final int f26644d;

    /* renamed from: e */
    private final int f26645e;

    public zzbda(int i) {
        int i2 = i >> 3;
        this.f26644d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f26645e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo42483b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f26630a
            monitor-enter(r0)
            java.security.MessageDigest r1 = r8.mo42482a()     // Catch:{ all -> 0x0064 }
            r8.f26643c = r1     // Catch:{ all -> 0x0064 }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return r9
        L_0x0010:
            r1.reset()     // Catch:{ all -> 0x0064 }
            java.security.MessageDigest r1 = r8.f26643c     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x0064 }
            byte[] r9 = r9.getBytes(r3)     // Catch:{ all -> 0x0064 }
            r1.update(r9)     // Catch:{ all -> 0x0064 }
            java.security.MessageDigest r9 = r8.f26643c     // Catch:{ all -> 0x0064 }
            byte[] r9 = r9.digest()     // Catch:{ all -> 0x0064 }
            int r1 = r9.length     // Catch:{ all -> 0x0064 }
            int r3 = r8.f26644d     // Catch:{ all -> 0x0064 }
            if (r1 <= r3) goto L_0x002e
            r1 = r3
        L_0x002e:
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0064 }
            java.lang.System.arraycopy(r9, r2, r3, r2, r1)     // Catch:{ all -> 0x0064 }
            int r9 = r8.f26645e     // Catch:{ all -> 0x0064 }
            r9 = r9 & 7
            if (r9 <= 0) goto L_0x0062
            r4 = 0
        L_0x003b:
            r9 = 8
            if (r2 >= r1) goto L_0x004b
            if (r2 <= 0) goto L_0x0042
            long r4 = r4 << r9
        L_0x0042:
            byte r9 = r3[r2]     // Catch:{ all -> 0x0064 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r6 = (long) r9     // Catch:{ all -> 0x0064 }
            long r4 = r4 + r6
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004b:
            int r1 = r8.f26645e     // Catch:{ all -> 0x0064 }
            r1 = r1 & 7
            int r1 = 8 - r1
            long r1 = r4 >>> r1
            int r4 = r8.f26644d     // Catch:{ all -> 0x0064 }
        L_0x0055:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0062
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r1
            int r6 = (int) r5     // Catch:{ all -> 0x0064 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x0064 }
            r3[r4] = r5     // Catch:{ all -> 0x0064 }
            long r1 = r1 >>> r9
            goto L_0x0055
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return r3
        L_0x0064:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbda.mo42483b(java.lang.String):byte[]");
    }
}
