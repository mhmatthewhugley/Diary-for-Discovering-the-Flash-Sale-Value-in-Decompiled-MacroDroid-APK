package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzabw extends zzabz {
    private final int zzc;

    zzabw(byte[] bArr, int i, int i2) {
        super(bArr);
        zzacc.m56158p(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final int mo48890I() {
        return 0;
    }

    /* renamed from: c */
    public final byte mo48891c(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte mo48892d(int i) {
        return this.zza[i];
    }

    /* renamed from: f */
    public final int mo48893f() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo48894h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }
}
