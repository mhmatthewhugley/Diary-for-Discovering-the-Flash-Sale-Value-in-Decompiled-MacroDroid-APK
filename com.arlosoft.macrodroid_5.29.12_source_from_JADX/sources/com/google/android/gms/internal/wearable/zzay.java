package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzay extends zzba {

    /* renamed from: b */
    private final byte[] f45544b;

    /* renamed from: c */
    private int f45545c;

    /* renamed from: d */
    private int f45546d;

    /* renamed from: e */
    private int f45547e = Integer.MAX_VALUE;

    /* synthetic */ zzay(byte[] bArr, int i, int i2, boolean z, zzax zzax) {
        super((zzaz) null);
        this.f45544b = bArr;
        this.f45545c = 0;
    }

    /* renamed from: a */
    public final int mo53844a(int i) throws zzcf {
        int i2 = this.f45547e;
        this.f45547e = 0;
        int i3 = this.f45545c + this.f45546d;
        this.f45545c = i3;
        if (i3 > 0) {
            this.f45546d = i3;
            this.f45545c = 0;
        } else {
            this.f45546d = 0;
        }
        return i2;
    }
}
