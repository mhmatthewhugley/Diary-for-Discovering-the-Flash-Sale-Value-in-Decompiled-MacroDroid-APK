package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzco;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzeg {

    /* renamed from: c */
    private static final zzag f51562c = new zzag("PatchSliceTaskHandler");

    /* renamed from: a */
    private final zzbh f51563a;

    /* renamed from: b */
    private final zzco f51564b;

    zzeg(zzbh zzbh, zzco zzco) {
        this.f51563a = zzbh;
        this.f51564b = zzco;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00ab */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59754a(com.google.android.play.core.assetpacks.zzef r15) {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r14.f51563a
            java.lang.String r1 = r15.f51464b
            int r2 = r15.f51554c
            long r3 = r15.f51555d
            java.io.File r0 = r0.mo59647v(r1, r2, r3)
            com.google.android.play.core.assetpacks.zzbh r1 = r14.f51563a
            java.lang.String r2 = r15.f51464b
            int r3 = r15.f51554c
            long r4 = r15.f51555d
            java.lang.String r6 = r15.f51559h
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.mo59648w(r2, r3, r4)
            r7.<init>(r1, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.f51561j     // Catch:{ IOException -> 0x00ac }
            int r5 = r15.f51558g     // Catch:{ IOException -> 0x00ac }
            if (r5 == r1) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00ac }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x00ac }
            r4 = r5
        L_0x0031:
            com.google.android.play.core.assetpacks.zzbk r5 = new com.google.android.play.core.assetpacks.zzbk     // Catch:{ all -> 0x00a7 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.zzbh r8 = r14.f51563a     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = r15.f51464b     // Catch:{ all -> 0x00a7 }
            int r10 = r15.f51556e     // Catch:{ all -> 0x00a7 }
            long r11 = r15.f51557f     // Catch:{ all -> 0x00a7 }
            java.lang.String r13 = r15.f51559h     // Catch:{ all -> 0x00a7 }
            java.io.File r0 = r8.mo59625D(r9, r10, r11, r13)     // Catch:{ all -> 0x00a7 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x00a7 }
            if (r6 != 0) goto L_0x004d
            r0.mkdirs()     // Catch:{ all -> 0x00a7 }
        L_0x004d:
            com.google.android.play.core.assetpacks.zzen r13 = new com.google.android.play.core.assetpacks.zzen     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.zzbh r7 = r14.f51563a     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r15.f51464b     // Catch:{ all -> 0x00a7 }
            int r9 = r15.f51556e     // Catch:{ all -> 0x00a7 }
            long r10 = r15.f51557f     // Catch:{ all -> 0x00a7 }
            java.lang.String r12 = r15.f51559h     // Catch:{ all -> 0x00a7 }
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.zzcn r6 = new com.google.android.play.core.assetpacks.zzcn     // Catch:{ all -> 0x00a7 }
            r6.<init>(r0, r13)     // Catch:{ all -> 0x00a7 }
            long r7 = r15.f51560i     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.internal.zzcl.m70932a(r5, r4, r6, r7)     // Catch:{ all -> 0x00a7 }
            r13.mo59766i(r3)     // Catch:{ all -> 0x00a7 }
            r4.close()     // Catch:{ IOException -> 0x00ac }
            com.google.android.play.core.internal.zzag r0 = f51562c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f51559h
            r4[r3] = r5
            java.lang.String r5 = r15.f51464b
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.mo59808d(r5, r4)
            com.google.android.play.core.internal.zzco r0 = r14.f51564b
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            int r4 = r15.f51463a
            java.lang.String r5 = r15.f51464b
            java.lang.String r6 = r15.f51559h
            r0.mo59610e(r4, r5, r6, r3)
            java.io.InputStream r0 = r15.f51561j     // Catch:{ IOException -> 0x0095 }
            r0.close()     // Catch:{ IOException -> 0x0095 }
            return
        L_0x0095:
            com.google.android.play.core.internal.zzag r0 = f51562c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.f51559h
            r1[r3] = r4
            java.lang.String r15 = r15.f51464b
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.mo59809e(r15, r1)
            return
        L_0x00a7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r4 = f51562c
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.mo59806b(r6, r5)
            com.google.android.play.core.assetpacks.zzck r4 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f51559h
            r1[r3] = r5
            java.lang.String r3 = r15.f51464b
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.f51463a
            r4.<init>(r1, r0, r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzeg.mo59754a(com.google.android.play.core.assetpacks.zzef):void");
    }
}
