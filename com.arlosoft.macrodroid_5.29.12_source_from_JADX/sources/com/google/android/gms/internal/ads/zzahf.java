package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahf {

    /* renamed from: f */
    private static final byte[] f24550f = {0, 0, 1};

    /* renamed from: a */
    private boolean f24551a;

    /* renamed from: b */
    private int f24552b;

    /* renamed from: c */
    public int f24553c;

    /* renamed from: d */
    public int f24554d;

    /* renamed from: e */
    public byte[] f24555e = new byte[128];

    public zzahf(int i) {
    }

    /* renamed from: a */
    public final void mo41475a(byte[] bArr, int i, int i2) {
        if (this.f24551a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f24555e;
            int length = bArr2.length;
            int i4 = this.f24553c + i3;
            if (length < i4) {
                this.f24555e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f24555e, this.f24553c, i3);
            this.f24553c += i3;
        }
    }

    /* renamed from: b */
    public final void mo41476b() {
        this.f24551a = false;
        this.f24553c = 0;
        this.f24552b = 0;
    }

    /* renamed from: c */
    public final boolean mo41477c(int i, int i2) {
        int i3 = this.f24552b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f24553c -= i2;
                            this.f24551a = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        zzdw.m48255e("H263Reader", "Unexpected start code value");
                        mo41476b();
                    } else {
                        this.f24554d = this.f24553c;
                        this.f24552b = 4;
                    }
                } else if (i > 31) {
                    zzdw.m48255e("H263Reader", "Unexpected start code value");
                    mo41476b();
                } else {
                    this.f24552b = 3;
                }
            } else if (i != 181) {
                zzdw.m48255e("H263Reader", "Unexpected start code value");
                mo41476b();
            } else {
                this.f24552b = 2;
            }
        } else if (i == 176) {
            this.f24552b = 1;
            this.f24551a = true;
        }
        mo41475a(f24550f, 0, 3);
        return false;
    }
}
