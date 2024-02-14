package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class zzabz extends zzaby {
    protected final byte[] zza;

    zzabz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public int mo48890I() {
        return 0;
    }

    /* renamed from: c */
    public byte mo48891c(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo48892d(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacc) || mo48893f() != ((zzacc) obj).mo48893f()) {
            return false;
        }
        if (mo48893f() == 0) {
            return true;
        }
        if (!(obj instanceof zzabz)) {
            return obj.equals(this);
        }
        zzabz zzabz = (zzabz) obj;
        int q = mo48907q();
        int q2 = zzabz.mo48907q();
        if (q != 0 && q2 != 0 && q != q2) {
            return false;
        }
        int f = mo48893f();
        if (f > zzabz.mo48893f()) {
            int f2 = mo48893f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= zzabz.mo48893f()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzabz.zza;
            zzabz.mo48890I();
            int i = 0;
            int i2 = 0;
            while (i < f) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int f3 = zzabz.mo48893f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo48893f() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo48894h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo48896i(int i, int i2, int i3) {
        return zzadl.m56460d(i, this.zza, 0, i3);
    }

    /* renamed from: j */
    public final zzacc mo48897j(int i, int i2) {
        int p = zzacc.m56158p(0, i2, mo48893f());
        if (p == 0) {
            return zzacc.f39635a;
        }
        return new zzabw(this.zza, 0, p);
    }

    /* renamed from: k */
    public final zzacg mo48898k() {
        return zzacg.m56198n(this.zza, 0, mo48893f(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo48899l(Charset charset) {
        return new String(this.zza, 0, mo48893f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo48900m(zzabs zzabs) throws IOException {
        zzabs.mo48884a(this.zza, 0, mo48893f());
    }

    /* renamed from: n */
    public final boolean mo48901n() {
        return zzagc.m56877f(this.zza, 0, mo48893f());
    }
}
