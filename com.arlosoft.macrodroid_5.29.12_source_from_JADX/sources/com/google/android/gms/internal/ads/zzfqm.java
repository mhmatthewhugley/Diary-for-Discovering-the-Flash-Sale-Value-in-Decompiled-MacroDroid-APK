package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqm extends zzfre {

    /* renamed from: a */
    private final int f36276a;

    /* renamed from: b */
    private final String f36277b;

    /* synthetic */ zzfqm(int i, String str, zzfql zzfql) {
        this.f36276a = i;
        this.f36277b = str;
    }

    /* renamed from: a */
    public final int mo46114a() {
        return this.f36276a;
    }

    @Nullable
    /* renamed from: b */
    public final String mo46115b() {
        return this.f36277b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f36277b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfre
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzfre r5 = (com.google.android.gms.internal.ads.zzfre) r5
            int r1 = r4.f36276a
            int r3 = r5.mo46114a()
            if (r1 != r3) goto L_0x002a
            java.lang.String r1 = r4.f36277b
            if (r1 != 0) goto L_0x001e
            java.lang.String r5 = r5.mo46115b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.String r5 = r5.mo46115b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqm.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f36276a ^ 1000003) * 1000003;
        String str = this.f36277b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f36276a;
        String str = this.f36277b;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }
}
