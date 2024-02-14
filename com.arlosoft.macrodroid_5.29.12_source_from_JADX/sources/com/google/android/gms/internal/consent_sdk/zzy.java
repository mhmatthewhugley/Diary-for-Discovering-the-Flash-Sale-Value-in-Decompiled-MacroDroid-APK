package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzy {

    /* renamed from: a */
    private final zzz f39453a;

    /* renamed from: b */
    private final zzbw f39454b;

    /* renamed from: c */
    private int f39455c = 0;

    zzy(zzz zzz, zzbw zzbw) {
        this.f39453a = zzz;
        this.f39454b = zzbw;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.consent_sdk.zzaa mo48729a() throws com.google.android.gms.internal.consent_sdk.zzj {
        /*
            r11 = this;
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r11.f39454b
            int r1 = r0.f39401f
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00c4
            r1 = 2
            r4 = 3
            r5 = 1
            switch(r2) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0059;
                case 4: goto L_0x0056;
                case 5: goto L_0x0053;
                case 6: goto L_0x0035;
                case 7: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            com.google.android.gms.internal.consent_sdk.zzj r0 = new com.google.android.gms.internal.consent_sdk.zzj
            java.lang.String r1 = "Invalid response from server."
            r0.<init>(r5, r1)
            throw r0
        L_0x0017:
            com.google.android.gms.internal.consent_sdk.zzj r1 = new com.google.android.gms.internal.consent_sdk.zzj
            java.lang.String r0 = r0.f39398c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x002c
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0031
        L_0x002c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0031:
            r1.<init>(r4, r0)
            throw r1
        L_0x0035:
            com.google.android.gms.internal.consent_sdk.zzj r1 = new com.google.android.gms.internal.consent_sdk.zzj
            java.lang.String r0 = r0.f39398c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = r2.concat(r0)
            goto L_0x004f
        L_0x004a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x004f:
            r1.<init>(r5, r0)
            throw r1
        L_0x0053:
            r11.f39455c = r5
            goto L_0x005b
        L_0x0056:
            r11.f39455c = r1
            goto L_0x005b
        L_0x0059:
            r11.f39455c = r4
        L_0x005b:
            java.lang.String r2 = r0.f39396a
            if (r2 != 0) goto L_0x0061
            r4 = r3
            goto L_0x0068
        L_0x0061:
            com.google.android.gms.internal.consent_sdk.zzbc r4 = new com.google.android.gms.internal.consent_sdk.zzbc
            java.lang.String r0 = r0.f39397b
            r4.<init>(r0, r2)
        L_0x0068:
            com.google.android.gms.internal.consent_sdk.zzz r0 = r11.f39453a
            com.google.android.gms.internal.consent_sdk.zzam r0 = r0.f39458c
            java.util.HashSet r2 = new java.util.HashSet
            com.google.android.gms.internal.consent_sdk.zzbw r6 = r11.f39454b
            java.util.List<java.lang.String> r6 = r6.f39399d
            r2.<init>(r6)
            r0.mo48678e(r2)
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r11.f39454b
            java.util.List<com.google.android.gms.internal.consent_sdk.zzbv> r0 = r0.f39400e
            java.util.Iterator r0 = r0.iterator()
        L_0x0082:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.consent_sdk.zzbv r2 = (com.google.android.gms.internal.consent_sdk.zzbv) r2
            int r6 = r2.f39395b
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x00bb
            if (r7 == 0) goto L_0x00a1
            if (r7 == r5) goto L_0x009e
            if (r7 == r1) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            java.lang.String r6 = "clear"
            goto L_0x00a2
        L_0x009e:
            java.lang.String r6 = "write"
            goto L_0x00a2
        L_0x00a1:
            r6 = r3
        L_0x00a2:
            if (r6 == 0) goto L_0x0082
            com.google.android.gms.internal.consent_sdk.zzz r7 = r11.f39453a
            com.google.android.gms.internal.consent_sdk.zzh r7 = r7.f39456a
            java.lang.String r2 = r2.f39394a
            com.google.android.gms.internal.consent_sdk.zzg[] r8 = new com.google.android.gms.internal.consent_sdk.zzg[r5]
            r9 = 0
            com.google.android.gms.internal.consent_sdk.zzz r10 = r11.f39453a
            com.google.android.gms.internal.consent_sdk.zzak r10 = r10.f39457b
            r8[r9] = r10
            r7.mo48719b(r6, r2, r8)
            goto L_0x0082
        L_0x00bb:
            throw r3
        L_0x00bc:
            com.google.android.gms.internal.consent_sdk.zzaa r0 = new com.google.android.gms.internal.consent_sdk.zzaa
            int r1 = r11.f39455c
            r0.<init>(r1, r4, r3)
            return r0
        L_0x00c4:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzy.mo48729a():com.google.android.gms.internal.consent_sdk.zzaa");
    }
}
