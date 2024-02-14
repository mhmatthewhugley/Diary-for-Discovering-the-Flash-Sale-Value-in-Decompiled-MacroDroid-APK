package com.google.android.gms.internal.places;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

class zzag extends zzad {
    protected final byte[] zzen;

    zzag(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzen = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo53309B() {
        return 0;
    }

    /* renamed from: d */
    public final boolean mo53310d() {
        int B = mo53309B();
        return zzea.m63763h(this.zzen, B, size() + B);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzw) || size() != ((zzw) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return obj.equals(this);
        }
        zzag zzag = (zzag) obj;
        int f = mo53672f();
        int f2 = zzag.mo53672f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo53306z(zzag, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo53312i(int i, int i2, int i3) {
        return zzbd.m63342c(i, this.zzen, mo53309B(), i3);
    }

    /* renamed from: j */
    public final zzw mo53313j(int i, int i2) {
        int n = zzw.m63866n(0, i2, size());
        if (n == 0) {
            return zzw.f45474a;
        }
        return new zzz(this.zzen, mo53309B(), n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo53314k(Charset charset) {
        return new String(this.zzen, mo53309B(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo53315l(zzt zzt) throws IOException {
        zzt.mo53354a(this.zzen, mo53309B(), size());
    }

    /* renamed from: q */
    public byte mo53316q(int i) {
        return this.zzen[i];
    }

    public int size() {
        return this.zzen.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public byte mo53318u(int i) {
        return this.zzen[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo53306z(zzw zzw, int i, int i2) {
        if (i2 > zzw.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzw.size()) {
            int size2 = zzw.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzw instanceof zzag)) {
            return zzw.mo53313j(0, i2).equals(mo53313j(0, i2));
        } else {
            zzag zzag = (zzag) zzw;
            byte[] bArr = this.zzen;
            byte[] bArr2 = zzag.zzen;
            int B = mo53309B() + i2;
            int B2 = mo53309B();
            int B3 = zzag.mo53309B();
            while (B2 < B) {
                if (bArr[B2] != bArr2[B3]) {
                    return false;
                }
                B2++;
                B3++;
            }
            return true;
        }
    }
}
