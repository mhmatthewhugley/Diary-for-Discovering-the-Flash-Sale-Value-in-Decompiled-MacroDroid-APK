package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzatj {

    /* renamed from: c */
    public static final zzatj f25548c = new zzatj(new int[]{2}, 2);

    /* renamed from: a */
    private final int[] f25549a;

    /* renamed from: b */
    private final int f25550b = 2;

    zzatj(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.f25549a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzatj) && Arrays.equals(this.f25549a, ((zzatj) obj).f25549a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f25549a) * 31) + 2;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f25549a);
        return "AudioCapabilities[maxChannelCount=2, supportedEncodings=" + arrays + "]";
    }
}
