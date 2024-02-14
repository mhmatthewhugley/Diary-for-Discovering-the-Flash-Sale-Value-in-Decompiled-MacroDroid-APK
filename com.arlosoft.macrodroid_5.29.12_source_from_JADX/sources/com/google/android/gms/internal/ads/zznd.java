package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zznd {

    /* renamed from: c */
    public static final zznd f37939c = new zznd(new int[]{2}, 8);

    /* renamed from: d */
    private static final zznd f37940d = new zznd(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final zzfvq f37941e;

    /* renamed from: a */
    private final int[] f37942a;

    /* renamed from: b */
    private final int f37943b = 8;

    static {
        zzfvp zzfvp = new zzfvp();
        zzfvp.mo46447a(5, 6);
        zzfvp.mo46447a(17, 6);
        zzfvp.mo46447a(7, 6);
        zzfvp.mo46447a(18, 6);
        zzfvp.mo46447a(6, 8);
        zzfvp.mo46447a(8, 8);
        zzfvp.mo46447a(14, 8);
        f37941e = zzfvp.mo46449c();
    }

    public zznd(@Nullable int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f37942a = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r7 != 5) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo47867a(com.google.android.gms.internal.ads.zzaf r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f24213l
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r10.f24210i
            int r0 = com.google.android.gms.internal.ads.zzbt.m44088a(r0, r1)
            com.google.android.gms.internal.ads.zzfvq r1 = f37941e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0019
            return r3
        L_0x0019:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L_0x002b
            boolean r0 = r9.mo47868c(r6)
            if (r0 != 0) goto L_0x0029
            r0 = 6
            goto L_0x0034
        L_0x0029:
            r0 = 18
        L_0x002b:
            if (r0 != r5) goto L_0x0034
            boolean r7 = r9.mo47868c(r5)
            if (r7 != 0) goto L_0x0034
            r0 = 7
        L_0x0034:
            boolean r7 = r9.mo47868c(r0)
            if (r7 != 0) goto L_0x003b
            return r3
        L_0x003b:
            int r7 = r10.f24226y
            r8 = -1
            if (r7 == r8) goto L_0x0046
            if (r0 != r6) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            if (r7 <= r5) goto L_0x006e
            return r3
        L_0x0046:
            int r10 = r10.f24227z
            if (r10 != r8) goto L_0x004d
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x004d:
            int r6 = com.google.android.gms.internal.ads.zzen.f34500a
            r7 = 29
            if (r6 < r7) goto L_0x0058
            int r7 = com.google.android.gms.internal.ads.zznc.m54298a(r0, r10)
            goto L_0x006e
        L_0x0058:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r7 = r10.intValue()
        L_0x006e:
            int r10 = com.google.android.gms.internal.ads.zzen.f34500a
            r1 = 28
            if (r10 > r1) goto L_0x0083
            if (r7 != r2) goto L_0x0079
            r4 = 8
            goto L_0x0084
        L_0x0079:
            r1 = 3
            if (r7 == r1) goto L_0x0084
            r1 = 4
            if (r7 == r1) goto L_0x0084
            r1 = 5
            if (r7 != r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r4 = r7
        L_0x0084:
            r1 = 26
            if (r10 > r1) goto L_0x0096
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0096
            r10 = 1
            if (r4 != r10) goto L_0x0096
            r4 = 2
        L_0x0096:
            int r10 = com.google.android.gms.internal.ads.zzen.m49145T(r4)
            if (r10 != 0) goto L_0x009d
            return r3
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznd.mo47867a(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    /* renamed from: c */
    public final boolean mo47868c(int i) {
        return Arrays.binarySearch(this.f37942a, i) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zznd) && Arrays.equals(this.f37942a, ((zznd) obj).f37942a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f37942a) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f37942a);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }
}
