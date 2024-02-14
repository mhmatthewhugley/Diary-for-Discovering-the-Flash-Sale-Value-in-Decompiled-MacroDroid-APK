package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjg extends zzji {

    /* renamed from: b */
    private final byte[] f41542b;

    /* renamed from: c */
    private int f41543c;

    /* renamed from: d */
    private int f41544d;

    /* renamed from: e */
    private int f41545e = Integer.MAX_VALUE;

    /* synthetic */ zzjg(byte[] bArr, int i, int i2, boolean z, zzjf zzjf) {
        super((zzjh) null);
        this.f41542b = bArr;
        this.f41543c = 0;
    }

    /* renamed from: c */
    public final int mo51350c(int i) throws zzkp {
        int i2 = this.f41545e;
        this.f41545e = 0;
        int i3 = this.f41543c + this.f41544d;
        this.f41543c = i3;
        if (i3 > 0) {
            this.f41544d = i3;
            this.f41543c = i3 - i3;
        } else {
            this.f41544d = 0;
        }
        return i2;
    }
}
