package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfol {

    /* renamed from: a */
    private final zzary f36197a;

    /* renamed from: b */
    private final File f36198b;

    /* renamed from: c */
    private final File f36199c;

    /* renamed from: d */
    private final File f36200d;

    /* renamed from: e */
    private byte[] f36201e;

    public zzfol(@NonNull zzary zzary, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.f36197a = zzary;
        this.f36198b = file;
        this.f36199c = file3;
        this.f36200d = file2;
    }

    /* renamed from: a */
    public final zzary mo46039a() {
        return this.f36197a;
    }

    /* renamed from: b */
    public final File mo46040b() {
        return this.f36199c;
    }

    /* renamed from: c */
    public final File mo46041c() {
        return this.f36198b;
    }

    /* renamed from: d */
    public final boolean mo46042d(long j) {
        return this.f36197a.mo41861G() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo46043e() {
        /*
            r3 = this;
            byte[] r0 = r3.f36201e
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.io.File r0 = r3.f36200d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            com.google.android.gms.internal.ads.zzgpw r0 = com.google.android.gms.internal.ads.zzgpw.m52567W(r2)     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            byte[] r0 = r0.mo47109i()     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            com.google.android.gms.common.util.IOUtils.m4889b(r2)
            goto L_0x0025
        L_0x0018:
            r0 = move-exception
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            com.google.android.gms.common.util.IOUtils.m4889b(r1)
            throw r0
        L_0x0020:
            r2 = r1
        L_0x0021:
            com.google.android.gms.common.util.IOUtils.m4889b(r2)
            r0 = r1
        L_0x0025:
            r3.f36201e = r0
        L_0x0027:
            byte[] r0 = r3.f36201e
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfol.mo46043e():byte[]");
    }
}
