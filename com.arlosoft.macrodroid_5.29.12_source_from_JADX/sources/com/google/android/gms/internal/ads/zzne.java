package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzne {

    /* renamed from: e */
    public static final zzne f37944e = new zzne(-1, -1, -1);

    /* renamed from: a */
    public final int f37945a;

    /* renamed from: b */
    public final int f37946b;

    /* renamed from: c */
    public final int f37947c;

    /* renamed from: d */
    public final int f37948d;

    public zzne(int i, int i2, int i3) {
        this.f37945a = i;
        this.f37946b = i2;
        this.f37947c = i3;
        this.f37948d = zzen.m49183v(i3) ? zzen.m49150Y(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f37945a;
        int i2 = this.f37946b;
        int i3 = this.f37947c;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
