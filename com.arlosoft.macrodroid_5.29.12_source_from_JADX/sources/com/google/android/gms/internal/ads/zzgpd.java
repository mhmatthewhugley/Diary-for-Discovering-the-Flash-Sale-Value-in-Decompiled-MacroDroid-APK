package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpd {

    /* renamed from: a */
    private final byte[] f36991a = new byte[256];

    /* renamed from: b */
    private int f36992b;

    /* renamed from: c */
    private int f36993c;

    public zzgpd(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f36991a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f36991a;
            byte b2 = bArr2[i2];
            b = (b + b2 + bArr[i2 % bArr.length]) & 255;
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f36992b = 0;
        this.f36993c = 0;
    }

    /* renamed from: a */
    public final void mo47042a(byte[] bArr) {
        int i = this.f36992b;
        int i2 = this.f36993c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f36991a;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f36992b = i;
        this.f36993c = i2;
    }
}
