package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgf {
    @Nullable

    /* renamed from: a */
    public byte[] f36756a;
    @Nullable

    /* renamed from: b */
    public byte[] f36757b;

    /* renamed from: c */
    public int f36758c;
    @Nullable

    /* renamed from: d */
    public int[] f36759d;
    @Nullable

    /* renamed from: e */
    public int[] f36760e;

    /* renamed from: f */
    public int f36761f;

    /* renamed from: g */
    public int f36762g;

    /* renamed from: h */
    public int f36763h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f36764i;
    @Nullable

    /* renamed from: j */
    private final zzge f36765j;

    public zzgf() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f36764i = cryptoInfo;
        this.f36765j = zzen.f34500a >= 24 ? new zzge(cryptoInfo, (zzgd) null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo46768a() {
        return this.f36764i;
    }

    /* renamed from: b */
    public final void mo46769b(int i) {
        if (i != 0) {
            if (this.f36759d == null) {
                int[] iArr = new int[1];
                this.f36759d = iArr;
                this.f36764i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f36759d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public final void mo46770c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f36761f = i;
        this.f36759d = iArr;
        this.f36760e = iArr2;
        this.f36757b = bArr;
        this.f36756a = bArr2;
        this.f36758c = i2;
        this.f36762g = i3;
        this.f36763h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f36764i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (zzen.f34500a >= 24) {
            zzge zzge = this.f36765j;
            Objects.requireNonNull(zzge);
            zzge.m51743a(zzge, i3, i4);
        }
    }
}
