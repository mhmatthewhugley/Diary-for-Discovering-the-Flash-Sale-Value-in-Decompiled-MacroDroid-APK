package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ApiException extends Exception {
    @NonNull
    @Deprecated
    protected final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.mo21294n2()
            java.lang.String r1 = r4.mo21295o2()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.mo21295o2()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    /* renamed from: a */
    public Status mo21209a() {
        return this.mStatus;
    }

    /* renamed from: b */
    public int mo21210b() {
        return this.mStatus.mo21294n2();
    }
}
