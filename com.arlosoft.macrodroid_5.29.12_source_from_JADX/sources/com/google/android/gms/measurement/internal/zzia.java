package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

@WorkerThread
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzia implements Runnable {

    /* renamed from: a */
    private final URL f47053a;

    /* renamed from: c */
    private final String f47054c;

    /* renamed from: d */
    final /* synthetic */ zzib f47055d;

    /* renamed from: f */
    private final zzfp f47056f;

    public zzia(zzib zzib, String str, URL url, byte[] bArr, Map map, zzfp zzfp, byte[] bArr2) {
        this.f47055d = zzib;
        Preconditions.m4484g(str);
        Preconditions.m4488k(url);
        Preconditions.m4488k(zzfp);
        this.f47053a = url;
        this.f47056f = zzfp;
        this.f47054c = str;
    }

    /* renamed from: b */
    private final void m65892b(int i, Exception exc, byte[] bArr, Map map) {
        this.f47055d.f46899a.mo55185B().mo55181x(new zzhz(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo55397a(int i, Exception exc, byte[] bArr, Map map) {
        zzfp zzfp = this.f47056f;
        zzfp.f46808a.mo55204e(this.f47054c, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC, Splitter:B:26:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r9.f47055d
            r0.mo55176d()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzib r2 = r9.f47055d     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URL r3 = r9.f47053a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            if (r4 == 0) goto L_0x007c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.zzfr r4 = r2.f46899a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4.mo55219x()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2.mo55219x()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0064 }
            r5.<init>()     // Catch:{ all -> 0x0064 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0064 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0062 }
        L_0x004a:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0062 }
            if (r8 <= 0) goto L_0x0054
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
            r3.disconnect()
            r9.m65892b(r2, r1, r0, r4)
            return
        L_0x0062:
            r0 = move-exception
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            r6 = r1
        L_0x0066:
            if (r6 == 0) goto L_0x006b
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006b:
            throw r0     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            goto L_0x0089
        L_0x006e:
            r0 = move-exception
            goto L_0x0097
        L_0x0070:
            r0 = move-exception
            r4 = r1
            goto L_0x0089
        L_0x0073:
            r0 = move-exception
            r4 = r1
            goto L_0x0097
        L_0x0076:
            r2 = move-exception
            r4 = r1
            goto L_0x0087
        L_0x0079:
            r2 = move-exception
            r4 = r1
            goto L_0x0095
        L_0x007c:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            throw r2     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
        L_0x0084:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0087:
            r0 = r2
            r2 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x008e
            r3.disconnect()
        L_0x008e:
            r9.m65892b(r2, r1, r1, r4)
            throw r0
        L_0x0092:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0095:
            r0 = r2
            r2 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.disconnect()
        L_0x009c:
            r9.m65892b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.run():void");
    }
}
