package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaup {

    /* renamed from: a */
    public byte[] f25693a;

    /* renamed from: b */
    public byte[] f25694b;

    /* renamed from: c */
    public int f25695c;

    /* renamed from: d */
    public int[] f25696d;

    /* renamed from: e */
    public int[] f25697e;

    /* renamed from: f */
    public int f25698f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f25699g;

    /* renamed from: h */
    private final zzauo f25700h;

    public zzaup() {
        int i = zzbar.f26418a;
        zzauo zzauo = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f25699g = cryptoInfo;
        this.f25700h = i >= 24 ? new zzauo(cryptoInfo, (zzaun) null) : zzauo;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo42071a() {
        return this.f25699g;
    }

    /* renamed from: b */
    public final void mo42072b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f25698f = i;
        this.f25696d = iArr;
        this.f25697e = iArr2;
        this.f25694b = bArr;
        this.f25693a = bArr2;
        this.f25695c = 1;
        int i3 = zzbar.f26418a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f25699g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                zzauo.m42549a(this.f25700h, 0, 0);
            }
        }
    }
}
