package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrl implements zztb {

    /* renamed from: a */
    private final zzzp f38357a;
    @Nullable

    /* renamed from: b */
    private zzzi f38358b;
    @Nullable

    /* renamed from: c */
    private zzzj f38359c;

    public zzrl(zzzp zzzp) {
        this.f38357a = zzzp;
    }

    /* renamed from: a */
    public final void mo48117a() {
        zzzi zzzi = this.f38358b;
        if (zzzi instanceof zzaeq) {
            ((zzaeq) zzzi).mo41414b();
        }
    }

    /* renamed from: b */
    public final void mo48118b() {
        if (this.f38358b != null) {
            this.f38358b = null;
        }
        this.f38359c = null;
    }

    /* renamed from: c */
    public final int mo48119c(zzaai zzaai) throws IOException {
        zzzi zzzi = this.f38358b;
        Objects.requireNonNull(zzzi);
        zzzj zzzj = this.f38359c;
        Objects.requireNonNull(zzzj);
        return zzzi.mo41230h(zzzj, zzaai);
    }

    /* renamed from: d */
    public final void mo48120d(long j, long j2) {
        zzzi zzzi = this.f38358b;
        Objects.requireNonNull(zzzi);
        zzzi.mo41229g(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.mo41252c() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.mo41252c() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48121e(com.google.android.gms.internal.ads.zzr r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzzl r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzyy r6 = new com.google.android.gms.internal.ads.zzyy
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f38359c = r6
            com.google.android.gms.internal.ads.zzzi r8 = r7.f38358b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zzzp r8 = r7.f38357a
            com.google.android.gms.internal.ads.zzzi[] r8 = r8.mo41225a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f38358b = r8
            goto L_0x0074
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.mo41227a(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r2 == 0) goto L_0x0034
            r7.f38358b = r1     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.android.gms.internal.ads.zzdd.m47212f(r14)
            r6.mo48452h()
            goto L_0x0070
        L_0x0034:
            com.google.android.gms.internal.ads.zzzi r1 = r7.f38358b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.mo41252c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0041:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzzi r9 = r7.f38358b
            if (r9 != 0) goto L_0x004e
            long r9 = r6.mo41252c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            com.google.android.gms.internal.ads.zzdd.m47212f(r13)
            r6.mo48452h()
            throw r8
        L_0x0056:
            com.google.android.gms.internal.ads.zzzi r1 = r7.f38358b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.mo41252c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            com.google.android.gms.internal.ads.zzdd.m47212f(r1)
            r6.mo48452h()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0070:
            com.google.android.gms.internal.ads.zzzi r10 = r7.f38358b
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            com.google.android.gms.internal.ads.zzzi r8 = r7.f38358b
            r8.mo41228d(r15)
            return
        L_0x007a:
            com.google.android.gms.internal.ads.zzui r10 = new com.google.android.gms.internal.ads.zzui
            java.lang.String r8 = com.google.android.gms.internal.ads.zzen.m49172k(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrl.mo48121e(com.google.android.gms.internal.ads.zzr, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzzl):void");
    }

    public final long zzb() {
        zzzj zzzj = this.f38359c;
        if (zzzj != null) {
            return zzzj.mo41252c();
        }
        return -1;
    }
}
