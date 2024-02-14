package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahd {

    /* renamed from: e */
    private static final byte[] f24528e = {0, 0, 1};

    /* renamed from: a */
    private boolean f24529a;

    /* renamed from: b */
    public int f24530b;

    /* renamed from: c */
    public int f24531c;

    /* renamed from: d */
    public byte[] f24532d = new byte[128];

    public zzahd(int i) {
    }

    /* renamed from: a */
    public final void mo41472a(byte[] bArr, int i, int i2) {
        if (this.f24529a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f24532d;
            int length = bArr2.length;
            int i4 = this.f24530b + i3;
            if (length < i4) {
                this.f24532d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f24532d, this.f24530b, i3);
            this.f24530b += i3;
        }
    }

    /* renamed from: b */
    public final void mo41473b() {
        this.f24529a = false;
        this.f24530b = 0;
        this.f24531c = 0;
    }

    /* renamed from: c */
    public final boolean mo41474c(int i, int i2) {
        if (this.f24529a) {
            int i3 = this.f24530b - i2;
            this.f24530b = i3;
            if (this.f24531c == 0 && i == 181) {
                this.f24531c = i3;
            } else {
                this.f24529a = false;
                return true;
            }
        } else if (i == 179) {
            this.f24529a = true;
        }
        mo41472a(f24528e, 0, 3);
        return false;
    }
}
