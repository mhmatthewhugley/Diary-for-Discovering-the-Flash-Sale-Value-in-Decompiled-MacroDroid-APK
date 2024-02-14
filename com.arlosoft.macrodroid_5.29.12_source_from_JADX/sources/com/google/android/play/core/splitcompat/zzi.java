package com.google.android.play.core.splitcompat;

import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzi implements zzk {

    /* renamed from: a */
    final /* synthetic */ Set f51778a;

    /* renamed from: b */
    final /* synthetic */ zzs f51779b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f51780c;

    zzi(zzm zzm, Set set, zzs zzs, ZipFile zipFile) {
        this.f51778a = set;
        this.f51779b = zzs;
        this.f51780c = zipFile;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0072 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59954a(com.google.android.play.core.splitcompat.zzl r4, java.io.File r5, boolean r6) throws java.io.IOException {
        /*
            r3 = this;
            java.util.Set r0 = r3.f51778a
            r0.add(r5)
            if (r6 != 0) goto L_0x007a
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.google.android.play.core.splitcompat.zzs r0 = r3.f51779b
            java.lang.String r0 = r0.mo59936b()
            r1 = 0
            r6[r1] = r0
            r0 = 1
            java.lang.String r2 = r4.f51781a
            r6[r0] = r2
            r0 = 2
            com.google.android.play.core.splitcompat.zzs r2 = r3.f51779b
            java.io.File r2 = r2.mo59935a()
            java.lang.String r2 = r2.getAbsolutePath()
            r6[r0] = r2
            r0 = 3
            java.util.zip.ZipEntry r2 = r4.f51782b
            java.lang.String r2 = r2.getName()
            r6[r0] = r2
            r0 = 4
            java.lang.String r2 = r5.getAbsolutePath()
            r6[r0] = r2
            java.lang.String r0 = "NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            java.lang.String r0 = "SplitCompat"
            android.util.Log.i(r0, r6)
            java.util.zip.ZipFile r6 = r3.f51780c
            java.util.zip.ZipEntry r4 = r4.f51782b
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x0051
            r5.delete()
        L_0x0051:
            java.io.InputStream r4 = r6.getInputStream(r4)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0073 }
            r6.<init>(r5)     // Catch:{ all -> 0x0073 }
            com.google.android.play.core.splitcompat.zze.m71070m(r5)     // Catch:{ all -> 0x006e }
        L_0x005d:
            int r5 = r4.read(r0)     // Catch:{ all -> 0x006e }
            if (r5 <= 0) goto L_0x0067
            r6.write(r0, r1, r5)     // Catch:{ all -> 0x006e }
            goto L_0x005d
        L_0x0067:
            r6.close()     // Catch:{ all -> 0x0073 }
            r4.close()
            return
        L_0x006e:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            throw r5     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r5 = move-exception
            if (r4 == 0) goto L_0x0079
            r4.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r5
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.zzi.mo59954a(com.google.android.play.core.splitcompat.zzl, java.io.File, boolean):void");
    }
}
