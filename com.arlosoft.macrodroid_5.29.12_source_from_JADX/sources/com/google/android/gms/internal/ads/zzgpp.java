package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpp extends zzgps {
    private final int zzc;
    private final int zzd;

    zzgpp(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgpw.m52561J(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final int mo47080a0() {
        return this.zzc;
    }

    /* renamed from: j */
    public final byte mo47081j(int i) {
        zzgpw.m52569d(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final byte mo47082k(int i) {
        return this.zza[this.zzc + i];
    }

    /* renamed from: m */
    public final int mo47083m() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo47084n(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
