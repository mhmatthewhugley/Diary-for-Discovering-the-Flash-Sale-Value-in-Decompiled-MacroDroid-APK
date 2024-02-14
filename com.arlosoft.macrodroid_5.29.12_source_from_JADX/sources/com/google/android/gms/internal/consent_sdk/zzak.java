package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzak implements zzg {

    /* renamed from: a */
    private final Application f39320a;

    /* renamed from: b */
    private final zzam f39321b;

    /* renamed from: c */
    private final Executor f39322c;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48672a(java.lang.String r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "write"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0025
            r9 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "clear"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0025
            r9 = 1
            goto L_0x0026
        L_0x0025:
            r9 = -1
        L_0x0026:
            if (r9 == 0) goto L_0x007f
            if (r9 == r3) goto L_0x002b
            return r2
        L_0x002b:
            java.lang.String r9 = "keys"
            org.json.JSONArray r9 = r10.optJSONArray(r9)
            if (r9 == 0) goto L_0x006b
            int r0 = r9.length()
            if (r0 != 0) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r0 = r9.length()
        L_0x0043:
            if (r2 >= r0) goto L_0x0065
            java.lang.String r1 = r9.optString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x005f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 46
            r1.<init>(r4)
            java.lang.String r4 = "Action[clear]: empty key at index: "
            r1.append(r4)
            r1.append(r2)
            goto L_0x0062
        L_0x005f:
            r10.add(r1)
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0065:
            android.app.Application r9 = r8.f39320a
            com.google.android.gms.internal.consent_sdk.zzca.m55969b(r9, r10)
            goto L_0x007e
        L_0x006b:
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r10 = r9.length()
            if (r10 == 0) goto L_0x007e
            java.lang.String r10 = "Action[clear]: wrong args."
            r10.concat(r9)
        L_0x007e:
            return r3
        L_0x007f:
            com.google.android.gms.internal.consent_sdk.zzbz r9 = new com.google.android.gms.internal.consent_sdk.zzbz
            android.app.Application r0 = r8.f39320a
            r9.<init>(r0)
            java.util.Iterator r0 = r10.keys()
        L_0x008a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r10.opt(r1)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r6 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 23
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Writing to storage: ["
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = "] "
            r7.append(r5)
            r7.append(r4)
            boolean r2 = r9.mo48712c(r1, r2)
            if (r2 == 0) goto L_0x00d2
            com.google.android.gms.internal.consent_sdk.zzam r2 = r8.f39321b
            java.util.Set r2 = r2.mo48675b()
            r2.add(r1)
            goto L_0x008a
        L_0x00d2:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "Failed writing key: "
            r2.concat(r1)
            goto L_0x008a
        L_0x00e2:
            com.google.android.gms.internal.consent_sdk.zzam r10 = r8.f39321b
            r10.mo48676c()
            r9.mo48711b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzak.mo48672a(java.lang.String, org.json.JSONObject):boolean");
    }

    public final Executor zza() {
        return this.f39322c;
    }
}
